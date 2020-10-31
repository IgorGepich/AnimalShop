CREATE DATABASE animal_shops;

CREATE TABLE IF NOT EXISTS pet_shops
(
    id INTEGER NOT NULL PRIMARY KEY,
    shop_name VARCHAR NOT NULL,
    foundation_date TIMESTAMP NOT NULL,
    number_of_employee INTEGER NOT NULL ,
    shop_addr VARCHAR NOT NULL,
    delivery_availability BOOLEAN NOT NULL,
    list_of_animal VARCHAR NOT NULL
);

INSERT INTO pet_shops
VALUES (1, 'Zoo Land', '2000-01-01', '10', 'Sumskaya str.', true, 'dogs, cats, parrots');

DELETE FROM pet_shops
WHERE shop_name = 'Zoo Land';

SELECT *
FROM pet_shops;

CREATE TABLE IF NOT EXISTS pets
(
    pets_name VARCHAR,
    pets_month_age INTEGER NOT NULL ,
    pets_sex VARCHAR NOT NULL ,
    need_cell BOOLEAN NOT NULL
);

SELECT *
FROM pets;

INSERT INTO pets
VALUES ('Zhuchka', '24', 'boy', false);

INSERT INTO pets
VALUES ('Belka', '12', 'girl', false);

INSERT INTO pets
VALUES ('Muhtar', '34', 'boy', true);

SELECT * FROM pets;

UPDATE pets SET pets_sex = 'girl' WHERE pets_name = 'Zhuchka';

SELECT * FROM pets;

DELETE FROM pets WHERE pets_name = 'Zhuchka';