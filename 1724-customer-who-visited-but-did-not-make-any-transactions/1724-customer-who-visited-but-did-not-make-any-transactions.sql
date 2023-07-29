select customer_id, count(Visits.visit_id) as count_no_trans
from Visits
left join Transactions ON
Visits.visit_id = Transactions.visit_id
where Transactions.transaction_id IS NULL
Group by Visits.customer_id