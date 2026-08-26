# Write your MySQL query statement below
select name , unique_id 
from Employees Left Join EmployeeUNI 
on Employees.id = EmployeeUNI.id;