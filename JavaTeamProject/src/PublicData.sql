drop table publics;
drop table reservation;
drop table Ratings;
drop table MemberMactching;

create table Publics(
	Fac_ID number,
	Name varchar2(50),
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
	img varchar2(50)
);

create table Ratings(
	id varchar(30),
	Name varchar(30),
	Rating varchar(5),
	Review varchar(1000));
	
create table MemberMactching(
	Fac_ID number,
	id varchar2(30),
	addnum number,
	title varchar2(30),
	body varchar2(30)
);
create table MEMBERS(
	id varchar(20),
	pw varchar(20),
	name varchar(10),
	age NUMBER (10),
	phone varchar(20),
	address varchar(60),
	mail varchar(100),
	point NUMBER(30));
	
create table reservation(
    user_id varchar2(20),
    fac_id varchar2(20),
	fac_name varchar2(20),
	reserdate varchar2(20),
	usedate varchar2(20),
	usetime varchar2(20),
	fee varchar2(20)
);
insert into MEMBERMACTCHING values (2,'ljh2723',3,'����~~','�౸�һ�� ���ؿ�');
insert into MEMBERMACTCHING values (13,'ljh2723',2,'����~~','�౸�һ�� ���ؿ�');
insert into MEMBERMACTCHING values (12,'ljh',2,'����~!!','�߱��һ�� ���ؿ�');
insert into MEMBERMACTCHING values (15,'ljh2723',5,'������!!','�౸�һ��!!');
insert into MEMBERMACTCHING values (20,'ljh2723',1,'���ֶ�~','�౸����~!!');
	
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


select * from test;