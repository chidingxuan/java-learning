-- 1.查所有客户
SELECT * FROM customer;

-- 2
SELECT * FROM customer WHERE level >= 1 ORDER BY id DESC;

-- 3 
SELECT * FROM orders WHERE amount > 100 ORDER BY amount DESC;

--4
UPDATE customer SET phone = '13800001111' WHERE id = 1;

--5
SELECT c.id, c.name, COUNT(o.id) AS order_count
FROM customer c
JOIN orders o ON o.customer_id = c.id
GROUP BY c.id, c.name;