# Write your MySQL query statement below
SELECT
p.project_id ,
ROUND(AVG(e.experience_years),2) as average_years
FROM Project p
NATURAL JOIN Employee e
GROUP BY p.project_id