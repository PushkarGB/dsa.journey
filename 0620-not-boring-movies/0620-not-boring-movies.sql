# Write your MySQL query statement below
select * from Cinema
where id % 2 = 1 AND (Trim(description) <> 'boring' Or description is Null)
order by rating desc