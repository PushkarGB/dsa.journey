# Write your MySQL query statement below
-- select ROUND(
--     AVG(d.is_Immediate)*100,
--     2
-- ) as immediate_percentage
-- from
-- (
-- select 
--     (
--         case 
--             when MIN(order_date) =  MIN(customer_pref_delivery_date)
--                 then 1
--             else 0
--         end
--     ) is_immediate 
-- from 
--     Delivery
-- Group by customer_id 
-- ) d

SELECT
    ROUND(
        AVG(order_date = customer_pref_delivery_date) * 100,
        2
    ) AS immediate_percentage
FROM (
    SELECT
        order_date,
        customer_pref_delivery_date,
        ROW_NUMBER() OVER (
            PARTITION BY customer_id
            ORDER BY order_date
        ) AS rn
    FROM Delivery
) d
WHERE rn = 1;