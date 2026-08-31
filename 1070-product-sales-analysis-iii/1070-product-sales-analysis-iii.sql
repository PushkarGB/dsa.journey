# Write your MySQL query statement below
select product_id , year as first_year , quantity , price
from (
    Select s.* , 
        DENSE_RANK() over(
            partition by product_id
            order by year asc
        ) as rnk
        from Sales s
) s 
Where s.rnk = 1;