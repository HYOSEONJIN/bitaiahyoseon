--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
select * from orders;
select * from customer;
select * from book;
--(5) 박지성이구매한도서의출판사수
select distinct count(*)
from book e, (select bookid from orders where custid=(select custid from customer where name='박지성')) bi
where e.bookid=bi.bookid
;

--(6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이
select b.bookname, b.price, bi.saleprice-b.price as "판매가격-정가"
from book b, (select bookid, saleprice from orders where custid=(select custid from customer where name='박지성')) bi
where b.bookid=bi.bookid
;
--
--(7) 박지성이구매하지않은도서의이름
select b.bookname 
from orders o, book b
where o.custid NOT IN (select custid from customer where name='박지성')
AND o.bookid=b.bookid;



--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.

-- (8) 주문하지않은고객의이름(부속질의사용)
select c.name
from customer c
where c.custid not in (select custid from orders)
;

--(9) 주문금액의총액과주문의평균금액
select sum(saleprice), avg(saleprice)
from orders
;

--(10) 고객의이름과고객별구매액
select cust.name, nvl(sumtable.sumsp,0) as "고객별구매액"
from customer cust,
(select o.custid as ci, sum(saleprice) as sumsp from orders o, customer c 
where o.custid(+)=c.custid
group by o.custid) sumtable
where cust.custid=sumtable.ci(+)
;


--
--(11) 고객의이름과고객이구매한도서목록
select c.name, b.bookname 
from book b, customer c, orders o
where b.bookid = o.bookid and c.custid = o.custid 
order by name;

--(12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문
select *
from  orders oo, book bb
where bb.bookid=oo.bookid
and (oo.saleprice-bb.price) = (select min(o.saleprice-b.price) from orders o, book b where o.bookid=b.bookid)
;

--(13) 도서의판매액평균보다자신의구매액평균이더높은고객의이름
select name
from customer c,
(select avg(saleprice) as avg1 from orders) t1,
(select avg(saleprice) as avg2 , custid from orders group by custid) t2
where c.custid=t2.custid AND avg2>avg1
;

--3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
--(1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
-- 박지성이 구매한 책의 출판사 목록
select b.publisher from orders o, book b where b.bookid=o.bookid AND o.custid=(select custid from customer where name='박지성');

-- 답1)
select distinct c.name
from customer c, book b, orders o
where o.bookid=b.bookid 
AND b.publisher in (select b.publisher from orders o, book b where b.bookid=o.bookid AND o.custid=(select custid from customer where name='박지성'))
AND c.custid=o.custid AND NOT c.name='박지성'
;
-- 답2)
select distinct c.name
from customer c, book b, orders o, 
(select b.publisher as pjspb from orders o, book b where b.bookid=o.bookid AND o.custid=(select custid from customer where name='박지성')) pjs
where o.bookid=b.bookid AND b.publisher=pjs.pjspb AND c.custid=o.custid AND NOT c.name='박지성'
;


--(2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select count(distinct b.publisher), o.custid
from book b, orders o
where o.bookid=b.bookid
group by custid
order by custid;

select c.name
from customer c,
(select count(distinct b.publisher) as cnt, o.custid as cst
from book b, orders o
where o.bookid=b.bookid
group by custid
order by custid
) t1
where c.custid=t1.cst AND cnt>=2
;

