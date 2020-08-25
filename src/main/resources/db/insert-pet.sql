SET FOREIGN_KEY_CHECKS = 0;

TRUNCATE TABLE pet_animal;

INSERT INTO pet(`id`, `name`, `breed`, `types`, `sex`, `age`)
VALUES(200, 'bobby', 'german shepherd', 'DOG', 'MALE', 15);
VALUES(201, 'bobby', 'german shepherd', 'CAT', 'MALE', 15);
VALUES(202, 'bobby', 'german shepherd', 'HAMSTER', 'MALE', 15);
VALUES(203, 'bobby', 'german shepherd', 'DOG', 'MALE', 15);
VALUES(204, 'bobby', 'german shepherd', 'SNAKE', 'MALE', 15);



SET FOREIGN_KEY_CHECKS = 1;