INSERT INTO customer (id, name, phone, level) VALUES (1, '小明', '13800001111', 1);
INSERT INTO customer (id, name, phone, level) VALUES (2, '小红', '13900000222', 2);
INSERT INTO customer (id, name) VALUES (3, '阿强');

INSERT INTO orders (customer_id, amount, created_at) VALUES (1,128.50,'2026-10-01');
INSERT INTO orders (customer_id, amount, created_at) VALUES (1, 66.00,  '2026-10-03');
INSERT INTO orders (customer_id, amount, created_at) VALUES (2, 999.90, '2026-10-05');
INSERT INTO orders(customer_id, amount, created_at) VALUES (1, 0.83, '2026-10-06');
INSERT INTO orders(customer_id, amount, created_at) VALUES (2, 19.89, '2026-10-07');