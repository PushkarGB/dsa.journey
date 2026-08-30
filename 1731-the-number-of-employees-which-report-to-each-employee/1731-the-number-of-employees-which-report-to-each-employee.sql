# Write your MySQL query statement below
select 
    m.employee_id,
    m.name,Count(e.employee_id) as reports_count,
    ROUND(AVG(e.age),0) as average_age
from Employees m 
    Join Employees e
        On m.employee_id = e.reports_to
    group by m.employee_id
    order by m.employee_id