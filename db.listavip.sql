CREATE DATABASE listavip;
USE listavip;

CREATE TABLE convidados(id INT NOT NULL AUTO_INCREMENT, 
nome varchar(25),
email varchar(40),
telefone int,PRIMARY KEY(id));

INSERT INTO convidados(nome,email,telefone)VALUES('Bruno','bruno@bruno.com', 999999999);

SELECT * FROM convidados;