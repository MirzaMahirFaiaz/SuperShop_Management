CREATE DATABASE Super_Shop

USE Super_Shop

CREATE TABLE Users(
	UserName varchar(50) primary key not null,
	Pass_word varchar(50) not null,
	UserType varchar(50) check (UserType='admin' or UserType='seller') not null 
)

Create Table Supplier(
	S_Phone varchar(11) primary key not null,
	S_Name varchar (50) not null,
	S_Address varchar (100) not null

)

Create Table Chalan(
	Chalan_ID int primary key identity (10001,1),
	Chalan_Date Date not null,
	P_Quantity int not null,
	Exp_Date Date
	
)

Create Table Stock(
	P_ID int primary key identity (1,1),
	P_Name varchar(150) Unique not null,
	S_Quantity int not null,
	P_Details varchar(200),
	Category varchar (50)
)


Create Table S_Chalan_P(
	S_Phone Varchar(11) NOT NULL FOREIGN KEY REFERENCES Supplier(S_Phone),
	Chalan_ID int NOT NULL FOREIGN KEY REFERENCES Chalan(Chalan_ID),
	P_ID int  NOT NULL FOREIGN KEY REFERENCES Stock(P_ID),
	Buying_UnitPrice money not null,
	Selling_UnitPrice money not null,
	Remaining_Quantity int not null

)


Create Table Customer(
	C_ID int primary key identity(1,1)not null,
	C_Phone Varchar(11) UNIQUE NOT NULL,
	C_Name varchar(50) not null,
	C_Address varchar(100) not null
)


Create Table Buy(
	Billing_ID int identity(300,1) Primary Key not null,
	P_ID int NOT NULL FOREIGN KEY REFERENCES Stock(P_ID),
	Buying_Date Date not null,
	C_ID int NOT NULL FOREIGN KEY REFERENCES Customer(C_ID),
	Buy_Quantity int not null,
	Total_Price int not null

)


INSERT INTO Users VALUES ('admin','admin','admin')

INSERT INTO Supplier VALUES ('01725697841','Coca-Cola','Tejgong')

Insert into Stock values ('Pepsi 250ml',50,NULL,NULL)
Insert into Stock values ('Coca-Cola 250ml',50,NULL,NULL)


select * from Stock

SELECT S_Quantity from Stock where P_ID = 1

Alter table Chalan
Alter column Exp_Date Date


SELECT IDENT_CURRENT('Chalan')


Select * from Stock inner join S_Chalan_P
on Stock.P_ID = S_Chalan_P.P_ID
inner join Chalan
on S_Chalan_P.Chalan_ID = Chalan.Chalan_ID
inner join Supplier
on S_Chalan_P.S_Phone = Supplier.S_Phone
where exp_date BETWEEN '2022-08-21' AND '2023-08-30'




