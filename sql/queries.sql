create database qualitasDB;

show databases;

use qualitasDB;

create database dummyDB;

DROP DATABASE dummyDB;

show tables;
CREATE TABLE EMPLOYEE(
EmpID int,
FirstName varchar(50),
LastName varchar(255),
Address varchar(255),
EMPAGE int,
EmpZone varchar(255));

SELECT  *
FROM employee;

SELECT FirstName FROM Employee;

SELECT FirstName,empage FROM Employee;

INSERT INTO employee
VALUES (111, 'jack', 'landors', 'xyz',12,'texas');

select * from employee;

INSERT INTO employee (EmpID, FirstName, EMPAGE)
VALUES (222,'abc',11);

INSERT INTO employee (EmpID, FirstName, EMPAGE)
VALUES (112,'spidy',11);
INSERT INTO employee (EmpID, FirstName, EMPAGE)
VALUES (555,'hulk',11);
INSERT INTO employee (EmpID, FirstName, EMPAGE)
VALUES (777,'thor',11);

INSERT INTO employee (EmpID, FirstName, EMPAGE)
VALUES (5,'dr strange',333);
INSERT INTO employee (EmpID, FirstName, EMPAGE)
VALUES (888,'ironman',44);

select * from employee;

select firstname from employee;

select distinct(firstname) from employee;

select * from employee where empage < 11;

delete from employee where address = 'xyz';

set sql_safe_updates = 0;

UPDATE employee
SET address = 'USA'
WHERE empage = 44;

select * from  employee
order by empage,empid ;

select * from  employee  where empage <> 11;
UPDATE employee
SET empage = 7
WHERE firstname = 'abc';

select min(empage)  age  from employee;

ALTER TABLE employee
ADD PRIMARY KEY (EmpID);
describe employee;
