-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-04-28 16:30:59.408

-- tables
-- Table: horse
CREATE TABLE horse (
    id serial  NOT NULL,
    race_id int  NULL,
    name varchar(255)  NOT NULL,
    color varchar(255)  NOT NULL,
    CONSTRAINT horse_pk PRIMARY KEY (id)
);

-- Table: race
CREATE TABLE race (
    id serial  NOT NULL,
    name varchar(255)  NOT NULL,
    place varchar(255)  NOT NULL,
    date date  NOT NULL,
    CONSTRAINT race_pk PRIMARY KEY (id)
);

-- Table: race_result
CREATE TABLE race_result (
    id serial  NOT NULL,
    race_id int  NOT NULL,
    CONSTRAINT race_result_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user" (
    id serial  NOT NULL,
    first_name varchar(50)  NOT NULL,
    larst_name varchar(50)  NOT NULL,
    username varchar(50)  NOT NULL,
    password varchar(50)  NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: horse_race (table: horse)
ALTER TABLE horse ADD CONSTRAINT horse_race
    FOREIGN KEY (race_id)
    REFERENCES race (id)  
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

-- End of file.

