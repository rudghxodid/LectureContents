create table Member(
   memberNo int not null auto_increment,
   id varchar(30) not null,
   pw varchar(30) not null,
regDate timestamp not null default now(),
   primary key(memberNo)
);


create table board(
   boardNo int not null auto_increment,
   title varchar(30) not null,
   pw varchar(30) not null,
regDate timestamp not null default now(),
   primary key(memberNo)
);


create table BOARD(
   NO number not null auto_increment,
   TITLE VARCHAR2(50) not null,
   CONTENT VARCHAR2(500) not null,
   WRITER VARCHAR2(30),
   STATUS VARCHAR2(1) CHECK(STATUS IN('Y','N')) DEFAULT 'Y',
   CREATE_DATE timestamp SYS SYSDATE(),
   UPDATE_DATE timestamp default SYSDATE(),
   primary key(NO),
   FOREIGN key(WRITER)
);