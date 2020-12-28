-- INSERT INTO `open`.`guestbook_message` (guest_name,password,message) VALUES (?,?,?);

INSERT INTO `open`.`guestbook_message` (guest_name,password,message) VALUES ('test','1234','hi');

SELECT * FROM guestbook_message;

-- SELECT * FROM guestbook_message;

DELETE FROM `open`.`guestbook_message` WHERE message_id=1; 
-- DELETE FROM `open`.`guestbook_message` WHERE message_id=?; 
