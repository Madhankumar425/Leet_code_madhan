select name as Customers
from Customers left join Orders
on customers.id = orders.customerId
where customerid is null

