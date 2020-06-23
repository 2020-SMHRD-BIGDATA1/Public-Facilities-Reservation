create table Publics(
	Name varchar(50),
	Division varchar(15),
	closure varchar(15),
	weekday varchar(15),
	weekend varchar(15),
	charge char(2),
	pay number(15),
	people number(15),
	address varchar(30),
	phone varchar(20),
	homepage varchar(50),
	lat varchar(15),
	lon varchar(15)
);

drop table publics

create table Ratings(
	Name varchar(30),
	Rating varchar(5),
	Review varchar(1000));
	
select *from Ratings;




