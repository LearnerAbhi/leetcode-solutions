# Write your MySQL query statement below
SELECT d.name as Department, e.name as Employee,
e.salary as Salary 
FROM Employee e JOIN Department d
on e.departmentId = d.id 
JOIN (
    SELECT departmentId, max(salary) as maxSalary
    FROM Employee e
    GROUP BY departmentId
) m
ON m.departmentId = e.departmentId
AND e.salary = m.maxSalary;