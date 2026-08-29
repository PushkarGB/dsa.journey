# Write your MySQL query statement below
select 
    p.product_id , 
    ROUND(
        case 
            when Sum(units) = 0 or Sum(units) is null
                then 0
            else Sum(price*units) / Sum(units)
        end,
        2
    ) as average_price
from Prices p left join Unitssold u
    on p.product_id = u.product_id
    And u.purchase_date Between p.start_date and p.end_date
Group by p.product_id
    