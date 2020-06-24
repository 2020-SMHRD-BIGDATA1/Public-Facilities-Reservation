create table Publics(
	Fac_ID number,
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


drop table reservations;


create table MemberMactching(
	Fac_ID number,
	id varchar2(30),
	addnum number,
	title varchar2(30),
	body varchar2(30)
);
insert into MEMBERMACTCHING values (2,'ljh2723',3,'놀자~~','축구할사람 구해욥');
insert into MEMBERMACTCHING values (13,'ljh2723',2,'놀자~~','축구할사람 구해욥');
insert into MEMBERMACTCHING values (12,'ljh',2,'놀자~!!','야구할사람 구해욥');
insert into MEMBERMACTCHING values (15,'ljh2723',5,'덤벼라!!','축구할사람!!');
insert into MEMBERMACTCHING values (20,'ljh2723',1,'와주라~','축구하자~!!');

select * from MemberMactching;
select * from members;
select * from Publics;
<<<<<<< HEAD
=======
select * from members;
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA1/Public-Facilities-Reservation.git

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
<<<<<<< HEAD
	
=======
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA1/Public-Facilities-Reservation.git
insert into MEMBERS values ('mty6893', 1234, '민태윤', 29, '010-6515-6893', '우리집', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('123', 123, '민태윤', 29, '010-6515-6893', '우리집', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '민태윤', 29, '010-6515-6893', '우리집', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '민태윤', 29, '010-6515-6893', '우리집', 'eliote_min@naver.com', 0);

UPDATE MEMBERS SET pw = 1234, name = '하하하', age = 27, PHONE = '010-5555-6666', mail = 'fff@naver.com' WHERE id ='123';

delete members where id='12';
	
CREATE TABLE reservations(
FC_NAME varchar2(30),
TIMESLOT VARCHAR2(30));
insert into reservations values('각화풋살장',
'6,8,10,12,14,16,18');

<<<<<<< HEAD
select * from members;
=======
select * from ratings;

create table reservation(
    user_id varchar(20),
    fac_id varchar(20),
	fac_name varchar(20),
	usedate varchar(20),
	usetime varchar(20),
	fee varchar(20)

)



>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA1/Public-Facilities-Reservation.git

