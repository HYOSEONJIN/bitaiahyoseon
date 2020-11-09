--2020.11.09
--select 기본

-- scott 계정으로 로그인
-- scott 계정이 소유한 테이블 객체를 확인
-- : tab > 테이블의 정보를 알려주는 데이터 딕셔너리
select*from tab;

-- DESC : 테이블 구조 확인
-- 테이블의 데이터를 검색하기 전 구조를 확인할 때
DESC emp;
desc dept;

select hiredate from emp;


-- 데이터의 조회 명령 : select
-- SELECT의 컬럼명,... FROM 테이블 이름(조회의대상) > 기본 문법
-- SELECT의 결과는 > TABLE이다.

SELECT
    *         -- 컬럼 이름들을 기술해준다. 기술하는 순서에 따라 결과도 순서에 맞게 출력이 된다.
FROM emp      -- 조회하고자 하는 테이블 이름을 기술 
;             --- SQL의 종료



-- 부서 테이블의 모든 데이터를 조회하자
SELECT  *
FROM dept
;


-- 부서테이블에서 > FROM
-- 부서의 이름과 위치를 출력 > SELECT

SELECT  dname, loc
FROM dept
;

SELECT  loc, dname
FROM dept
;

-- 모든 사원의 정보를 출력하자
SELECT    *
FROM emp
;

-- 사원의 이름, 사번, 직급(직무)를 포함하는 리스트 출력
SELECT ename, empno, job
FROM emp
;

-- SELECT 절의 컬럼의 사칙연산
-- 임시테이블 dual : 컬럼은 x를 가지는 테이블
select 100+200, 200-100, 100*10, 100/10
from dual
;
SELECT ename, sal, sal*12
FROM emp
;


-- 연봉의 꼐산을 sal*12+comm으로 계산하자
SELECT ename, sal, sal*12, comm, sal*12+comm
FROM emp
;

-- null : 값은 존재하나 정해지지 않은 값
-- 연산이 불가 : 사칙/비교 연산

-- nvl 함수 : 컬럼의 값이 nulㅣ 일때 대체값으로 치환해준다.
-- nvl(컬럼, 대체값) 컬럼과 같은 타입의 대체값

select ename, comm, sal*12+comm,nvl(comm, 0), sal*12+nvl(comm, 0)
from emp;

-- 데이터 베이스 sql 내부의 문자열 처리는 대부분 ''
-- 별칭 처리는 "" but 에러날 수 있으니 영문처리 하자

select ename, comm, sal*12+comm sall2, nvl(comm, 0) as com, sal*12+nvl(comm, 0) "12개월 연봉"
from emp;

-- Concatenation 연산자의 정의와 사용
select ename || ' is a ' || job as "||연산자"
from emp;


-- DISTINCT 중복되는것을 생략해준다
-- DISTINCT 뒤에는 다른 컬럼을 쓸 수 없다!
select distinct deptno
from emp;

