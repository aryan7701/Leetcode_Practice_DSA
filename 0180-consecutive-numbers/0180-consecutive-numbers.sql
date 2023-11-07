# Write your MySQL query statement below
select distinct l1.num as ConsecutiveNums from Logs l1
where (select count(*) from Logs l2
              where l1.num=l2.num and l2.id-l1.id <= 2 and l2.id-l1.id >= 0) >= 3;