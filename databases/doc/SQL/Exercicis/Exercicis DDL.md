![[Pasted image 20241219112027.png]]
```
CREATE TABLE jugadors (
	jugador_id		INT UNSIGNED AUTO_INCREMENT,
    nom				VARCHAR(25) NOT NULL,
    cognom1			VARCHAR(30) NOT NULL,
    cognom2			VARCHAR(30) NOT NULL,
    posicio			ENUM('BASE', 'ESCOLTA', 'ALER', 'ALER-PIVOT', 'PIVOT') NOT NULL COMMENT "posició dins del terreny de joc",
    dorsal			TINYINT UNSIGNED COMMENT "nº que porta a la samarreta",
    punts			SMALLINT UNSIGNED,
    valoracio		TINYINT UNSIGNED,
    CONSTRAINT pk_jugadors PRIMARY KEY (jugador_id),
    CONSTRAINT ck_jugadors_dorsal CHECK (dorsal <= 100),
    CONSTRAINT ck_jugadors_punts CHECK (punts <= 300),
    CONSTRAINT ck_jugadors_valoracio CHECK (punts <= 10)
);
```


![[Pasted image 20241219115731.png]]
![[Pasted image 20241219115737.png]]
```
CREATE TABLE factures (
	numero				INT UNSIGNED,
    serie				CHAR(3),
    data				DATE,
    any					YEAR,
    client_id			SMALLINT UNSIGNED,
    CONSTRAINT pk_factures PRIMARY KEY (numero, serie, any)
);

CREATE TABLE linies_factura (
	numero				INT UNSIGNED,
    serie				CHAR(3),
    any					YEAR,
    linia				TINYINT UNSIGNED,
    producte_id			INT UNSIGNED COMMENT "125 productes",
    qt					INT UNSIGNED NOT NULL,
    import				FLOAT NOT NULL,
    descompte			FLOAT COMMENT "Descompte en tant per 1",
    subtotal			FLOAT GENERATED ALWAYS AS ((qt * import) - qt * import * IFNULL(descompte,0)) NOT NULL,
    CONSTRAINT pk_linies_factura PRIMARY KEY (numero, serie, any, linia),
    CONSTRAINT fk_linies_factura_factures FOREIGN KEY (numero, serie, any)
		REFERENCES factures (numero, serie, any)
);
```

