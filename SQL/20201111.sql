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


