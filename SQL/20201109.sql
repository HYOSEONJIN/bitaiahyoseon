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


-- 연봉의 계산을 sal*12+comm으로 계산하자
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


-- 특정 데이터를 추출하는 where 절
-- select 컬럼명 from 테이블명 where 조건


-- 급여가 3000 이상인 사원의 리스트를 출력하자
select ename, job, sal
from emp
where sal >=3000
;

select ename, job, sal
from emp
where sal>4000
;

-- 10번 부서에 소속된 사원들의 리스트 출력
SELECT    *
FROM emp
where deptno=10
;

-- 문자 데이터 조회 '' 안의 대문자 소문자 구분함
SELECT empno, ename, sal
FROM emp
where ename = 'FORD'
;

-- 날짜 데이터 조회
SELECT *
FROM emp
where hiredate='81/11/17'
;


-- AND 연산자
-- 10번 부서 소속인 사원들 중에서
-- 직급이 MANAGER인 사람을 검색하여 사원명, 부서번호, 직급을 출력
SELECT ename, deptno, job
FROM EMP
WHERE DEPTNO=10 AND JOB='MANAGER';

-- OR 연산자
-- 10번 부서에 소속된 사원이거나
-- 직급이 MANAGER인 사람을 검색하여 사원명, 부서번호, 직급을 출력합시다.
SELECT ename, deptno, job
FROM emp
where deptno=10 OR JOB='MANAGER';

-- NOT 연산자
-- 부서번호가 10번이 아닌 사원의 이름, 부서번호, 직급을 출력
SELECT ename, deptno, job
FROM emp
WHERE NOT deptno=10;

-- BETWEEN 연산자 (column_name BETWEEN A AND B)
-- 2000에서 3000 사이의 급여를 받는 사원
SELECT *
FROM EMP
WHERE SAL>=2000 AND SAL<=3000;
--1987년에 입사한 사원을 출력
SELECT *
FROM EMP
-- WHERE HIREDATE >= '1987/01/01' AND HIREDATE <= '1987/12/31';
WHERE HIREDATE BETWEEN '1987/01/01' AND '1987/12/31';

-- IN 연산자
-- 커미션이 300이거나 500 이거나 1400인 사원 검색
SELECT *
FROM emp
-- where comm=300 or comm=500 or comm=1400
where comm in(300,500,1400);



-- LIKE연산자 ( column_name LIKE pattern )
-- 와일드카드(%) 사용하기
-- F로 시작하는 사람 찾기
SELECT *
FROM emp
WHERE ename LIKE 'F%';
-- D로 끝나는 사람 찾기
SELECT *
FROM emp
WHERE ename LIKE '%D';
-- 이름중에 A가 들어간 사람 찾기
SELECT *
FROM emp
WHERE ename LIKE '%A%';

-- 와일드카드(_) 사용하기
-- _는 한문자에 대해서만 와일드카드 역할을 한다.
-- 이름의 두번째 글자가 A인 사람
SELECT *
FROM emp
WHERE ename LIKE '_A%';

-- NOT LIKE
-- 이름에 A가 들어가지 않는 사람 찾기
SELECT *
FROM emp
WHERE ename NOT LIKE '%A%';


-- 찾으려는 이름이 F로 시작 하는 것은 알지만 그 뒤의 문자는 모를 경우
select *
from emp
-- where ename like 'F%' --F로 시작하고 뒤는 어떤 문자가 와도 상관 없음
-- where ename like '%S' --F로 시작하고 뒤는 어떤 문자가 와도 상관 없음
-- where ename like '%A%'   -- 이름에 A문자를 포함하는 이름을 검색
-- where ename like '_A%' -- 첫 번째 문자는 어떤 문자든 상관없고 두 번째 자리는 반드시 A가 오는 이름 검색
where ename like '__R%' -- 첫번째 세번째 문자는 아무거나 상관없고 세 번째 자리에 R이 오는 이름 검색.
-- 000000-1000000 >  '_______1%' = 주민등록번호에서 남자찾기
-- '1987/12/18' > '_____12%' = 생일이 12월인 사람 찾기
;

-- 커미션을 받지 않는 사원 검색
SELECT *
from emp
where comm is null or comm=0
;

-- 커미션을 받는 사원 검색
SELECT *
from emp
where comm is not null and comm>0
;


-- 숫자

-- 급여의 오름차순 정렬 / 작은수>>>큰수
SELECT *
FROM emp
ORDER BY sal -- asc; 생략 가능 / 오름차순이 default
;

-- 급여의 내림차순 정렬 / 큰수>>>작은수
SELECT *
FROM emp
ORDER BY sal desc;

SELECT *
FROM emp
ORDER BY comm -- null 값은 맨 아래로 내려간다 (가장큰수마냥..)
;


-- 문자 [a>z가 디폴트]
SELECT *
FROM emp
ORDER BY comm -- null 값은 맨 아래로 내려간다 (가장큰수마냥..)
;



-- 날짜 [오래됨 > 최근이 디폴트]
SELECT *
FROM emp
ORDER BY hiredate desc
;


-- 중복

SELECT *
FROM emp
ORDER BY hiredate desc, sal -- sal은 작은 순서로 [jame/ford\
;


