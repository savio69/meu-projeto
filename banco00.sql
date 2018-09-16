CREATE DATABASE tcc00;

USE tcc00;

CREATE TABLE test00( id INT PRIMARY KEY AUTO_INCREMENT, pontuacao INT, palavras_chave TEXT, email VARCHAR(150));

DESCRIBE test00;
#+----------------+--------------+------+-----+---------+----------------+
#| Field          | Type         | Null | Key | Default | Extra          |
#+----------------+--------------+------+-----+---------+----------------+
#| id             | int(11)      | NO   | PRI | NULL    | auto_increment |
#| pontuacao      | int(11)      | YES  |     | NULL    |                |
#| palavras_chave | text         | YES  |     | NULL    |                |
#| email          | varchar(150) | YES  |     | NULL    |                |
#+----------------+--------------+------+-----+---------+----------------+
