select e.name as Employee
from Employee e 
Join Employee m
    on e.managerID = m.id
Where e.salary > m.salary;