# Write your MySQL query statement below
select department, Employee, salary from(
select d.name as department,e.name as Employee,e.salary, dense_rank() over(partition by d.name order by salary desc) as rank_
 from Employee e join department d on e.departmentId=d.id
) as Table1
where rank_=1