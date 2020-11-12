-- 2020.11.12

-- DDL

-- 테이블 생성 : 
-- create table table_name
-- (
--     column_name domain [constraint],
--     column_name domain [constraint],
--     column_name domain [constraint],
--     ...
--   )

create table test_tbl (
        no              number(4),
        user_name       varchar2(10),
        user_id         varchar2(16),
        user_password   varchar2(12),
        reg_date        Timestamp DEFAULT sysdate
    );
    desc test_tbl;