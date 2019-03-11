create table testboard(
tb_num number(3,0) primary key not NULL,
tb_name varchar2(30) not null unique,
tb_qty number(10,0) DEFAULT 0,
tb_date char(8),
tb_time char(6)
);

drop table testboard;

desc testboard;

insert into testboard(tb_num, tb_name, tb_date, tb_time)
 values(1, 'hi', 11111111, 111111);
 
select * from testboard;
 
delete testboard;
 
create SEQUENCE 
seq_testboard_tb_num;
 
select seq_testboard_tb_num.nextval from dual;

drop sequence seq_testboard_tb_num;
 
 