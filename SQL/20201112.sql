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

    --------- ALER TABLE
    -- 테이블 삭제 : 저장공간을 삭제, 저작되어있는 데이터도 모두 삭제
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
    

---------- 제약조건 정의
-- insert into dept values(10,'test','seoul');
-- 무결성제약 조건에 위배됩니다
desc emp01;
insert into emp01 values(null, null, 1000, 'tester');
select * from emp01;

-- emp01 삭제
drop table emp01;


-- 필수 입력을 위한 제약 조건 :bNOT null 
-- emp01 테이블 생성 : empno, ename에 null값이 들어가지 않도록 제약
create table emp01(
        empno   number(4)       not null,
        ename   varchar2(10)    not null,
        job     varchar(9),
        deptno  number(2)
        );
insert into emp01 values(null, null, 'tester', '10');
-- ORA-01400: NULL을 ("SCOTT"."EMP01"."EMPNO") 안에 삽입할 수 없습니다


-- 데이터의 중복 금지 : UNIQUE
drop table emp02;
create table emp02(
    empno  number(4)    unique,
    ename  varchar2(9),
    deptno number(2)
);
insert into emp02 values(1, 'tester', '10');
insert into emp02 values(1, 'tester2', '10');
-- ORA-00001: 무결성 제약 조건(SCOTT.SYS_C0011060)에 위배됩니다.

-- empno가 not null과 unique 제약을 동시에 적용
drop table emp03;
create table emp03(
    empno   number(4)   not null unique,
    ename  varchar2(9) not null
);

insert into emp03 values(null, 'test1');
insert into emp03 values(1, 'test1');
insert into emp03 values(2, 'test1');
select * from emp03;

 
-- 기본키 제약 : 기본키 설정 > not null, unique
drop table emp04;
create table emp04(
        empno number(4) primary key,
        ename varchar2(10) not null
    );
    
insert into emp04 values(null, 'test'); -- null 에러
insert into emp04 values(1, 'test');
insert into emp04 values(1, 'test'); -- 무결성제약조건 에러

-- 외래키 제약 : 참조하는 테이블과 컬럼을 정의 (reference's')
drop table emp05;
create table emp05(
    empno number(4) primary key,
    ename varchar2(10) not null,
    deptno number(2) references dept(deptno)
);
-- emp05의 deptno테이블에는 emp테이블의 dept에 있는 값만 들어갈 수있다
-- 즉 10,20,30만 들어갈 수 있다. (40,50 X)

insert into emp05 values(1, 'test', 10);
insert into emp05 values(1, 'test', 40); -- 40X 무결성 에러


-- check : 특정 범위 제한 
create table emp06 (
    empno   number(4)       primary key,
    ename   varchar2(10)    not null,
    sal     number(7,2)        check (sal>=800)
);

insert into emp06 values (1, 'test', 1000);
insert into emp06 values (2, 'test', 100); -- 체크 제약조건 위배