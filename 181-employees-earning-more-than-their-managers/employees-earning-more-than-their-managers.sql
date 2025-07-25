select a.name as Employee 
from Employee a left join Employee b
on b.id = a.managerId
where a.salary  > b.salary
