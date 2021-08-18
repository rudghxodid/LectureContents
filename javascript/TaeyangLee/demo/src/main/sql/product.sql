create table board(
   board_no int not null auto_increment,
   title varchar(50) not null,
   content text null,
   writer varchar(50) not null,
   funding int not null,
   nowfunding int,
   regDate timestamp not null default now(),
   primary key(board_no)
);