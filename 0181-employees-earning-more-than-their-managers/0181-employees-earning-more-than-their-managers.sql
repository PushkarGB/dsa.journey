# Write your MySQL query statement below
select e.name as Employee
from employee e 
where e.managerID is not null 
and e.salary > (
    select e1.salary
    from Employee e1 
    where e1.id = e.managerID
)