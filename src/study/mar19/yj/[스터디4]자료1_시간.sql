create table timetest(
tt_num number(3,0) primary key not null,
tt_credate char(8),
tt_cretime char(6),
tt_result varchar2(300)
);
create SEQUENCE seq_timetest_tt_num;

select * from tabs;

select * from timetest order by tt_credate;

desc timetest;

drop table timetest;

insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(sysdate, 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');

1. 오늘날짜로부터 n일 이전값 조회;
select * from table명 where 날짜컬럼 > to_char(sysdate - 7, 'yyyymmdd');

2. n개월 +;
add_months(날짜, 개월수);

select sysdate from dual;




3. 마지막 날;
select sysdate, LAST_DAY(sysdate) from dual;





4. MONTHS_BETWEEN(a,b) a-b의 개월수;
select sysdate, add_months(LAST_DAY(sysdate),3) from dual;
select months_BETWEEN(sysdate, add_months(LAST_DAY(sysdate),3)) from dual;

5. trunc() 버림, ceil() 올림, round() 반올림;
select trunc(months_BETWEEN(sysdate, add_months(LAST_DAY(sysdate),3))) from dual;
select ceil(months_BETWEEN(sysdate, add_months(LAST_DAY(sysdate),3))) from dual;
select round(months_BETWEEN(sysdate, add_months(LAST_DAY(sysdate),3))) from dual;





6. 문자열을 날짜로 변경
sysdate 는 날짜형식, 반면에 문자열을 날짜형식으로 변경이 필요
select '2019-03-19' + 100 from dual; => 에러 발생;
select '2019-03-19' + 100 from dual;

select to_date('2019-03-19', 'yyyy-mm-dd') + 100 from dual;





7. 오라클에서 시간/분/초 더하기
select to_date('2019-03-19', 'yyyy-mm-dd') from dual;





insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(sysdate - 9 , 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');
insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(sysdate - 8 , 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');
insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(sysdate - 7 , 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');
insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(sysdate - 6 , 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');
insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(sysdate - 5 , 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');
insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(sysdate - 4 , 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');
insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(sysdate - 3 , 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');
insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(sysdate - 2 , 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');
insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(sysdate - 1 , 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');





insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(add_months(sysdate,1) , 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');
insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(add_months(sysdate,2) , 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');
insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(add_months(sysdate,3) , 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');





insert into timetest(tt_num, tt_credate, tt_cretime, tt_result)
values (seq_timetest_tt_num.nextval, to_char(add_months(sysdate,1) , 'yyyymmdd'), to_char(sysdate, 'hh24miss'),'');
