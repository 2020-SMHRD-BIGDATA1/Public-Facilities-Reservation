create table Publics(

	Name varchar2(50),
	Division varchar2(30),
	closure varchar2(30),
	weekday varchar2(15),
	weekend varchar2(15),
	charge char(2),
	pay number(15),
	people number(15),
	address varchar2(50),
	phone varchar2(20),
	homepage varchar2(50),
	lat varchar2(15),
	lon varchar2(15)

);
ALTER TABLE publics DROP COLUMN lat;
ALTER TABLE publics DROP COLUMN lon;

drop table publics


create table Ratings(
	Name varchar(30),
	Rating varchar(5),
	Review varchar(1000));
	
select *from Ratings;


drop table reservations;


create table MemberMactching(
	id varchar2(30),
	addnum number,
	title varchar2(30),
	body varchar2(30)
);

select * from Publics;

drop table members;
create table MEMBERS(
	id varchar(20),
	pw varchar(20),
	name varchar(10),
	age NUMBER (10),
	phone varchar(20),
	address varchar(100),
	mail varchar(100),
	point NUMBER(30));
select * from members;

