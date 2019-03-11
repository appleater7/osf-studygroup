package soo.query;

public class queryExam2 {
/*
 * create table osfu_study_char(
osc_num number(10,0) not null primary key,
osc_name varchar2(100) not null,
osc_class varchar2(100) not null,
osc_level number(2,0) DEFAULT 1,
osc_exp number(10,0) DEFAULT 0,
osc_hp number(5,0) DEFAULT 100,
osc_mp number(5,0) DEFAULT 100,
osc_str number(3,0) DEFAULT 5,
osc_dex number(3,0) DEFAULT 5,
osc_luk number(3,0) DEFAULT 5,
osc_int number(3,0) DEFAULT 5,
osc_rank number(10,0) UNIQUE
);
create SEQUENCE seq_osc_num;
drop table osfu_study_char;
drop SeQuence seq_osc_num;
delete from osfu_study_char;
select*from osfu_study_char;
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_rank)
values(seq_osc_num.nextval,'김동근','전사',1);
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_rank)
values(seq_osc_num.nextval,'zl존도적v','도적',(select nvl(max(osc_rank),0)+1 from osfu_study_char));
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_exp,osc_rank)
values(seq_osc_num.nextval,'zl존도적v','도적',11,(select nvl(max(osc_rank),0)+1 from osfu_study_char));
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_exp,osc_rank)
values(seq_osc_num.nextval,'zl존궁수v','궁수',16,(select nvl(max(osc_rank),0)+1 from osfu_study_char));
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_exp,osc_rank)
values(seq_osc_num.nextval,'zl존법사v','마법사',21,(select nvl(max(osc_rank),0)+1 from osfu_study_char));
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_exp,osc_rank)
values(seq_osc_num.nextval,'그냥도적','도적',26,(select nvl(max(osc_rank),0)+1 from osfu_study_char));
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_exp,osc_rank)
values(seq_osc_num.nextval,'그냥전사','전사',31,(select nvl(max(osc_rank),0)+1 from osfu_study_char));
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_exp,osc_rank)
values(seq_osc_num.nextval,'그냥궁수','궁수',36,(select nvl(max(osc_rank),0)+1 from osfu_study_char));
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_exp,osc_rank)
values(seq_osc_num.nextval,'그냥법사','마법사',41,(select nvl(max(osc_rank),0)+1 from osfu_study_char));
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_exp,osc_rank)
values(seq_osc_num.nextval,'그냥법사','마법사',46,(select nvl(max(osc_rank),0)+1 from osfu_study_char));
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_exp,osc_rank)
values(seq_osc_num.nextval,'법사zl존','마법사',51,(select nvl(max(osc_rank),0)+1 from osfu_study_char));
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_exp,osc_rank)
values(seq_osc_num.nextval,'법사zl존3','마법사',56,(select nvl(max(osc_rank),0)+1 from osfu_study_char));
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_exp,osc_rank)
values(seq_osc_num.nextval,'zl존법사zl존3','마법사',61,(select nvl(max(osc_rank),0)+1 from osfu_study_char));
insert into osfu_study_char(osc_num,osc_name,osc_class,osc_exp,osc_rank)
values(seq_osc_num.nextval,'zl존zl존','마법사',66,(select nvl(max(osc_rank),0)+1 from osfu_study_char));

select * from osfu_study_char where osc_exp between 30 and 60;
select osc_name from osfu_study_char where osc_name like '%zl존%';
select * from osfu_study_char where osc_rank=(select max(osc_rank) from osfu_study_char) or osc_rank=(select min(osc_rank) from osfu_study_char);
 */
}
