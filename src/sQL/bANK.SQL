DROP DATABASE IF EXISTS bank;

CREATE DATABASE bank;
USE bank;

CREATE TABLE userinfo (
    id INT PRIMARY KEY,                  
    name VARCHAR(50),
    fname VARCHAR(50),
    dob VARCHAR(20),                     
    email VARCHAR(100),
    mob VARCHAR(15),
    status VARCHAR(20),
    address VARCHAR(200)
);

CREATE TABLE users (
    userid INT PRIMARY KEY,             
    pin VARCHAR(20) NOT NULL,
    bid INT,                             
    accountno INT,                        
    amount VARCHAR(20) DEFAULT '0',       
    FOREIGN KEY (accountno) REFERENCES userinfo(id)
);

CREATE TABLE userdetails (
    user INT PRIMARY KEY,                 
    aadharno VARCHAR(20),
    pan VARCHAR(20),
    gender VARCHAR(10),
    features VARCHAR(100),
    FOREIGN KEY (user) REFERENCES userinfo(id)
);
SELECT * FROM USERS;