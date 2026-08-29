# Write your MySQL query statement below
select dept.name as Department , emp.name as Employee , emp.salary as Salary
from Employee emp Join Department dept
    On emp.departmentid = dept.id
Where emp.salary = (
    select Max(salary)
    from employee e1
    where e1.departmentId = emp.departmentId
);