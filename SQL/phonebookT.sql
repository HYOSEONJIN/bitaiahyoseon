-- ===== 전화번호 부( Contact )
-- 대리키 : 일련번호 -> pIdx
-- 이름, 전화번호, 주소, 이메일 <- 기본정보
-- 주소값과 이메일은 입력이 없을 때 기본값 입력
-- 친구의 타입 (카테고리) : univ, com, cafe 세가지 값만 저장 가능
------ 선택 정보
-- 전공, 학년
-- 회사이름, 부서이름, 직급
-- 모임이름, 닉네임


create table phoneInfo_basic2
(idx NUMBER(6) constraint pi_basic_idx_pk primary key,
 fr_name varchar2(20) not null,
 fr_phonenumber varchar2(20) not null,
 fr_email varchar2(20),
 fr_address varchar2(20),
 fr_regdate date default sysdate  
);

desc phoneinfo_basic2;

select * from phoneinfo_basic2;


-- 제약 조건 확인 user_constraints 
desc user_constraints;

select constraint_name, constraint_type 
from user_constraints
where table_name='PHONEINFO_BASIC2';

insert into phoneinfo_basic2 values (1, 'SCOTT', '010-0000-0000', 'scott@gmail.com','서울', sysdate);

-- 시퀀스 : 숫자 재생기
create sequence SEQ_PIBASIC_IDX
minvalue 0
start with 0
increment by 1
;

insert into phoneinfo_basic2 values (SEQ_PIBASIC_IDX.nextval, 'SCOTT', '010-0000-0000', 'scott@gmail.com','서울', sysdate);
insert into phoneinfo_basic2(IDX, fr_name, fr_phonenumber) values (SEQ_PIBASIC_IDX.nextval, 'KING', '010-9999-999');

-- 데이터삭제
delete from phoneinfo_basic2;

-- 데이터업데이트
UPDATE phoneinfo_basic2
set fr_email='KING@naver.com', fr_address='부산'
where idx=7;

-- C(reate), R(read), U(pdate), D(elete)
-- INSERT , SELECT, UPDATE, DELETE



