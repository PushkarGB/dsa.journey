# Write your MySQL query statement below
-- select 
--     delivery_id,
--     customer_id,
--     MIN(order_date) as first_order_date,
--     MIN(customer_pref_delivery_date) as first_pref_d_date
-- from 
--     Delivery
-- Group by customer_id
select ROUND(
    AVG(d.is_Immediate)*100,
    2
) as immediate_percentage
from
(
select 
    (
        case 
            when MIN(order_date) =  MIN(customer_pref_delivery_date)
                then 1
            else 0
        end
    ) is_immediate 
from 
    Delivery
Group by customer_id 
) d