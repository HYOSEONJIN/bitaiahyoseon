-- 1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
select * from book;
select * from customer;
select * from orders;

--(1) 도서번호가1인도서의이름
Select bookname
from book
where bookid=1
;

-- (2) 가격이20,000원이상인도서의이름
Select bookname
from book
where price>=20000
;

-- (3) 박지성의총구매액(박지성의고객번호는1번으로놓고작성)
select saleprice
from orders
where custid=1
;

-- (4) 박지성이구매한도서의수(박지성의고객번호는1번으로놓고작성)
select count as saleprice
from orders
where custid=1
;