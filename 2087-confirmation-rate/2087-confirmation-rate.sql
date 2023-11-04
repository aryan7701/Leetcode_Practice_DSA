# Write your MySQL query statement below
SELECT _signups.user_id,
COALESCE(ROUND((SUM(CASE
              WHEN action = 'confirmed' 
                    THEN 1.00
              ELSE 0.00
            END)/COUNT(_confirmations.action)), 2), 0)
            AS confirmation_rate
            
FROM Confirmations _confirmations
RIGHT JOIN Signups _signups
ON _confirmations.user_id = _signups.user_id
GROUP BY _signups.user_id
