# Write your MySQL query statement below
select 
    employee_id,
    COALESCE(
        MAX(
            CASE 
                WHEN primary_flag = 'Y'
                    THEN department_id
                ElSE null
            END 
        ),
        MIN(department_id)
    ) as department_id
from Employee
group by employee_id