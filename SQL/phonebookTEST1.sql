drop table phoneinfo_basic;
drop table PHONEINFO_COM;
drop table PHONEINFO_UNIV;
drop table Friendtype;


create table phoneInfo_basic (
        idx             number(6)       primary key,
        fr_name         varchar2(20)    not null,
        fr_phonenumber  varchar2(20)    not null,
        fr_email        varchar2(20)    default '-',
        fr_address      varchar2(20)    default '-',
        fr_regdate      DATE            default sysdate
);
 

create table phoneInfo_univ (
        idx             number(6)       primary key,
        fr_u_major      varchar2(20)    default 'N',
        fr_u_year       number(1)       check (fr_u_year BETWEEN 5 and 1),
        fr_ref          number(7)       not null references phoneinfo_basic(idx)
);
 
--	idx number(6),
--	fr_u_major varchar2(20) default 'N', 
--	fr_u_year number(1) default 1 check (fr_u_year between 1 and 4),
--	fr_ref number(6) not null,
--	constraint pi_univ_idx_PK primary key (idx),
--	constraint pi_uni_ref_FK foreign key (fr_ref) references phoneinfo_basic (idx)
--);

 
create table phoneinfo_com(
        idx             number(6)       primary key,
        fr_c_company    varchar2(20)    default 'N',
        fr_ref          number(6)       not null references phoneinfo_basic(idx)
);
 
 
 
-----------------------------------------------------------------------------------
 
create table fr_type(
    friendty      varchar2(5)    unique
);
 
insert into fr_type values ('univ');
insert into fr_type values ('com');
insert into fr_type values ('cafe');
 
 
-----------------------------------------------------------
select * from Friendtype;
create table Friendtype(
    pidx            number(6)        primary key,
    friendtype      varchar2(5)      references fr_type(friendty)
);

 
----------------------------------------------------------------
 -- 시퀀스 생성
create Sequence seq_basic_idx MINVALUE 0 start with 1 INCREMENT BY 1;
create Sequence seq_univ_idx MINVALUE 0 start with 1 INCREMENT BY 1;
create Sequence seq_com_idx MINVALUE 0 start with 1 INCREMENT BY 1;
create Sequence seq_main_idx MINVALUE 0 start with 1 INCREMENT BY 1;

drop sequence seq_basic_idx;
drop sequence seq_univ_idx;
drop sequence seq_com_idx;
drop SEQUENCE seq_main_idx;
----------------------------------------------------------------
select * from phoneinfo_basic;
select * from PHONEINFO_UNIV;
select * from friendtype;
select * from phoneinfo_com;

delete from phoneinfo_basic;
delete from phoneinfo_com;

commit;

-- 대학친구 입력
insert into phoneinfo_basic values (seq_basic_idx.nextval, '효선', '01012345678', 'tomnmo@naver.com', '서울', sysdate);
insert into PHONEINFO_UNIV values (seq_univ_idx.nextval, '게임', '4', seq_basic_idx.currval);
insert into Friendtype values (seq_main_idx.nextval, 'univ');

-- 회사친구 입력
insert into phoneinfo_basic(idx, fr_name, fr_phonenumber) values (seq_basic_idx.nextval, '태형', '01012348787');
insert into phoneinfo_com values (seq_com_idx.nextval, '레쓰비', seq_basic_idx.currval);
insert into Friendtype values (seq_main_idx.nextval, 'com');


-- 출력
select * from PHONEINFO_BASIC pb , PHONEINFO_COM pc, PHONEINFO_UNIV pu
where pb.idx=pc.FR_REF(+) AND pb.IDX=pu.FR_REF(+);

-- 뷰
create or REPLACE view view_test01
as 
select pb.IDX, fr_name, fr_email, FR_ADDRESS, FR_REGDATE, FR_C_COMPANY, FR_U_MAJOR,FR_U_YEAR
from PHONEINFO_BASIC pb , PHONEINFO_COM pc, PHONEINFO_UNIV pu
where pb.idx=pc.FR_REF(+) AND pb.IDX=pu.FR_REF(+);
select * from view_test01;

-- 친구타입 같이 출력
select pidx, friendtype, fr_name, FR_EMAIL, FR_ADDRESS, FR_REGDATE, FR_U_MAJOR,FR_U_YEAR,FR_C_COMPANY
from friendtype, view_test01
where pidx=idx
;

-- 뷰 생성

drop view phonebook;

create or replace view phonebook
AS
select pidx as "No.", friendtype as "친구타입", fr_name as "이름", FR_EMAIL as "이메일", 
FR_ADDRESS as "주소", FR_REGDATE as "등록일" , FR_U_MAJOR as "전공",FR_U_YEAR as "학년" ,FR_C_COMPANY as "회사이름"
from friendtype, view_test01
where pidx=idx;


-- 최종출력물
select *
from PHONEBOOK;



commit;
rollback;
