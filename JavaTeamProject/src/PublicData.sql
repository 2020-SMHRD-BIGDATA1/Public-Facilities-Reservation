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

<<<<<<< HEAD
select * from MemberMactching;
select * from members;
=======
select * from Publics;
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA1/Public-Facilities-Reservation.git

drop table members;
create table MEMBERS(
	id varchar(20),
	pw varchar(20),
	name varchar(10),
	age NUMBER (10),
	phone varchar(20),
	address varchar(60),
	mail varchar(100),
	point NUMBER(30));
<<<<<<< HEAD
insert into MEMBERS values ('mty6893', 1234, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áý', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('123', 123, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áý', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áý', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áý', 'eliote_min@naver.com', 0);

UPDATE MEMBERS SET pw = 1234, name = 'ÇÏÇÏÇÏ', age = 27, PHONE = '010-5555-6666', mail = 'fff@naver.com' WHERE id ='123';

delete members where id='12';
	

=======
select * from members;
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA1/Public-Facilities-Reservation.git

