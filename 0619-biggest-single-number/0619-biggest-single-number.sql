# Write your MySQL query statement below
Select Max(num) as num
from (
    select num 
    from MyNumbers
    Group by num
    Having count(*) = 1
) e