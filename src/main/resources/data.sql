DROP TABLE IF EXISTS employee;

CREATE TABLE 'employee'(
'id' int AUTO_INCREMENT PRIMARY KEY,
'name' varchar(100) NOT NULL,
'email' varchar(100) NOT NULL,
'country' varchar(20) NOT NULL
);

INSERT INTO 'employee' ('name','email','country') VALUES ('Bhusan','bhusan@example.com','India'); 
INSERT INTO 'employee' ('name','email','country') VALUES ('Bharat','bharat@example.com','India'); 
