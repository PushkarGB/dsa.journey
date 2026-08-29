# Write your MySQL query statement below
select w.id 
from Weather w 
where w.temperature > 
    ( 
    select w1.temperature
    from Weather w1
    where DateDiff(w.recordDate,w1.recordDate) = 1
    ) 