select Distinct l1.num as ConsecutiveNums
from Logs l1
join Logs l2
    on l1.num = l2.num
    and l1.id = l2.id-1
join Logs l3
    on l3.num = l1.num
    and l3.id = l1.id+2
