DROP table if exists employee;

create table employee
(
    employee_id   NUMBER(10),
    employee_name VARCHAR(100)
);


insert into employee (employee_id, employee_name)
VALUES (1, 'first-h2'),
       (2, 'second-h2');