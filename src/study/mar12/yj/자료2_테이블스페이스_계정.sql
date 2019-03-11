create tablespace testboard DATAFILE
'testboard' size 1024M autoextend on next 8M
Maxsize unlimited;

create user testuser IDENTIFIED by 1234
default tablespace testboard;

grant dba to testuser;