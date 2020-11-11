-- 2020.11.11

-- JOIN (조인)

-- CROSS JOIN 크로스 조인 : 조건 없이 테이블과 테이블을 붙여준다
-- 단순하게 붙여주는 것이라 아무 의미가 없다.
select *
from emp, dept;


-- EQUI JOIN
-- 동일 칼럼을 기준으로 조인합니다.
SELECT *
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO;

-- SCOTT의 사원번호와 이름, 부서이름, 지역을 출력하자
SELECT empno, ename, dname, loc, dept.deptno -- deptno만 쓰면 오류남 or emp.deptno
-- emp.empno, emp.ename, dept.dname, dept.loc, dept(emp).deptno로 쓰는 것이 사실 맞음
FROM emp, dept
where ename='SCOTT' AND emp.deptno=dept.deptno
;

-- 별칭
-- 테이블의 이름이 긴경우.
SELECT e.empno, e.ename, d.dname, d.loc, d.deptno
FROM emp e, dept d
where ename='SCOTT' AND e.deptno=d.deptno
;

-- NON-EQUI JOIN : 동등비교가 아닌 비교연산이 가능
-- 급여 등급을 5개로 나누어 놓은 salgrade에서 정보를 얻어 와서 
-- 각 사원의 급여 등급을 지정해보도록 합시다. 
-- 이를 위해서 사원(emp) 테이블과 급여 등급(salgrade) 테이블을 조인하도록 합시다.
select e.ename, e.sal, s.grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal
;


-- SELF JOIN : 자신의 테이블을 조인
-- SMITH의 매니저 이름이 무엇인지 알아내려면 어떻게 구해야 할까요?

select ename, mgr
from emp
where ename='SMITH'
;

-- +
select ename, mgr
from emp
where empno=7902
;


-- =

select e.ename, e.mgr, m.ename as MGRNAME
from emp e, emp m
where e.mgr=m.empno AND e.ename='SMITH'
;



-- outer join : 정보가 부족해도 출력하도록 하는 join

select e.ename, e.mgr, m.ename as MGRNAME
from emp e, emp m
where e.mgr=m.empno(+)
;



-- ANSI JOIN : CROSS JOIN
select *
from emp cross join dept
;


-- INNER JOIN 

--SELECT ename, dname
--FROM emp, dept
--where ename='SCOTT' AND emp.deptno=dept.deptno
--;

SELECT ENAME, DNAME 
FROM EMP INNER JOIN DEPT 
ON EMP.DEPTNO=DEPT.DEPTNO 
WHERE ENAME='SCOTT';


-- USING
select *
from emp join dept
-- on emp.deptno=dept.deptno
using (deptno) 
-- 공통 컬럼은 하나만 가지게 해준다. 공통 컬럼을 구별할 필요가 없다
;



-- NATURAL JOIN : 동일 컬럼 조인의 조건을 생략
-- 같은 이름의 컬럼은 하나씩 존재해야 한다.
select *
from emp NATURAL JOIN dept
;

-- ansi outer join
-- table1 [LEFT | RIGHT | FULL ] outer join table2

select *
from emp e left outer join emp m
on (e.mgr=m.empno)
;

-- 회원 구매
-- customer, orders

select * from customer;
select * from orders order by custid;

select *
from customer c left outer join orders o
on (c.custid=o.custid)
;

-- 회원별 구매횟수
select c.name, count(o.orderid), sum(o.saleprice), round(avg(o.saleprice))
from customer c, orders o
where c.custid=o.custid(+)
group by c.name
;



----------------------------------------------------------------------

-- 서브쿼리


--스칼라 부속질의 – SELECT 부속질의, || 단일행 단일열
--인라인 뷰 – FROM 부속질의         || 복합행 복합열 (단일도가능)
--중첩질의 – WHERE 부속질의         || 단일열, 단순비교>단일행

-- 중첩질의 : 단순비교 

--평균 급여를 구하는 쿼리문을 서브 쿼리로 사용하여
--평균 급여보다 더 많은 급여를 받는 사원을 검색

select *
from emp        -- ↓ 평균급여
where sal > (select avg(sal)from emp)    
;

-- SCOTT 사원의 같은 부서에 근무하는 사원의 리스트를 출력
select deptno from emp where ename='SCOTT'; --20

select ename, deptno from emp 
where deptno=(select deptno from emp where ename='SCOTT');

-- sal>3000이상 받는 사원이 소속된 부서
select distinct deptno from emp where sal >=3000;

select *
from emp
--where deptno=10 or deptno=20
where deptno in (select distinct deptno from emp where sal >=3000)
;




--30번 소속 사원들 중에서 급여를 가장 많이 받는 사원보다
--더 많은 급여를 받는 사람의 이름, 급여를 출력하는 쿼리문을 작성해 봅시다.
select sal from emp where deptno=30;

select ename, sal from emp 
where sal> all (select sal from emp where deptno=30);
-- 모든게 다 만족해야할 때




--다음은 부서번호가 30번인 사원들의 급여 중
--가장 작은 값(950)보다 많은 급여를 받는 사원의 이름,
--급여를 출력하는 예제를 작성해 봅시다.
select ename, sal from emp 
where sal> any (select sal from emp where deptno=30);





-- ROWNUM #입력순 (로우넘 날짜순X)
select rownum, empno, ename, hiredate
from emp
order by hiredate
;

-- 기준에 맞춰 몇개 뽑아내기
select rownum, empno, ename, hiredate
from emp
where rownum<4
order by hiredate
;

select rownum, empno, ename, hiredate from emp order by hiredate
;

-- ROWNUM 날짜순 O
select rownum, empno, ename, hiredate
from (select rownum, empno, ename, hiredate from emp order by hiredate desc)
where rownum<4 -- 입사일이 제일 최근인 세명 (desc)
;

-- 가장 급여를 많이 받는 사원 3명을 출력하자
select rownum, ename, sal from emp order by sal desc;
select rownum, ename, sal 
from(select rownum, ename, sal from emp order by sal desc)
where rownum<4
;

-- 부속질의

-- 스칼라 부속질의 / select 부속질의,
-- 단일행, 단일열, 단일값의 결과가 나와야한다.

select name from customer where custid=1;

select custid, (select name from customer where customer.custid=orders.custid),
        saleprice, orderdate
from orders
;


--마당서점의 고객별 group by
-- 판매액을 보이시오 orders
-- (결과는 고객이름과 고객별 판매액을 출력).

select c.custid, c.name, sum(o.saleprice)
from customer c, orders o
where c.custid=o.custid(+)
group by c.custid, c.name
order by sum(o.saleprice)
;

select o.custid, (
    select name from customer c where o.custid=c.custid),
sum(o.saleprice)
from orders o
group by o.custid
;



-- 인라인 뷰 / from 부속질의

--질의 고객번호가 2 이하인 고객의 판매액을 보이시오 
--(결과는 고객이름과 고객별 판매액 출력)
select custid, name
from customer
where custid<=2
; -- 가상테이블

select cs.name, sum(o.saleprice)
from (select custid, name
from customer
where custid<=2) cs , orders o
where cs.custid=o.custid
group by cs.name
;


-- 중첩질의 – WHERE 부속질의
-- 평균 주문금액 이하의 주문에 대해서 주문번호와 금액을 보이시오.
select orderid, saleprice
from orders
where saleprice < (select avg(saleprice) from orders)
;

-- 각 고객의 평균 주문금액보다 
-- 큰 금액의 주문 내역에 대해서
-- 주문번호, 고객번호, 금액을 보이시오.
select avg(saleprice) 
from orders
group by custid
;


select o.orderid, o.custid, o.saleprice, c.name
from orders o, customer c
where saleprice >
(select avg(saleprice) 
from orders
o2 where o.custid=o2.custid)
AND (o.custid=c.custid)
;


--대한민국에 거주하는 고객에게 판매한 도서의 총판매액을 구하시오.

select sum(saleprice)
from orders
where custid in (select custid from customer where address LIKE '%대한민국%')
;

--3번 고객이 주문한 도서의 최고 금액보다 
--더 비싼 도서를 구입한 주문의 주문번호와 금액을 보이시오.

select orderid, saleprice
from orders
-- where saleprice > (select max(saleprice) from orders where custid=3);
where saleprice > all(select saleprice from orders where custid=3)
;

-- EXISTS 연산자로 대한민국에 거주하는 고객에
-- 판매한 도서의 총 판매액을 구하시오.  

select * from customer where address LIKE '%대한민국%';

select sum(saleprice)
from orders o
where EXISTS (select * from customer c where address LIKE '%대한민국%' AND o.custid=c.custid)
;