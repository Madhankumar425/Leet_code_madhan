select a.id as Id
from weather a,weather b
where  datediff(a.recorddate,b.recorddate)=1 
and a.temperature > b.temperature 

