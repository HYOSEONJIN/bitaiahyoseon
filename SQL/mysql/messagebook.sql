-- INSERT INTO `open`.`guestbook_message` (guest_name,password,message) VALUES (?,?,?);

INSERT INTO `open`.`guestbook_message` (guest_name,password,message) VALUES ('test','1234','hi');


select * from open.guestbook_message;
-- select * from open.guestbook_message;

-- SELECT * FROM guestbook_message;

DELETE FROM `open`.`guestbook_message` WHERE message_id=1; 
-- DELETE FROM `open`.`guestbook_message` WHERE message_id=?; 

-- 전체 게시물 구하기
select count(*) from open.guestbook_message;
-- select count(*) from guestbook_message;

-- 페이지 별 메시지 리스트
select * from open.guestbook_message order by message_id desc limit 3,3;
-- select * from open.guestbook_message order by message_id desc limit ?,?