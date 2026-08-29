# Write your MySQL query statement below
select w.id 
from Weather w 
where w.temperature > 
    ( 
    select w1.temperature
    from Weather w1
    where w1.recordDate < w.recordDate 
    order by w1.recordDate Desc
    limit 1
    ) 
And DateDiff(w.recordDate , (
    select w1.recordDate
    from Weather w1
    where w1.recordDate < w.recordDate 
    order by w1.recordDate Desc
    limit 1
)) = 1;