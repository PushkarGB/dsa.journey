# Write your MySQL query statement below
select dept.name as Department , e.name as Employee , e.salary as Salary
from (
    select e.*,
    Dense_rank() over(
        Partition By departmentId 
        order by salary desc
    ) as rnk
    from Employee e
) e 
Join department dept 
    On dept.id = e.departmentId
    Where e.rnk < 4;