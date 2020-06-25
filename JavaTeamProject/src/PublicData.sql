drop table publics CASCADE CONSTRAINTS;
drop table reservation CASCADE CONSTRAINTS;
drop table Ratings CASCADE CONSTRAINTS;
drop table MemberMactching CASCADE CONSTRAINTS;
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
	Rating varchar(5),
	Review varchar(1000)
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
	constraint mem_user_id_pk primary key(user_id)
	);
create table MemberMactching(
	Fac_ID number,
	user_id varchar(20),
	addnum number,
	title varchar2(30) not null,
	body varchar2(100) not null
);
create table reservation(
	user_id varchar2(20),
    fac_id number,
	Fac_Name varchar2(100),
	reserdate varchar2(200),
	usedate varchar2(200),
	usetime varchar2(200),
	fee varchar2(20)
);
alter table Ratings
add constraint rating_u_id_fk foreign key(user_id)
references MEMBERS(user_id); 	

alter table MemberMactching
add constraint memmat_fac_id_fk foreign key(Fac_ID)
references Publics(fac_id); 
alter table MemberMactching
add constraint memmat_u_id_fk foreign key(user_id)
references MEMBERS(user_id); 

	
alter table reservation
add constraint reserv_u_id_fk foreign key(user_id)
references members(user_id); 

alter table reservation
add constraint reserv_fac_id_fk foreign key(fac_id)
references Publics(fac_id); 

select * from MEMBERS

insert into MEMBERS values ('mty6893', 1234, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áı', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('123', 123, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áı', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áı', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áı', 'eliote_min@naver.com', 0);

insert into MEMBERMACTCHING values (2,'ljh2723',3,'³îÀÚ~~','Ãà±¸ÇÒ»ç¶÷ ±¸ÇØ¿é');
insert into MEMBERMACTCHING values (13,'ljh2723',2,'³îÀÚ~~','Ãà±¸ÇÒ»ç¶÷ ±¸ÇØ¿é');
insert into MEMBERMACTCHING values (12,'ljh',2,'³îÀÚ~!!','¾ß±¸ÇÒ»ç¶÷ ±¸ÇØ¿é');
insert into MEMBERMACTCHING values (15,'ljh2723',5,'´ıº­¶ó!!','Ãà±¸ÇÒ»ç¶÷!!');
insert into MEMBERMACTCHING values (20,'ljh2723',1,'¿ÍÁÖ¶ó~','Ãà±¸ÇÏÀÚ~!!');
	
insert into MEMBERS values ('mty6893', 1234, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áı', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('123', 123, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áı', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áı', 'eliote_min@naver.com', 0);
insert into MEMBERS values ('12', 12, '¹ÎÅÂÀ±', 29, '010-6515-6893', '¿ì¸®Áı', 'eliote_min@naver.com', 0);
	

-- º¸¶ó²¨
create table test(
fcname varchar2(30),
fctime varchar2(100)

)

insert into test values('°¢È­Ç²»ìÀå','14:00~16:00');

insert into test values('º¸¶ó','18:00~20:00');
insert into test values('¾Æ´Ï¾ß','24:00~02:00');
insert into test values('¸ô¶ó','44:00~66:00');
insert into test values('ÀÖ¾î¶ó','04:00~06:00');


select * from publics;