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
	C_S_Phone Varchar(11) NOT NULL FOREIGN KEY REFERENCES Supplier(S_Phone),
	Chalan_ID int NOT NULL FOREIGN KEY REFERENCES Chalan(Chalan_ID),
	C_P_ID int  NOT NULL FOREIGN KEY REFERENCES Stock(P_ID),
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
	B_P_ID int NOT NULL FOREIGN KEY REFERENCES Stock(P_ID),
	Buying_Date Date not null,
	C_ID int NOT NULL FOREIGN KEY REFERENCES Customer(C_ID),
	Buy_Quantity int not null,
	Total_Price int not null

)

