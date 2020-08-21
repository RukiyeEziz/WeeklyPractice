--CREATE DATABASE demos;

--DDL Commands --------------------------
--CREATE TABLE users (
--	nick_name VARCHAR(30),
--	user_power varchar(30),
--	user_name varchar(30),
--	power_level integer
--
--
--);

--ALTER TABLE users ADD COLUMN active boolean;

--TRUNCATE TABLE users;

--DML Commands --------------------------
--INSERT INTO users (nick_name, user_power, user_name, power_level)
--	VALUES ('Capt. America', 'Super Strong Frisbee', 'Steve Rodgers', 20),
--	('Hawkeye', 'plucky can-do attitude', 'Clint Barton', 55);

--CREATE DATABASE project0;

--UPDATE users SET active = FALSE WHERE nick_name = 'Capt. America';
--UPDATE users SET active = TRUE WHERE nick_name = 'Hawkeye';
--DELETE  FROM users WHERE user_name = 'Steve Rodgers';

--DQL Commands ----------------------------
--SELECT user_name FROM users;
--SELECT * FROM users;
--SELECT * FROM users WHERE nick_name = 'Hawkeye';

-- Transaction
--BEGIN;
--INSERT INTO users (nick_name, user_power, user_name, power_level)
--	VALUES ('Capt. America', 'Super Strong Frisbee', 'Steve Rodgers', 20),
--	('Hawkeye', 'plucky can-do attitude', 'Clint Barton', 55);
--UPDATE users SET active = FALSE WHERE nick_name = 'Capt. America';
--UPDATE users SET active = TRUE WHERE nick_name = 'Hawkeye';
--COMMIT;

--ROLLBACK;






