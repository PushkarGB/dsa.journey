# Write your MySQL query statement below
select email as Email 
from Person
Group by email
Having Count(*) > 1;