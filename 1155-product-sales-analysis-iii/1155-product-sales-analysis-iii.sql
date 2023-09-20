select product_id, year as first_year, quantity, price from Sales
where(product_id, year) in (
    Select product_id, MIN(year)
    from Sales
    Group by product_id
)