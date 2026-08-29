# Write your MySQL query statement below
-- select m.name
-- from Employee e
-- join Employee m
-- on e.managerID = m.id
-- group by m.id
-- Having count(*) >= 5

SELECT m.name
FROM Employee m
WHERE (
    SELECT COUNT(*)
    FROM Employee e
    WHERE e.managerId = m.id
) >= 5;