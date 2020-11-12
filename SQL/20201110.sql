-- 2020.11.10
-- 함수

-- 단일행, 집합 함수

-- 단일행 함수 : 숫자, 문자, 날짜, 변환

desc dual;

-- 숫자함수
select ABS(-15.5) from dual; -- 절대값
select floor(15.7) from dual; -- 소숫점 절삭
select round(-15.8) from dual; -- 정수타입으로 반올림
select round(-15.693, 2) from dual; -- 몇번째 자리까지 표시할 것인지 선택
select log(10, 100 ) from dual; -- 로그값(지수)구해줌
select power(3, 2) from dual; -- 제곱


-- 문자함수

select concat('나는', '손흥민입니다.') from dual; -- 두개붙여줌
select concat('저의 이름은', ename) from emp where job='MANAGER'; -- 응용

select LOWER('ABCD') "Lowercase" from dual;
select lower(ename) from emp;

select lpad('page 1',15,'*') from dual; -- 별표로 가려줌
select rpad('910119-2',14,'*') from dual;

select substr('ABCEDFG',3,4) from dual; -- 3번째부터 4개 자른다
select rpad(substr('910119-2000000',1,8),14,'*') from dual; -- 응용

select Ltrim(' =from=','a') from dual; -- 제거
select Rtrim('    =from=====           ',' ') from dual;
select trim('=' from '=======from=======') from dual;
select trim(' ' from '   =====from====   ') from dual;

select REPLACE('JACK and JUE','J','BL') "Changes" FROM DUAL; -- J를 BL로 변경
select REPLACE('뽀준','준','선') "Changes" FROM DUAL;


-- 날짜함수
select sysdate from dual; -- 오늘날자
select sysdate+21 from dual; --14일 뒤

select add_months(sysdate, 4) from dual; -- 4개월 더해줌
select last_day(sysdate) from dual; -- 이달의 마지막날 알려줌..


-- 변환함수
-- TO_CHAR : 날짜 > 문자, 숫자> 문자로

-- 날짜 >문자
select sysdate from dual;
select sysdate, to_char(sysdate, 'YYYY-MM-DD') "바뀐날짜" from dual;
select sysdate, to_char(sysdate, 'YYYY-MM-DD Day dy')from dual;
select sysdate, to_char(sysdate, 'YYYY-MM-DD Day dy AM PM HH HH24 mi ss') from dual;
select to_char(sysdate, 'YYYY.MM.DD.  HH24:mi:ss') from dual; -- 네이버st


-- 숫자 > 문자
SELECT TO_CHAR (1230000) FROM DUAL;
select to_char(10000.123, 'L000,000.00') from dual;
select to_char(10000, 'L999,999.99') from dual;

select sal, to_char(sal*1100, 'L00,000,000') from emp;
select sal, to_char(sal*1100, 'L99,999,999') from emp;
select ename,sal, to_char(sal*1100*12+nvl(comm,0)*1100, 'L99,999,999') from emp order by sal desc; 


-- 문자 > 날짜
-- 2020.11.01
select TO_DATE('2019/09/05', 'YYYY/MM/DD') from dual;
select TO_DATE('2020.11.01.', 'YYYY.MM.DD.') from dual;
-- 오늘이 2020년 1월 1일에서 몇일이 지났는지 확인해보자 :)
select trunc(sysdate - to_date('20-01-01','YY-MM-DD')) from dual;
-- 내가 몇일을 살았는지..^^..
select trunc(sysdate - to_date('91-01-19','YYYY-MM-DD')) from dual;


-- 문자 > 숫자
select TO_NUMBER('100.00', '999.99') * to_number('10.00', '99.99') from dual; 


-- DECODE 함수 : switch 문과 비슷
-- 사원 이름, 부서번호, 부서이름 출력
select ename, deptno,
decode(deptno,
        10, 'ACCOUTING',
        20, 'RESEARCH',
        30, 'SALES',
        40, 'OPERATIONS')
        as dname
from emp;


-- 8. 직급에 따라 급여를 인상하도록 하자.  (DECODE예제)
-- 직급이 'ANAlYST'인 사원은 5%, 'SALESMAN'인 사원은 10%, 'MANAGER'인 사원은 15%, 
-- 'CLERK'인 사원은 20%인 인상한다.

	select ename, job, sal,
decode(job,
    'ANALYST', sal*1.05,
    'SALESMAN', sal*1.1,
    'MANAGER', sal*1.15,
    'CLERK', sal*1.2)   
     as sal2
from emp
;

-- CASE 함수
select ename, deptno,
    case
        when deptno=10 then 'ACCOUNTING'
        when deptno=20 then 'RESEARCH'
        when deptno=30 then 'SALES'
        when deptno=40 then 'OPERATIONS'
    end as dname
from emp
order by dname
;


-- 그룹함수 : 하나의 행의 컬럼을 대상이 아닌 행의 그룹의 컬럼들을 묶어 그룹화하고 연산하는 함수
-- SUM, AVG, COUNT, MAX, MIN

select 
    sum(sal) as "월 급여 총액",
    to_char(sum(sal), 'L99,999') as "월 급여 총액2",
    round(avg(sal)) as "월 급여 평균",
    count(*) as "사원 수",
    count(comm) as "커미션을 받는 사원수", -- null은 세지 않는다. 0은 셈
    max(sal) as "가장 큰 급여"
from emp
;

select
    sum(comm),
    avg(comm),
    count(comm),
    max(comm),
    min(comm)    
from emp
where comm is not null and comm>0
;

-- 전체행을 구한다
select count(*) as from emp; -- 전체 사원의 수
select count(*) as from emp where job='MANAGER'; -- 매니저의 수
-- 매니저의 수, 평균급여, 최고급여
select count(*), avg(sal), max(sal) from emp where job='MANAGER';

-- 직무의 개수
select count(distinct job) -- 중복제거
from emp
;


------------- 특정 컬럼을 기준으로 그룹핑: Group by 컬럼

select deptno
from emp
group by deptno --order by deptno와 다르다.
;


-- 부서별 평균 월급
select deptno, avg(sal)
from emp
group by deptno
;


-- 각 부서별 인원을 부서별 인원이 많은 수대로 정렬
select deptno, count(*)
from emp
group by deptno
order by count(*) desc
;

-- 각 부서별 인원 및 커미션을 받는 사람.
select deptno, count(*)as "부서인원", count(comm) as"커미션받는사람 수"
from emp
-- where comm is not null and comm>0
group by deptno
order by deptno
;

-- 부서별 급여 최고액과 최소금액, 그리고 그 차이
select deptno, max(sal), min(sal), max(sal)-min(sal) as "차"
from emp
group by deptno
order by deptno
;


------------------  HAVING : 그룹함수에 조건/ 그룹의 결과를 제한
-- 부서별로 그룹지은 후(GROUP BY), 그룹 지어진 부서별 평균 급여가 2000 이상인(HAVING) 
-- 부서번호와 부서별 평균 급여를 출력하는 경우
select deptno, round(avg(sal))
from emp
GROUP by deptno
HAVING avg(sal)>=2000  
-- having not avg(sal)>=2000
;

-- 부서별 급여의 최대값과 최소값을 구하되
-- 최대 급여가 2900이상인 부서만 출력합니다.
select deptno, max(sal), min(sal)
from emp
group by deptno
having max(sal)>=2900
order by deptno
;

 
-- 직무별 지표 : 사원의 수, 급여의 총합, 평균 급여, 최대최소
select job, count(*) || '명' as "사원 수",
            to_char(sum(sal)*1100, 'L99,999,999') as "급여 총합",
            to_char((avg(sal))*1100, 'L99,999,999') as "급여 평균", 
            to_char(max(sal)*1100, 'L99,999,999')as "최대 급여", 
            to_char(min(sal)*1100, 'L99,999,999') as "최소 급여"
from emp
where job != 'PRESIDENT'  
GROUP by job
order by job
;

