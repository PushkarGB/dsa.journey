# Write your MySQL query statement below
-- select customer_id , count(*) as count_no_trans
-- from Visits
-- where visit_id not in (
--     select visit_id from Transactions 
-- )
-- group by customer_id

select customer_id , count(*) as count_no_trans
from Visits
Left Join Transactions
    On Visits.visit_id = Transactions.visit_id
Where Transactions.visit_id is Null
Group by customer_id 