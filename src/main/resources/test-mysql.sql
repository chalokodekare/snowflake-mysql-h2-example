# Login to mysql & execute these commands or use source command.
# To login to mysql type "mysql -u root -p" and then enter password when prompted.

create user if not exists 'test'@'%' identified by 'snowflake';

drop schema if exists snowflake_test;
create schema snowflake_test;

grant all on `snowflake_test`.* to 'test'@'%';

use snowflake_test;

create table snowflake_test.employee
(
    employee_id   INTEGER(10),
    employee_name VARCHAR(100)
);


insert into snowflake_test.employee (employee_id, employee_name)
VALUES (1, 'first-mysql'),
       (2, 'second-mysql');

GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, RELOAD, PROCESS, REFERENCES, INDEX, ALTER, SHOW DATABASES, CREATE TEMPORARY TABLES, LOCK TABLES, EXECUTE, REPLICATION SLAVE, REPLICATION CLIENT, CREATE VIEW, SHOW VIEW, CREATE ROUTINE, ALTER ROUTINE, CREATE USER, EVENT, TRIGGER ON *.* TO 'test'@'%';