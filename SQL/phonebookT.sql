-- ===== 전화번호 부( Contact )
-- 대리키 : 일련번호 -> pIdx
-- 이름, 전화번호, 주소, 이메일 <- 기본정보
-- 주소값과 이메일은 입력이 없을 때 기본값 입력
-- 친구의 타입 (카테고리) : univ, com, cafe 세가지 값만 저장 가능
------ 선택 정보
-- 전공, 학년
-- 회사이름, 부서이름, 직급
-- 모임이름, 닉네임


create table phoneInfo_basic
(idx NUMBER(6) constraint pi_basic_idx_pk primary key,
 fr_name varchar2(20) not null,
 fr_phonenumber varchar2(20) not null,
 fr_email varchar2(20),
 fr_address varchar2(20),
 fr_regdate date default sysdate  
);

desc phoneinfo_basic;

-- 제약 조건 확인 user_constraints 
desc user_constraints;

select constraint_name, constraint_type 
from user_constraints
where table_name='PHONEINFO_BASIC';

insert into PHONEINFO_BASIC
values(1,'SCOTT','010-0000-0000', 'SCOTT@GMAIL.COM','서울',sysdate);

-- 질의
select * from phoneinfo_basic;

-- 시퀀스 : 숫자 재생기
create sequence SEQ_PIBASIC_IDX
minvalue 0
start with 0
increment by 1
;

-- INSERT
insert into PHONEINFO_BASIC(idx,fr_name,fr_phonenumber)
values(SEQ_PIBASIC_IDX.nextval,'KING','010-9999-9999');

insert into PHONEINFO_BASIC
values(1,'SCOTT','010-0000-0000','SCOTT@GMAIL.COM','서울',sysdate);

insert into PHONEINFO_BASIC
values(SEQ_PIBASIC_IDX.nextval,'SCOTT','010-0000-0000','SCOTT@GMAIL.COM','서울',sysdate);

-- 데이터 삭제
delete from phoneinfo_basic;

-- 데이터 업데이트 : 데이터 수정
update phoneinfo_basic
set fr_email='KING@NAVER.COM', FR_ADDRESS='부산'
WHERE idx=10
;

-- C(reate),R(ead),U(pdate),D(elete)
-- INSERT, SELECT, UPDATE, DELETE

drop table phoneinfo_univ;

create table phoneinfo_univ
(idx number(6),
 fr_u_major varchar2(20) default 'N', 
 fr_u_year number(1) default 1 check (fr_u_year between 1 and 4),
 fr_ref number(6) not null,
 constraint pi_univ_idx_PK primary key (idx),
 constraint pi_uni_ref_FK foreign key (fr_ref) references phoneinfo_basic (idx)
);

select * from phoneinfo_univ;
desc phoneinfo_univ;
select * from user_constraints where table_name='PHONEINFO_UNIV';

-- CRUD
-- create : 대학친구 입력
-- 기본 정보
insert into PHONEINFO_BASIC(idx,fr_name,fr_phonenumber)
values(SEQ_PIBASIC_IDX.nextval,'KING','010-9999-9999');
-- 대학 정보
insert into phoneinfo_univ values (3,'computer',2,SEQ_PIBASIC_IDX.currval);

-- read
select * from phoneinfo_univ;

select * 
from phoneinfo_basic pb, phoneinfo_univ pu
where pb.idx=pu.fr_ref;


-- update : phoneinfo_univ    where idx=3;
update phoneinfo_univ
set fr_u_major='체육', fr_u_year=4
where idx=1;

-- delete : idx=10삭제
delete phoneinfo_univ where fr_ref=2;
delete phoneinfo_basic where idx=2;


-----phoneinfo_com
create table phoneinfo_com(
    idx number(6) CONSTRAINT pi_com_idx_pk primary key,
    fr_c_company varchar(20) default 'N',
    fr_ref number(6) not null CONSTRAINT pi_com_ref_fk REFERENCES phoneinfo_basic(idx)
);

-- 회사 친구 정보 입력
-- 기본정보
insert into PHONEINFO_BASIC(idx,fr_name,fr_phonenumber)
values(SEQ_PIBASIC_IDX.nextval,'효선','010-9999-9999');
-- 회사정보 입력
insert into phoneinfo_com values (1, '청와대', SEQ_PIBASIC_IDX.currval);


-- read
-- 회사친구 
select * from phoneinfo_com;

select * 
from phoneinfo_basic pb, phoneinfo_com pc
where pb.idx=pc.fr_ref
and pb.fr_name='효선';


-- update

update phoneinfo_com
set fr_c_company='청파동사무소'
where idx=1;



-- delete : idx=10삭제
-- 자식테이블 행부터 삭제
delete phoneinfo_com where fr_ref=3;
delete phoneinfo_basic where idx=3;

select *
from PHONEINFO_BASIC pb , PHONEINFO_COM pc, PHONEINFO_UNIV pu
where pb.idx=pu.fr_ref(+) and pb.idx=pc.fr_ref(+);

