create database jdbc_sql;

create table mahasiswa(
id int primary key auto_increment,
nim varchar(8) not null unique,
nama varchar(255) not null
) engine=InoDB;

insert into mahasiswa(nim,nama) 
values('2015801203','Joni ada');