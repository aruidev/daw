```
ALTER TABLE[BD.]nomTaula [definicioAlter [, definicioAlter]...;
```

Canviar el nom d'una taula:
```
ALTER TABLE nomTaula RENAME [TO|AS] nomNovaTaula;
```

Afegir una columna:
```
ALTER TABLE nomTaula
	ADD [COLUMN] definicioColumna 
		[FIRST | AFTER nomColumna ];
```
A tenir en compte: 
- La nova columna si no se li diu el contrari passarà a ser l'última columna de la taula. 
- Si afegim una nova columna a una taula que ja té registres de dades, les files inicialment tindran valor NULL per aquesta nova columna.

Modificar una columna:
```
ALTER TABLE nomTaula 
	MODIFY [COLUMN] definicioColumna 
		[FIRST | AFTER nomColumna ];
```

Canviar el nom d'una columna:
```
ALTER TABLE nomTaula 
	CHANGE [COLUMN] nomVell nomNou definicioColumna 
		[FIRST | AFTER nomColumna ];
```

Esborrar una columna:
```
ALTER TABLE nomTaula 
	DROP [COLUMN] nomColumna;
```

Esborrar el contingut d'una taula
```
TRUNCATE TABLE nom_taula;
```

Afegir i treure restriccions

Restricció NOT NULL:
```
ALTER TABLE nomTaula
	MODIFY [COLUMN] nomColumna (NULL | NOT NULL);
```

La restricció UNIQUE, PRIMARY KEY, FOREIGN KEY:
```
ALTER TABLE nomTaula 
	ADD CONSTRAINT [nom_constraintl] PRIMARY KEY (camp1, ... )
	| ADD CONSTRAINT [nom_constraint] UNIQUE (camp1,...)
	| ADD [CONSTRAINT [nom_fk]] FOREIGN KEY (camp1,..) 
		REFERENCES taula_ref (camp1,...) 
			[ON DELETE {RESTRICT|CASCADE|SET NULL|NOT ACTION }] 
			[ON UPDATE {RESTRICT|CASCADE|SET NULL|NOT ACTION }] 
	| ADD CONSTRAINT [CK_nom] CHECK (expr)
```

Esborrar una restricció:
```
ALTER TABLE nomTaula 
	DROP PRIMARY KEY 
	| DROP {INDEX|KEY} index_name 
	| DROP FOREIGN KEY nom_clau_forana 
	| DROP CONSTRAINT nom_de_la_restricció (en el cas PK `PRIMARY`)
```

Atenció !!! 
- Quan esborreu una clau forana mitjançant ALTER TABLE DROP FOREIGN KEY O DROP CONSTRAINT no esborra l’index associat a aquesta clau forana.

