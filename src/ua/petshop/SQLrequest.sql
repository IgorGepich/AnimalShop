CREATE DATABASE animal_shops;

CREATE TABLE IF NOT EXISTS pet_shops
(
    id SERIAL NOT NULL CONSTRAINT pet_shop_key PRIMARY KEY,
    shop_name VARCHAR NOT NULL,
    foundation_date TIMESTAMP NOT NULL,
    number_of_employee INTEGER NOT NULL ,
    shop_addr VARCHAR NOT NULL,
    delivery_availability BOOLEAN NOT NULL,
    list_of_animal VARCHAR NOT NULL
);

INSERT INTO pet_shops
VALUES (DEFAULT, 'Zoo Land', '2000-01-01', '10', 'Sumskaya str.', true, 'dog, cat, parrot');

DELETE FROM pet_shops
WHERE shop_name = 'Zoo Land';

SELECT * FROM pet_shops;

CREATE TABLE IF NOT EXISTS pets
(
    id SERIAL NOT NULL CONSTRAINT pet_key PRIMARY KEY,
    pets_name VARCHAR,
    pets_month_age INTEGER NOT NULL ,
    pets_sex VARCHAR NOT NULL ,
    need_cell BOOLEAN NOT NULL,
    pet_shop_id INTEGER NOT NULL,
    CONSTRAINT fk_pet_shops_pets_id FOREIGN KEY (pet_shop_id) REFERENCES pet_shops (id)
);

INSERT INTO pets
VALUES (DEFAULT, 'Zhuchka', '24', 'boy', false, 1);

INSERT INTO pets
VALUES (DEFAULT, 'Belka', '12', 'girl', false, 1);

INSERT INTO pets
VALUES (DEFAULT, 'Muhtar', '34', 'boy', true, 1);

SELECT * FROM pets;

UPDATE pets SET pets_sex = 'girl' WHERE pets_name = 'Zhuchka';

SELECT * FROM pets;

DELETE FROM pets WHERE pets_name = 'Zhuchka';