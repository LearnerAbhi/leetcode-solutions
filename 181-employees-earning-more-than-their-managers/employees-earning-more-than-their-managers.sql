# Write your MySQL query statement below
SELECT name AS Employee FROM Employee AS e 
WHERE e.salary >
( SELECT salary FROM Employee AS m 
WHERE m.id = e.managerId )