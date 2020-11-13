-- 2020.11.13

-- 트랜잭션(Transaction)
-- 여러개의 sql을 하나의 단위로 처리하는 것
-- 트랜잭션이 가지는 모든 작업이 모두 정상처리 되어야 트랜잭션이 완료되었다고 하는것

truncate table emp10;
insert into emp10
select * from emp;
commit;
 
select * from emp10;
select * from dept01;

-- 부서 테이블에 데이터 하나를 저장 - 정상
-- 사원 테이블에 새로운 사원을 입력 - 오류

insert into dept01 values (50, 'RD', 'SEOUL');
insert into emp10(empno, ename, job, sal) values ('ten', 'TEN', 'MANAGER', 2500);
rollback; -- 오류가 발생해서 초기화 (마지막저장단계 commit단계로 이동)

-- 새로운 트랜잭션 시작
insert into dept01 values (50, 'RD', 'SEOUL');
insert into emp10(empno, ename, job, sal) values (7777, 'TEN', 'MANAGER', 2500);
select * from emp10;
select * from dept01;
commit;

-- 새로운 트랜잭션 시작
update emp10
set mgr=(select empno from emp10 where ename='KING');
-- 잘못처리된 작업이라고 하면, rollback;
rollback;







-- 가상 테이블 view
-- 실제테이블을 기반으로 논리적인 가상테이블을 만드는 것 > view
-- create view view_name as subquery


-- 자주 사용되는 30번 부서에 소속된 사원들의 사번과 이름과 부서번호를 
-- 출력하기 위한 SELECT문을 하나의 뷰로 정의해 봅시다.
create view view_emp30
as select empno, ename, deptno from emp where deptno=30;

select * from view_emp30;




-- 전 사원에 대한 정보 출력 (사원정보, 부서정보)
select *
from emp, dept
where emp.deptno=dept.deptno
;

-- deptno가 두개라서 하나만 보이게 하려고 다써줌 ㅠ
-- 두개 테이블을 join한 것은 insert가 불가능
create or replace view view_emp_dept
as
select empno, ename, job, mgr, hiredate, sal, comm, emp.deptno, dname, loc
from emp, dept where emp.deptno=dept.deptno;

select * from view_emp_dept;
select * from view_emp_dept where deptno=10;



-- view 정보 확인 : user_views 테이블을 통해 확인이 가능
-- 로그인한 사용자의 view 인스턴스의 정보
select * from user_views;
select view_name, text from user_views;


-- view_emp30을 통해 insert
insert into view_emp30 values (9999, 'tester', 40);

desc emp;
select * from emp;
rollback;

-- view의 삭제 : 객체를 삭제하는 방식과 동일
-- drop

drop view view_emp_dept;


-- view_hire : 입사일 기준으로 오름차순으로 정렬된 결과를 가상테이블로 정의

select empno, ename, hiredate from emp order by hiredate;

create or replace view view_hiredate
as
select empno, ename, hiredate from emp order by hiredate
;

select rownum, empno, ename, hiredate from view_hiredate;

select * from view_hiredate where rownum<=5;


-- 인라인 뷰를 이용해서 가장 최근에 입사한 사원 5명을 추출
select *
from (select * from emp order by hiredate desc)
where rownum<=5
;

select * from emp order by hiredate desc

