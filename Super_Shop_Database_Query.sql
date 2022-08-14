CREATE DATABASE Super_Shop

USE Super_Shop

CREATE TABLE Users(
	UserName varchar(50) primary key not null,
	Pass_word varchar(50) not null,
	UserType varchar(50) check (UserType='admin' or UserType='seller') not null 
)


INSERT INTO Users VALUES ('MIRZA','admin','admin')


select * from Users