--43. ��� ��ȣ�� 7788�� ����� ��� ������ ���� ����� ǥ��(��� �̸��� ������)�Ͻÿ�.

select * from emp where empno=7788;
select * from emp where job=(select job from emp where empno=7788);

-- 44. �����ȣ�� 7499�� ������� �޿��� ���� ����� ǥ���Ͻÿ�.
-- ����̸��� ���� ����

SELECT sal from emp where empno=7499;
select ename, job from emp where sal>(SELECT sal from emp where empno=7499);

--45. �ּұ޿��� �޴� ����� �̸�, ������ �� �޿��� ǥ���Ͻÿ�. (�׷��Լ� ���)
select min(sal) from EMP;
select ename, job from emp where sal=(select min(sal) from EMP);
select ename, job from emp where sal<= all (select sal from EMP);



--46. ��ձ޿��� ���� ���� ������ ���� �̸��� ������ ����� ���Ͻÿ�.
--1)
select job, pg
from (select job, avg(sal) as pg from emp group by job order by pg)
where rownum=1
;

--2)
select job, avg(sal) from emp group by job;
select job, avg(sal) from emp group by job
having avg(sal) <= all (select avg(sal) from emp group by job);


--47. �� �μ��� �ּ� �޿��� �޴� �����
--�̸�, �޿�,�μ���ȣ�� ǥ���Ͻÿ�.

--1)
select e.ename, e.sal, e.deptno
from emp e, (select min(sal) as minsal from emp group by deptno) aa
where e.sal=aa.minsal
;

--2)
select deptno, min(sal) from emp where deptno=10 GROUP by deptno;

select ename, sal, deptno from emp e1 
where sal=(select min(sal) from emp e2 
where e2.deptno=e1.deptno group by e2.deptno);



--48. �������� ANALYST �� ������� �޿��� �����鼭 
--������ ANALYST�� �ƴ� ������� ǥ��
--(�����ȣ, �̸�, ��� ����, �޿�)�Ͻÿ�.

--1)
select e.empno, e.ename, e.job, e.sal 
from emp e 
where sal < all (select sal from emp where job='ANALYST');

--2)
select Distinct sal from emp where job='ANALYST';
select empno, ename, job, sal from emp 
where sal <= all (select Distinct sal from emp where job='ANALYST') 
AND JOB !='ANALYST';




--49. ���������� ���� ����� �̸��� ǥ���Ͻÿ�.
--1)
select e.ename
from emp e
where e.ename NOT in(select e.ename from emp p, emp e where p.mgr=e.empno group by e.ename);

--2)
select distinct mgr from emp where mgr is not null; 
select ename from emp where empno not in (select distinct mgr from emp where mgr is not null);




--50. ���������� �ִ� ����� �̸��� ǥ���Ͻÿ�.
-- 1)
select e.ename from emp p, emp e where p.mgr=e.empno group by e.ename;

--2)
select ename from emp where empno in (select distinct mgr from emp where mgr is not null);




--51. BLAKE�� ������ �μ��� ���� ����� �̸��� �Ի����� ǥ���ϴ� ���Ǹ� �ۼ��Ͻÿ�. ( �� BLAKE�� ���� )
--1)
select e.ename, e.hiredate
from emp e
where e.deptno=(select deptno from emp where ename='BLAKE') AND NOT e.ename='BLAKE';

--2)
select deptno, ename from emp where ename='BLAKE';
select * from emp where deptno = (select deptno from emp where ename='BLAKE')
AND ename!='BLAKE';



--52. �޿��� ��� �޿����� ���� ������� ��� ��ȣ�� �̸��� ǥ���ϵ� ����� �޿��� ���ؼ� ������������ �����Ͻÿ�.
--1)
select e.empno, e.ename
from emp e
where e.sal > (select avg(sal) from emp)
order by sal;
--2)
select avg(sal) from emp;
select empno, ename from emp 
where sal > (select avg(sal) from emp)
order by sal;


--53. �̸��� K�� ���Ե� ����� ���� �μ����� ���ϴ� ����� ��� ��ȣ�� �̸��� ǥ���Ͻÿ�.
select e.empno, e.ename
from emp e
where e.deptno IN (select distinct deptno from emp where ename LIKE '%K%');


--54. �μ���ġ�� DALLAS�� ����� �̸��� �μ���ȣ �� �������� ǥ���Ͻÿ�.
select e.ename, e.deptno, e.job
from emp e, dept d
where e.deptno=d.deptno AND d.loc='DALLAS'
;

select e.ename, e.deptno, e.job
from emp e
where e.deptno=(select deptno from dept where loc='DALLAS')
;

--55. KING���� �����ϴ� ����� �̸��� �޿��� ǥ���Ͻÿ�.
select e.ename, e.sal
from emp e
where e.mgr=(select empno from emp where ename='KING')
;

--56. RESEARCH �μ��� ����� ���� �μ���ȣ, ����̸� �� ��� ������ ǥ���Ͻÿ�.
select e.deptno, e.ename, e.job
from emp e
where e.deptno=(SELECT deptno from dept where dname='RESEARCH')
;



--57. ��� ���޺��� ���� �޿��� �ް� 
--�̸��� M�� ���Ե� ����� ���� �μ����� �ٹ��ϴ� ����� 
--��� ��ȣ, �̸�, �޿��� ǥ���Ͻÿ�.
select e.empno, e.ename, e.sal
from emp e
where e.sal>(select avg(sal) from emp) 
AND e.deptno IN (select deptno from emp where ename LIKE '%M%')
;

--2)
select avg(sal) from emp;
select distinct deptno from emp where ename LIKE '%M%';

select empno, ename, SAL from EMP
where sal > (select avg(sal) from emp)
AND deptno in (select deptno from emp where ename LIKE '%M%');


--58. ��ձ޿��� ���� ���� ������ ã���ÿ�.
select job
from (select job, avg(sal) as pg from emp group by job order by pg)
where rownum=1
;

--2)
select job, avg(sal) from emp group by job 
having avg(sal) <= all (select avg(sal) from emp group by job);

--59. �������� MANAGER �� ����� �Ҽӵ� �μ��� ������ �μ��� ����� ǥ���Ͻÿ�.
select e.ename
from emp e
where e.deptno in (select deptno from emp where job='MANAGER')
;