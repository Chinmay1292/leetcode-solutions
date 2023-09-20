select e.name as Employee, e.salary as Salary, d.name as Department from Department d join Employee e on
e.DepartmentId = d.id where 3 > (
    select count(DISTINCT e1.salary)
    from Employee e1 where e1.salary > e.salary and e.departmentId = e1.departmentId
)