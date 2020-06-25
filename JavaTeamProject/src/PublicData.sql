drop table publics CASCADE CONSTRAINTS;
drop table reservation CASCADE CONSTRAINTS;
drop table Ratings CASCADE CONSTRAINTS;
drop table MemberMatching CASCADE CONSTRAINTS;
drop table members CASCADE CONSTRAINTS;

create table Publics(
	Fac_ID number,
	Fac_Name varchar2(100),
	Division varchar2(30),
	closure varchar2(30),
	weekday varchar2(15),
	weekend varchar2(15),
	charge varchar2(2),
	pay number(15),
	people number(15),
	address varchar2(50),
	phone varchar2(20),
	homepage varchar2(50),
	img varchar2(50),
	constraint pub_fac_id_pk primary key(Fac_ID)
);

create table Ratings(
	user_id varchar(20),
	Fac_Name varchar2(100),
	Rating varchar(5) NOT NULL,
	Review varchar(1000) NOT NULL
	);
	
create table MEMBERS(
	user_id varchar(20) ,
	pw varchar(20) not null,
	name varchar(10) not null,
	age NUMBER (10) not null,
	phone varchar(20) not null,
	address varchar(100) not null,
	mail varchar(100) not null,
	point NUMBER(30),
	constraint mem_user_id_pk primary key(user_id));
	
create table MemberMatching(
	Fac_ID number,
	user_id varchar(20),
	addnum number,
	title varchar2(30) not null,
	body varchar2(100) not null
	);
	
create table reservation(
	user_id varchar2(20),
    fac_id number,
	Fac_Name varchar2(100) NOT NULL,
	reserdate varchar2(30) NOT NULL,
	usedate varchar2(30) NOT NULL,
	usetime varchar2(30) NOT NULL,
	fee varchar2(20) 
);
alter table Ratings
add constraint rating_u_id_fk foreign key(user_id)
references MEMBERS(user_id); 	

alter table MemberMatching
add constraint memmat_fac_id_fk foreign key(Fac_ID)
references Publics(fac_id); 

alter table MemberMatching
add constraint memmat_u_id_fk foreign key(user_id)
references MEMBERS(user_id); 
	
alter table reservation
add constraint reserv_u_id_fk foreign key(user_id)
references MEMBERS(user_id); 

alter table reservation
add constraint reserv_fac_id_fk foreign key(fac_id)
references Publics(fac_id); 

select * from MEMBERS
-----------------------------------

insert into MEMBERS values ('mty6893', 1234, '민태윤', 29, '010-6515-6893', '우리집', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('123', 123, '민태윤', 29, '010-6515-6893', '우리집', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '민태윤', 29, '010-6515-6893', '우리집', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '민태윤', 29, '010-6515-6893', '우리집', 'eliote_min@naver.com', 0);

insert into MEMBERMATCHING values (2,'123',3,'놀자~~','축구할사람 구해욥');
insert into MEMBERMATCHING values (13,'123',2,'놀자~~','축구할사람 구해욥');
insert into MEMBERMATCHING values (12,'123',2,'놀자~!!','야구할사람 구해욥');
insert into MEMBERMATCHING values (15,'123',5,'덤벼라!!','축구할사람!!');
insert into MEMBERMATCHING values (20,'123',1,'와주라~','축구하자~!!');
	
insert into MEMBERS values ('mty6893', 1234, '민태윤', 29, '010-6515-6893', '우리집', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('123', 123, '민태윤', 29, '010-6515-6893', '우리집', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '민태윤', 29, '010-6515-6893', '우리집', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '민태윤', 29, '010-6515-6893', '우리집', 'eliote_min@naver.com', 0);
	
-- 보라꺼
create table test(
fcname varchar2(30),
fctime varchar2(100)

)

insert into test values('각화풋살장','14:00~16:00');

insert into test values('보라','18:00~20:00');
insert into test values('아니야','24:00~02:00');
insert into test values('몰라','44:00~66:00');
insert into test values('있어라','04:00~06:00');

select * from MEMBERMATCHING;
select * from Ratings ;
insert into RATINGS values('123','각화1교하부 족구장','5','ㅇㄴㄹㄴㅇㄹㄴㅇㄹㄴㅇㄹㅇㄴㄹㄴㅇㄹㄴㅇㄹ');
select * from reservation ;



