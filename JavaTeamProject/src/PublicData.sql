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
	img varchar2(50)

);


drop table publics

drop table Ratings;
create table Ratings(
id varchar(30),
	Name varchar(30),
	Rating varchar(5),
	Review varchar(1000));
	
select *from Ratings;


drop table reservation;


create table MemberMactching(
	id varchar2(30),
	addnum number,
	title varchar2(30),
	body varchar2(30)
);

select * from MemberMactching;
select * from members;
select * from Publics;
select * from members;

drop table reservation;
create table MEMBERS(
	id varchar(20),
	pw varchar(20),
	name varchar(10),
	age NUMBER (10),
	phone varchar(20),
	address varchar(60),
	mail varchar(100),
	point NUMBER(30));
insert into MEMBERS values ('mty6893', 1234, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áý', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('123', 123, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áý', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áý', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áý', 'eliote_min@naver.com', 0);

UPDATE MEMBERS SET pw = 1234, name = 'ÇÏÇÏÇÏ', age = 27, PHONE = '010-5555-6666', mail = 'fff@naver.com' WHERE id ='123';

delete members where id='12';
	
CREATE TABLE reservations(
FC_NAME varchar2(30),
TIMESLOT VARCHAR2(30));
insert into reservations values('°¢È­Ç²»ìÀå',
'6,8,10,12,14,16,18');

select * from ratings;


create table reservation(
    user_id varchar2(20),
    fac_id varchar2(20),
	fac_name varchar2(20),
	reserdate varchar2(20),
	usedate varchar2(20),
	usetime varchar2(20),
	fee varchar2(20)

)

create table test(
fcname varchar2(30),
fctime varchar2(100)

)


insert into test values('°¢È­Ç²»ìÀå','14:00~16:00');

insert into test values('º¸¶ó','18:00~20:00');
insert into test values('¾Æ´Ï¾ß','24:00~02:00');
insert into test values('¸ô¶ó','44:00~66:00');
insert into test values('ÀÖ¾î¶ó','04:00~06:00');


select * from test;