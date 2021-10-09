DROP DATABASE IF EXISTS CustomerItemProject;
CREATE DATABASE IF NOT EXISTS CustomerItemProject;
use CustomerItemProject;

CREATE TABLE customer(
    customerID   varchar(5)  not null,
    customerName varchar(30) not null,
    customerMobile int(10),
    customerSalary  varchar(30) not null,
    CONSTRAINT PRIMARY KEY (customerID)
);

SELECT * FROM customer;