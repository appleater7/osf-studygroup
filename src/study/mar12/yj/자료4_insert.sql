insert into testboard(
tb_num, tb_name, tb_qty,
tb_date, tb_time) values(
seq_testboard_tb_num.nextval,
'파이리',
4,
to_char(sysdate, 'yyyymmdd'),
to_char(sysdate, 'hh24miss')
);

desc testboard;