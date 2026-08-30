# Write your MySQL query statement below
select employee_id , department_id
from Employee e
where primary_flag = 'Y' 
or (
    Select Count(*) from Employee e2
    where e2.employee_id = e.employee_id
) = 1;
