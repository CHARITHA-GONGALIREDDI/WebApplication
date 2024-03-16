--create a database
create database if not exists webapp;
--use the created database
use webapp;
--create the table
create table if not exists datastore(
ID int Not null primary key auto_increment,
Name varchar(30) not null,
email varchar(50) not null,
age int not null,
dateOfBirth date
);