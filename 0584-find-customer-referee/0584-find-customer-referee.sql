# Write your MySQL query statement below
SELECT 
    name
FROM
    Customer
WHERE
    referee_id != 2 IS NOT FALSE /*becz comparing anything will NULL returns UNKNOWN , not true or false*/