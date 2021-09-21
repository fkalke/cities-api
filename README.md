# Cities API

## Projeto criado no decorrer do Bootcamp Java Developer da Digital Innovation One

###Para testar o projeto é necessário instalar o PostgreSQL e criar um banco de dados com as seguintes especificações.
* DB: db-cities
* User: postgres
* Password: 123
####Se preferir, você poderá criar o banco como bem entender, sendo necessário alterar as informações de conexão no arquivo "application.properties".


### Populando o Banco de dados
####Você deverá fazer o [download](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL) dos arquivos .sql e utilizar os comandos abaixo para popular o seu banco de dados, com as informações dos países, estados e cidades. 

```shell script
psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;
```