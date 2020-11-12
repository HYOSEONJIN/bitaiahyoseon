-- 2020.11.12

-- DDL

---------- 테이블 생성 : 
-- create table table_name
-- (
--     column_name domain [constraint] 제약/선택적,
--     column_name domain [constraint],
--     column_name domain [constraint],
--     ...
--   )

create table test_tbl (
        no              number(4),
        user_name       varchar2(10),
        user_id         varchar2(16),
        user_password   varchar2(12),
        reg_date        Timestamp DEFAULT sysdate
    );

desc test_tbl;


-- 사원 테이블과 유사한 구조의 사원번호, 사원이름, 급여 3개의 칼럼으로 구성된
-- emp01 테이블을 생성해 보자.
create table emp01(
        empno number(4),
        ename varchar2(10),
        sal   number(7,2)
    );
    
    
---------- create table ~as ~ : 테이블 복사! but 제약조건은 복사되지 않는다.

-- CREATE TABLE 명령어 다음에 컬럼을 일일이 정의하는 대신 
-- AS 절을 추가하여 EMP 테이블과 동일한 내용과 구조를 갖는
-- EMP02 테이블을 생성해 봅시다.
CREATE TABLE EMP02 AS SELECT * FROM EMP;
desc emp02;
desc emp;


--서브 쿼리문의 SELECT 절에 * 대신
--원하는 컬럼명을 명시하면 기존 테이블에서 일부의 컬럼만 복사할 수 있습니다.
create table emp03
as
select empno, ename, sal from emp
;

desc emp03;

--서브 쿼리문의 SELECT 문을 구성할 때
-- WHERE 절을 추가하여 원하는 조건을 제시하면 기존 테이블에서 일부의 행만 복사합니다.

create table emp04
as
select * from emp where deptno=10
;
select * from emp04;


-- 테이블의 구조만 복사하는 것은 별도의 명령이 있는 것이 아닙니다. 
--이 역시 서브 쿼리를 이용해야 하는데 WHERE 조건 절에 항상 거짓이 되는 조건을 지정하게 되면 
--테이블에서 얻어질 수 있는 로우가 없게 되므로 빈 테이블이 생성되게 됩니다

create table emp05
as
select * from emp where 1=2
;
select * from emp05;

-- selec * from tab; 현재 가진 테이블 보기

---------- 테이블 삭제 : 저장공간을 삭제, 저작되어있는 데이터도 모두 삭제
drop table test_tbl;

-- 모든 로우를 제거하는 truncate : 바로삭제!
create table emp06
as
select * from emp;
select * from emp06;

truncate table emp06;


---------- 테이블 이름변경
-- rename old_name to new_name;
rename emp06 to new_emp;




----------  ALTER TABLE : 테이블 구조의 변경
-- alter table table_name 
-- add (컬럼추가) | modify(컬럼변경) | drop(컬럼삭제) ();

-- 기존 테이블에 속성을 추가 : 각 행의 컬럼 데이터는 null값
-- emp01에  job 컬럼을 추가. (varchar2(10)
desc emp01;

alter table emp01 
add(JOB varchar2(10));
alter table emp01 
add(deptno number(2));


-- 기존 테이블의 컬럼 변경 modify 
-- 새롭게 정의된 컬럼으로 교체하는 것

alter table emp01
modify (deptno number(10));

-- 기존 테이블의 컬럼을 삭제 : 데이터도 사라진다
alter table emp01
drop (deptno);

