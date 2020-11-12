-- 2020.11.12

-- DDL

-- 테이블 생성 : 
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
    
    
-- create table ~as ~ : 테이블 복사! but 제약조건은 복사되지 않는다.
-- CREATE TABLE 명령어 다음에 컬럼을 일일이 정의하는 대신 
-- AS 절을 추가하여 EMP 테이블과 동일한 내용과 구조를 갖는
-- EMP02 테이블을 생성해 봅시다.
CREATE TABLE EMP02 AS SELECT * FROM EMP;
desc emp02
desc emp