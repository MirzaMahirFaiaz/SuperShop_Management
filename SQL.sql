USE Super_Shop


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
on Stock.P_ID = S_Chalan_P.C_P_ID
inner join Chalan
on S_Chalan_P.Chalan_ID = Chalan.Chalan_ID
inner join Supplier
on S_Chalan_P.C_S_Phone = Supplier.S_Phone

where exp_date BETWEEN '2022-08-21' AND '2023-08-30'

select * from Customer

Select Selling_UnitPrice,Exp_Date from S_Chalan_P
inner join Stock on
S_Chalan_P.C_P_ID = Stock.P_ID
inner join Chalan on 
S_Chalan_P.Chalan_ID = Chalan.Chalan_ID
where (Stock.P_ID = 9 AND Exp_Date>'2022-09-04') Order by Exp_Date

Select * from S_Chalan_P
inner join Stock on
S_Chalan_P.C_P_ID = Stock.P_ID
inner join Chalan on 
S_Chalan_P.Chalan_ID = Chalan.Chalan_ID
where (Stock.P_ID = 9 AND Exp_Date > '2022-09-04' ) Order by Exp_Date

select * from S_Chalan_P

select * from Stock

select * from Bill

select * from Decrease

select * from Users


