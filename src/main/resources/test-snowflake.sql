create or replace TABLE chalocodekare_db.snowflake_test.employee
(
    employee_id   NUMBER(38, 0),
    employee_name VARCHAR(16777216)
);


insert into chalocodekare_db.snowflake_test.employee (employee_id, employee_name)
VALUES (1, 'first-snowflake'),
       (2, 'second-snowflake');