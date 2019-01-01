CREATE DATABASE listavip;
USE listavip;

CREATE TABLE convidado(id INT NOT NULL AUTO_INCREMENT, 
nome varchar(25),
email varchar(40),
telefone int,PRIMARY KEY(id));

INSERT INTO convidado(nome,email,telefone)VALUES('Bruno','bruno@bruno.com', 999999999);

SELECT * FROM convidado;

DROP TABLE convidado;