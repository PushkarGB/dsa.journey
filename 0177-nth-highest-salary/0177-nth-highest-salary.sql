CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
    SELECT MAX(salary)
        FROM (
            Select salary,
                DENSE_RANK() over (ORDER BY salary DESC) as rnk
            From Employee
        ) t
        Where t.rnk = N
  );
END