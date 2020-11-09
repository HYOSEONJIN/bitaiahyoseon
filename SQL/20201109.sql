--2020.11.09
--select �⺻

-- scott �������� �α���
-- scott ������ ������ ���̺� ��ü�� Ȯ��
-- : tab > ���̺��� ������ �˷��ִ� ������ ��ųʸ�
select*from tab;

-- DESC : ���̺� ���� Ȯ��
-- ���̺��� �����͸� �˻��ϱ� �� ������ Ȯ���� ��
DESC emp;
desc dept;

select hiredate from emp;


-- �������� ��ȸ ��� : select
-- SELECT�� �÷���,... FROM ���̺� �̸�(��ȸ�Ǵ��) > �⺻ ����
-- SELECT�� ����� > TABLE�̴�.

SELECT
    *         -- �÷� �̸����� ������ش�. ����ϴ� ������ ���� ����� ������ �°� ����� �ȴ�.
FROM emp      -- ��ȸ�ϰ��� �ϴ� ���̺� �̸��� ��� 
;             --- SQL�� ����



-- �μ� ���̺��� ��� �����͸� ��ȸ����
SELECT  *
FROM dept
;


-- �μ����̺��� > FROM
-- �μ��� �̸��� ��ġ�� ��� > SELECT

SELECT  dname, loc
FROM dept
;

SELECT  loc, dname
FROM dept
;

-- ��� ����� ������ �������
SELECT    *
FROM emp
;

-- ����� �̸�, ���, ����(����)�� �����ϴ� ����Ʈ ���
SELECT ename, empno, job
FROM emp
;

-- SELECT ���� �÷��� ��Ģ����
-- �ӽ����̺� dual : �÷��� x�� ������ ���̺�
select 100+200, 200-100, 100*10, 100/10
from dual
;
SELECT ename, sal, sal*12
FROM emp
;


-- ������ ������ sal*12+comm���� �������
SELECT ename, sal, sal*12, comm, sal*12+comm
FROM emp
;

-- null : ���� �����ϳ� �������� ���� ��
-- ������ �Ұ� : ��Ģ/�� ����

-- nvl �Լ� : �÷��� ���� nul�� �϶� ��ü������ ġȯ���ش�.
-- nvl(�÷�, ��ü��) �÷��� ���� Ÿ���� ��ü��

select ename, comm, sal*12+comm,nvl(comm, 0), sal*12+nvl(comm, 0)
from emp;

-- ������ ���̽� sql ������ ���ڿ� ó���� ��κ� ''
-- ��Ī ó���� "" but ������ �� ������ ����ó�� ����

select ename, comm, sal*12+comm sall2, nvl(comm, 0) as com, sal*12+nvl(comm, 0) "12���� ����"
from emp;

-- Concatenation �������� ���ǿ� ���
select ename || ' is a ' || job as "||������"
from emp;


-- DISTINCT �ߺ��Ǵ°��� �������ش�
-- DISTINCT �ڿ��� �ٸ� �÷��� �� �� ����!
select distinct deptno
from emp;

