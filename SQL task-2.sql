create table students(regno int primary key,sname varchar(50),branch varchar(50));
insert into students values(0001,"Ram","CSE");
insert into students values(0002,"Hari","MECH");
insert into students values(0003,"Pradeep","EEE");
insert into students values(0004,"Deepak","ECE");
select * from students;
select regno from students where sname="Pradeep";
select sname,branch from students;
select count(*) from students;
alter table students add column address varchar(50);
select * from students;
commit;

create table emplyoee1(empno int primary key,empname varchar(50),job varchar(50),hiredate date,mgr int,sal decimal,comm decimal,deptno int);
insert into emplyoee1 values(7369,"smith","clerk",str_to_date("17-Dec-1980","%d-%M-%Y"),7902,800,null,20);
insert into emplyoee1 values(7499,"allen","salesman",str_to_date("20-feb-1981","%d-%M-%Y"),7698,1600,300,30);
insert into emplyoee1 values(7521,"waro","salesman",str_to_date("22-Feb-1981","%d-%M-%Y"),7698,1250,500,30);
insert into emplyoee1 values(7566,"jones","manager",str_to_date("02-Apr-1981","%d-%M-%Y"),7839,2975,null,20);
insert into emplyoee1 values(7654,"martin","salesman",str_to_date("28-sep-1981","%d-%M-%Y"),7698,1250,1400,30);
insert into emplyoee1 values(7698,"blake","manager",str_to_date("01-May-1981","%d-%M-%Y"),7839,2850,null,30);
insert into emplyoee1 values(7782,"clark","manager",str_to_date("09-jun-1981","%d-%M-%Y"),7839,2450,null,10);
insert into emplyoee1 values(7788,"scott","analyst",str_to_date("19-Apr-1987","%d-%M-%Y"),7566,3000,null,20);
insert into emplyoee1 values(7839,"king","president",str_to_date("17-nov-1981","%d-%M-%Y"),null,5000,null,10);
insert into emplyoee1 values(7844,"turner","salesman",str_to_date("08-Sep-1981","%d-%M-%Y"),7698,1500,0,30);
insert into emplyoee1 values(7876,"adams","clerk",str_to_date("23-May-1987","%d-%M-%Y"),7788,1100,null,20);
insert into emplyoee1 values(7900,"james","clerk",str_to_date("03-Dec-1981","%d-%M-%Y"),7698,950,null,30);
insert into emplyoee1 values(7902,"ford","analyst",str_to_date("03-Dec-1981","%d-%M-%Y"),7566,3000,null,20);
insert into emplyoee1 values(7934,"miller","clerk",str_to_date("23-jan-1982","%d-%M-%Y"),7782,1300,null,10);
select * from emplyoee1;
select * from emplyoee1 where deptno=30;
select empname,empno,deptno from emplyoee1 where job="clerk";
select deptno,empname from emplyoee1 where deptno>20;
select * from emplyoee1 where comm>sal;
select * from emplyoee1 where comm>(60/100)*sal;
select empname,job,sal from emplyoee1 where deptno=20 and sal>2000;
select job,empname from emplyoee1 where job="salesman" and deptno=30 and sal>1500;
select * from emplyoee1 where job="manager" or job="president";
select * from emplyoee1 where deptno not in(30) and job="manager";
select * from emplyoee1 where job in ("clerk","manager") and  deptno=10;
select * from emplyoee1 where job in ("clerk","manager") and deptno=20;
select * from emplyoee1 where job ="clerk" and deptno=20   ;
select * from emplyoee1 where job ="manager" and deptno=10   ;
select * from emplyoee1 where job not in ("clerk","manager") and  sal>=2000;
select empname from emplyoee1 where deptno=20 and job not in ("clerk","manager");
select empname from emplyoee1 where sal between 1200 and 1400;
select empname from emplyoee1 where job in ("analyst","clerk","salesman");
select empname from emplyoee1 where job not  in ("analyst","clerk","salesman");
select empname from emplyoee1 where comm is null;
select empname from emplyoee1 where comm is null or comm<100;
select empname,(sal + isnull(comm,0)) as netsal from emplyoee1   ;
select empname, (sal+comm) as totalearn from emplyoee1 where (sal+comm)>2000;
select empname from emplyoee1 where empname like "m%" or "%m";
select empname from emplyoee1 where empname like "%m%" ;
select empname from emplyoee1 where length(empname)<=15 and empname like"__r%";
select * from emplyoee1 where month(hiredate)=2;
select * from emplyoee1 where dayofmonth(hiredate) between 30 and 31;
select * ,timestampdiff(year,hiredate,current_date()) as diffyear from emplyoee1 where timestampdiff(year,hiredate,current_date())  > 2;
select * from emplyoee1 where job="manager" and year(hiredate)=2003;
select concat(empname,' ', job) as nameandjob  from emplyoee1 ;
select rpad(empname,15,' ') as ename from emplyoee1;
select rpad(empname,15,'*') as ename from emplyoee1;
select empname from emplyoee1 where empname not like "a%";
select empname from emplyoee1 where empname not like "%r";
select substring(empname,1,3) from emplyoee1  ;
select substring(empname,-3) from emplyoee1  ;
select replace(empname,'a','A') from emplyoee1 ;
select empname from emplyoee1 where empname like "%ar%";
select empname,round(sal,-3)  from emplyoee1 where round(sal,-3)=1000;
select empname,round(sal)  from emplyoee1 where round(sal)<1000;
select empname,case
when hiredate<current_date()
then hiredate + interval 3 year end as service from emplyoee1  ;
select empname,timestampdiff(day,hiredate,current_date()) as days from emplyoee1;
select empname,timestampdiff(month,hiredate,current_date()) as months from emplyoee1;
select * from emplyoee1 order by empname asc;
select empname,timestampdiff(year,hiredate,current_date()) as days from emplyoee1 order by timestampdiff(year,hiredate,current_date()) desc;
select empname,job,sal from emplyoee1 order by job asc ,sal asc;
select empname,job,sal from emplyoee1 order by job desc ,sal asc;
select empname,deptno,sal from emplyoee1 where comm is null or comm=0 order by deptno asc;
select empname,deptno,sal,timestampdiff(year,hiredate,current_date()) as diffyear from emplyoee1 where timestampdiff(year,hiredate,current_date())=1;
select empname,deptno,hiredate from emplyoee1 where year(hiredate)=2003 order by hiredate;
select empname,deptno from emplyoee1;
commit;






