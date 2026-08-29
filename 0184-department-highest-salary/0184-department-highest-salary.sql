# Write your MySQL query statement below
-- select dept.name as Department , emp.name as Employee , emp.salary as Salary
-- from Employee emp Join Department dept
--     On emp.departmentid = dept.id
-- Where emp.salary = (
--     select Max(salary)
--     from employee e1
--     where e1.departmentId = emp.departmentId
-- );

-- select dept.name as Department, emp.name as Employee , emp.salary as Salary
-- from Employee emp
-- Join (
--     Select departmentId , Max(salary) as max_salary
--     from Employee
--     Group by departmentId
-- ) m 
--     on emp.departmentid = m.departmentid
--     And emp.salary = m.max_salary
-- JOIN Department dept
--     ON dept.id = emp.departmentid;

select dept.name as Department, e.name as Employee , e.salary as Salary
from 
(
    select 
        e.*,
        MAX(salary) over(
            PARTITION BY departmentid 
        ) as max_salary
    From Employee e
) e
Join Department dept 
    on dept.id = e.departmentid
    Where e.salary = e.max_salary;

