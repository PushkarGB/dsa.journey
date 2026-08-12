# Write your MySQL query statement below
Select e.name , b.bonus 
from 
Employee e Left Join Bonus b
On e.empId = b.empId 
Where
b.bonus < 1000 OR b.bonus is null