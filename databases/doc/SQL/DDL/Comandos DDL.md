
| COMANDA                   | EXPLICACIO                                                                | EXEMPLE                                                                                      |
| ------------------------- | ------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| CREATE DATABASE           | Crea una nova base de dades                                               | CREATE DATABASE nom_base_de_dades;                                                           |
| USE                       | Selecciona la base de dades amb la qual treballar                         | USE nom_base_de_dades;                                                                       |
| CREATE TABLE              | Crea una taula dins de la base de dades seleccionada                      | CREATE TABLE alumnes (id INT, nom VARCHAR(50));                                              |
| CREATE TABLE + CONSTRAINT | Crea una taula amb restriccions sobre les columnes                        | CREATE TABLE alumnes (id INT PRIMARY KEY, nom VARCHAR(50) NOT NULL);                         |
| PRIMARY KEY               | Defineix una columna com a clau primària, única per a cada fila           | CREATE TABLE alumnes (id INT PRIMARY KEY, nom VARCHAR(50));                                  |
| FOREIGN KEY               | Defineix una relació entre dues taules mitjançant una clau forana         | CREATE TABLE ordres (id INT, alumne_id INT, FOREIGN KEY (alumne_id) REFERENCES alumnes(id)); |
| NOT NULL                  | Assegura que una columna no pugui tenir valors nuls                       | CREATE TABLE alumnes (id INT PRIMARY KEY, nom VARCHAR(50) NOT NULL);                         |
| UNIQUE                    | Assegura que els valors en una columna siguin únics                       | CREATE TABLE alumnes (id INT, email VARCHAR(100) UNIQUE);                                    |
| CHECK                     | Estableix una condició per a les dades d'una columna                      | CREATE TABLE alumnes (id INT, edat INT CHECK (edat >= 18));                                  |
| DEFAULT                   | Assigna un valor per defecte a una columna si no es proporciona cap valor | CREATE TABLE alumnes (id INT, nom VARCHAR(50) DEFAULT 'Desconegut');                         |
| ALTER TABLE               | Modifica una taula existent, afegint, canviant o eliminant columnes       | ALTER TABLE alumnes ADD COLUMN data_naixement DATE;                                          |
| DROP TABLE                | Elimina una taula de la base de dades                                     | DROP TABLE alumnes;                                                                          |
| DROP DATABASE             | Elimina una base de dades                                                 | DROP DATABASE nom_base_de_dades;                                                             |

BORRAR FILES CUMPLINT INTEGRITAT REFERENCIAL:
1. ON DELETE RESTRICT / NOT ACTION (default quan no especificat)
2. ON DELETE SET NULL
3. ON DELETE CASCADE
   *No utilitzar cascada per borrar files, ja que podem borrar coses accidentalment*
   
MODIFICAR FILES CUMPLINT INTEGRITAT REFERENCIAL:
1. ON UPDATE RESTRICT / NOT ACTION 
2. ON UPDATE SET NULL
3. ON UPDATE CASCADE
   *Utilitzar cascade per modificar i així es modificaran tots els camps fills*

CHECKS:
```
CONSTRAINT ck_empleats_sou_min CHECK (sou>0), 
CONSTRAINT ck_empleats_sou_max CHECK (sou<6000)
```

CAMP CALCULAT:
```
nom_complet VARCHAR(30) GENERATED ALWAYS AS ( CONCAT(nom, ' ', cognom1) ),
```

VEURE INFO PER COMANDA:
```
SHOW DATABASES;
SHOW TABLES;
DESCRIBE taula;
```

UNIQUE KEY (clau candidata):
```
CONSTRAINT uk_empleats_dni UNIQUE (dni)
```

