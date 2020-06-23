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


drop table reservations;


create table MemberMactching(
	id varchar2(30),
	addnum number,
	title varchar2(30),
	body varchar2(30)
);

select * from MemberMactching;

drop table members;
create table MEMBERS(
	id varchar(30),
	pw varchar(30),
	name varchar(30),
	age NUMBER (10),
	phone varchar(100),
	address varchar(100),
	mail varchar(100),
	point NUMBER(30));
insert into MEMBERS values ('mty6893', 1234, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áý', 'eliote_min@naver.com', 0);
	


