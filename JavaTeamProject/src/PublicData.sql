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
	id varchar2(30),
	Name varchar2(300),
	Rating varchar2(5),
	Review varchar2(600));
	user_id varchar(20),
	Fac_Name varchar2(100),
	Rating varchar(5) NOT NULL,
	Review varchar(1000) NOT NULL
	);
	
create table MEMBERS(
	id varchar(20),
	pw varchar(20),
	name varchar(10),
	age NUMBER (10),
	phone varchar(20),
	address varchar(100),
	mail varchar(100),
	point NUMBER(30));
	
create table reservation(
   user_id varchar2(200),
    fac_id varchar2(200),
	fac_name varchar2(200),
	reserdate varchar2(200),
	usedate varchar2(200),
	usetime varchar2(200),
	fee varchar2(200)
	user_id varchar(20) ,
	pw varchar(20) not null,
	name varchar(10) not null,
	age NUMBER (10) not null,
	phone varchar(20) not null,
	address varchar(100) not null,
	mail varchar(100) not null,
	point NUMBER(30),
	constraint mem_user_id_pk primary key(user_id)
	);
create table MemberMatching(
	Fac_ID number,
	user_id varchar(20),
	addnum number,
	title varchar2(30) not null,
	body varchar2(100) not null
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA1/Public-Facilities-Reservation.git
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
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA1/Public-Facilities-Reservation.git

insert into MEMBERS values ('mty6893', 1234, '������', 29, '010-6515-6893', '�츮��', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('123', 123, '������', 29, '010-6515-6893', '�츮��', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '������', 29, '010-6515-6893', '�츮��', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '������', 29, '010-6515-6893', '�츮��', 'eliote_min@naver.com', 0);

insert into MEMBERMATCHING values (2,'ljh2723',3,'����~~','�౸�һ�� ���ؿ�');
insert into MEMBERMATCHING values (13,'ljh2723',2,'����~~','�౸�һ�� ���ؿ�');
insert into MEMBERMATCHING values (12,'ljh',2,'����~!!','�߱��һ�� ���ؿ�');
insert into MEMBERMATCHING values (15,'ljh2723',5,'������!!','�౸�һ��!!');
insert into MEMBERMATCHING values (20,'ljh2723',1,'���ֶ�~','�౸����~!!');
	
insert into MEMBERS values ('mty6893', 1234, '������', 29, '010-6515-6893', '�츮��', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('123', 123, '������', 29, '010-6515-6893', '�츮��', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '������', 29, '010-6515-6893', '�츮��', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '������', 29, '010-6515-6893', '�츮��', 'eliote_min@naver.com', 0);
	
-- ����
create table test(
fcname varchar2(30),
fctime varchar2(100)

)

insert into test values('��ȭǲ����','14:00~16:00');

insert into test values('����','18:00~20:00');
insert into test values('�ƴϾ�','24:00~02:00');
insert into test values('����','44:00~66:00');
insert into test values('�־��','04:00~06:00');


select * from Ratings ;
insert into RATINGS values('123','��ȭ1���Ϻ� ������','5','������������������������������������������');