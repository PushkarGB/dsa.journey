# Write your MySQL query statement below
-- select w.id 
-- from Weather w 
-- where w.temperature > 
--     ( 
--     select w1.temperature
--     from Weather w1
--     where DateDiff(w.recordDate,w1.recordDate) = 1
--     ) 

-- select today.id
-- from weather today
-- join weather yesterday
--     on DateDiff(today.recordDate,yesterday.recordDate) = 1
-- where today.temperature > yesterday.temperature;

select today.id
from weather today
join weather yesterday
    on yesterday.recordDate = Date_sub(today.recordDate,Interval 1 day)
where today.temperature > yesterday.temperature;