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

insert into board (title, content, writer, funding, nowfunding) values
 ('어린아이들을 도와주세요','도와줘','기업명','10000000','0');