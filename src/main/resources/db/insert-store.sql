SET FOREIGN_KEY_CHECKS = 0;

TRUNCATE TABLE store;
TRUNCATE TABLE pet;

INSERT INTO store(`id`, `store_name`, `store_number`, `address`, `city`, `state`, `country`)
VALUES(500, 'tb', 612, '13 bab street', 'ikeja', 'lagos', 'nigeria'),
(501, 'tb', 248, '55 mattew street', 'lekki', 'lagos', 'nigeria'),
(502, 'tb', 048, '78 orobo street', 'agege', 'lagos', 'nigeria');


SET FOREIGN_KEY_CHECKS = 1;