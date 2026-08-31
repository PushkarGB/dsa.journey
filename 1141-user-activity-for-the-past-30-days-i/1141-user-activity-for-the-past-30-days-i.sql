# Write your MySQL query statement below
select activity_date as day , Count(Distinct user_id) as active_users
from Activity
Where activity_date 
    Between Date_sub('2019-07-27',INTERVAL 29 DAY) 
        and '2019-07-27'
Group by activity_date 