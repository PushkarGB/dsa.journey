# Write your MySQL query statement below
select email as Email 
from 
(
    select email,
    Dense_Rank() over (Order by Email) as rnk
    from Person
) p
Group By rnk
Having Count(*) > 1;