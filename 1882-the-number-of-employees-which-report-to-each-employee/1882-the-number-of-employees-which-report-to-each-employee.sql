
SELECT 
    e.employee_id , e.name , 
    t.reports_count , t.average_age
FROM Employees e 
INNER JOIN
    (
    SELECT 
        reports_to ,
        COUNT(reports_to) AS 'reports_count', 
        ROUND(AVG(age)) AS 'average_age' 
    FROM 
        Employees 
    GROUP BY 
        reports_to
    HAVING 
        reports_to IS NOT NULL
    ) t 
ON e.employee_id = t.reports_to 
ORDER BY e.employee_id;