-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-04-30 10:51:35.999

-- tables
-- Table: horse
CREATE TABLE horse (
    id serial  NOT NULL,
    user_id int  NOT NULL,
    name varchar(255)  NOT NULL,
    color varchar(255)  NOT NULL,
    CONSTRAINT horse_pk PRIMARY KEY (id)
);


-- Table: race
CREATE TABLE race (
    id serial  NOT NULL,
    user_id int  NOT NULL,
    name varchar(255)  NOT NULL,
    place varchar(255)  NOT NULL,
    date date  NOT NULL,
    CONSTRAINT race_pk PRIMARY KEY (id)
);

-- Table: race_result
CREATE TABLE race_result (
    id serial  NOT NULL,
    race_id int  NOT NULL,
    winner_horse_id int  NOT NULL,
    second_place_horse_id int  NOT NULL,
    third_place_horse_id int  NOT NULL,
    CONSTRAINT race_result_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user" (
    id serial  NOT NULL,
    first_name varchar(50)  NOT NULL,
    last_name varchar(50)  NOT NULL,
    username varchar(50)  NOT NULL,
    password varchar(50)  NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
);

-- Reference: horse_user (table: horse)
ALTER TABLE horse ADD CONSTRAINT horse_user
    FOREIGN KEY (user_id)
    REFERENCES "user" (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: race_result_race (table: race_result)
ALTER TABLE race_result ADD CONSTRAINT race_result_race
    FOREIGN KEY (race_id)
    REFERENCES race (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: race_user (table: race)
ALTER TABLE race ADD CONSTRAINT race_user
    FOREIGN KEY (user_id)
    REFERENCES "user" (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

