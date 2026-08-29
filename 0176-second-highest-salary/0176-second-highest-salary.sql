# Write your MySQL query statement below
-- Select MAX(salary) as SecondHighestSalary
--     from Employee
--         Where salary < (Select Max(salary) from Employee);

Select Max(salary) as SecondHighestSalary 
    From (
        Select 
            salary,
            DENSE_RANK() over (Order By salary DESC) as rnk
        From Employee
    ) t 
    Where rnk = 2;        