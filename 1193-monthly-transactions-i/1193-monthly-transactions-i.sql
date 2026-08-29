# Write your MySQL query statement below
select
    DATE_FORMAT(trans_date, '%Y-%m') as month,
    country,
    Count(*) as trans_count,
    Sum(state='approved') as approved_count,
    Sum(amount) as trans_total_amount,
    Sum(amount * (state='approved')) as approved_total_amount
From 
    Transactions t
Group By DATE_FORMAT(trans_date, '%Y-%m') , Country;