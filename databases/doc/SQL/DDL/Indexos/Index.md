Nom: idx_taula_camps

```
CREATE [UNIQUE|FULLTEXT|SPATIAL] INDEX nom_index
	[index_type] USING BTREE | HASH
	ON nom_taula (index_col_name,...) 
	[index_option] 
	[algorithm_option | lock_option] ...
```

Exemples:

```
#Crear un índex amb 1 camp 
CREATE INDEX idx_factures_data 
	USING BTREE ON FACTURES (data_factura) 

#Crear un índex amb 3 camps 
CREATE INDEX idx_dni_cognom_codialumne 
	USING HASH ON ALUMNES (dni,cognom,codi_alumne) 

#Crear un índex del tipus HASH 
CREATE INDEX idx_dni 
	USING HASH ON ALUMNES (dni)
```

