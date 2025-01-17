Data Definition Language

Instrucciones no se pueden tirar atrás,
No commits ni rollbacks,
Cuidado con:
- DROP
- DELETE
- ALTER
- UPDATE

Intro:
Exemple:
```
CREATE DATABASE test;

USE test;

CREATE TABLE t1 (c1 INT);

/* Comentari que nomes es guarda al fitxer */
CREATE TABLE alumnes (
	alumne_id 	INT COMMENT "Comentari que es guarda a la columna",
	nom 		VARCHAR(30) NOT NULL,
    cognoms 	VARCHAR(30),
    data_naix	DATE,
    CONSTRAINT pk_alumnes PRIMARY KEY (alumne_id) COMMENT "Restriccio PK de taula alumnes = alumne_ID"
);
```

Poner la PRIMARY KEY siempre con CONSTRAINT como en este ejemplo.

Exemple:
```
CREATE TABLE empleats (
	empleat_id 		INT UNSIGNED AUTO_INCREMENT,
    departament_id	TINYINT UNSIGNED NOT NULL,
    dni				CHAR(10) NOT NULL,
    nom 			VARCHAR(30),
    CONSTRAINT pk_empleats PRIMARY KEY (empleat_id),
    CONSTRAINT fk_empleats_departaments FOREIGN KEY (departament_id)
		REFERENCES departaments (departament_id)
	CONSTRAINT uk_empleats_dni UNIQUE (dni)
	CONSTRAINT ck_empleats_len_nom CHECK (length(nom)>3)  
);
```

Exemple visual:
![[Pasted image 20241219105748.png]]

- Primary Key
- Foreign Key - References
- Unique Key
- Check
