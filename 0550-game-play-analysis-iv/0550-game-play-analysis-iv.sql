# Write your MySQL query statement below
Select 
Round(
    Count(player_id) / ( Select Count( Distinct player_id) from Activity ),
    2
) as fraction
from (
    SELECT Distinct f.player_id 
    FROM (
        SELECT
            player_id,
            MIN(event_date) AS first_date
        FROM Activity
        GROUP BY player_id
    ) f
    JOIN Activity a
        ON a.player_id = f.player_id
    AND a.event_date = DATE_ADD(f.first_date, INTERVAL 1 DAY)
) f
