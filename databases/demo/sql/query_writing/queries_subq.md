Exercici 1 - Obtenir el id_empleat, nom i salari dels empleats que tenen el mateix
salari que l'empleat ‘Pat Fay’
```mysql
SELECT e.empleat_id, e.nom, e.salari
	FROM empleats e
WHERE e.salari = (SELECT e.salari 
					FROM empleats e 
					WHERE CONCAT(e.nom, ' ', e.cognoms) = 'Pat Fay')
	AND CONCAT(e.nom, ' ', e.cognoms) != 'Pat Fay';
```

Exercici 2 - Obtenir el id_empleat, nom i salari dels empleats que tenen un salari
superior al de l'empleat ‘Pat Fay’.
```mysql
SELECT e.empleat_id, e.nom, e.salari
	FROM empleats e
WHERE e.salari > (SELECT e.salari 
					FROM empleats e 
					WHERE CONCAT(e.nom, ' ', e.cognoms) = 'Pat Fay')
	AND CONCAT(e.nom, ' ', e.cognoms) != 'Pat Fay';
```

Exercici 3 - Obtenir el id_empleat, cognoms i codi departament dels empleats
que treballen en el mateix departament que l'empleat ‘Pat Fay’.
```mysql
SELECT 
	e.empleat_id, e.cognoms, d.departament_id
FROM 
	empleats e
INNER JOIN 
	departaments d ON e.departament_id = d.departament_id
WHERE 
	e.departament_id = (SELECT e.departament_id 
						FROM empleats e 
						WHERE CONCAT(e.nom, ' ', e.cognoms) = 'Pat Fay')
	AND CONCAT(e.nom, ' ', e.cognoms) != 'Pat Fay';
```

Exercici 4 - Obté el id_empleat, nom i salari dels empleats que guanyen més del
departament de ‘Vendes’
```mysql
SELECT
	e.empleat_id, e.nom, e.salari
FROM
	empleats e
WHERE 
	e.salari = (SELECT MAX(e.salari) FROM empleats e WHERE e.departament_id = 50);
```

Exercici 5 - Obté el id_empleat, nom i salari dels empleats que guanyen menys
del departament de ‘Vendes’.
```mysql
SELECT 
	e.empleat_id, e.nom, e.salari 
FROM 
	empleats e 
WHERE
	e.salari = (SELECT MIN(e.salari) 
					FROM empleats e 
					WHERE e.departament_id = 50);
```

Exercici 6 - Obté el id_empleat, nom i salari dels empleats del departament de
‘Compres’ que guanyen més que la mitjana d’aquest departament.
```mysql
SELECT 
	e.empleat_id, e.nom, e.salari
FROM 
	empleats e
WHERE 
	e.salari > (SELECT AVG(e.salari)
					FROM empleats e
                    GROUP BY e.departament_id
                    HAVING e.departament_id = 80);
```

Exercici 7 - Obté el nom, cognom i data de contractació dels empleats que van
ser contractats després de l'empleat ‘Pat Fay’. Ordena per data de contractació.
```mysql
SELECT
	e.nom, e.cognoms, e.data_contractacio
FROM 
	empleats e 
WHERE 
	e.data_contractacio > (SELECT e.data_contractacio 
							FROM empleats e
							WHERE e.nom = 'Pat' && e.cognoms = 'Fay');
```

Exercici 8 - Volem saber els cognoms, salari i codi de departament dels empleats
que guanyen més que la mitjana dels salaris del departament ‘Compres’. Exlou
els que siguin d’aquest departament.
```mysql
SELECT 
	e.cognoms, e.salari, e.departament_id
FROM
	empleats e 
INNER JOIN 
	departaments d ON d.departament_id = e.departament_id
WHERE e.salari > (SELECT AVG(e.salari)
					FROM empleats e
					WHERE d.nom = 'Compres');
```

Exercici 9 - Partint de la consulta anterior, volem saber també el nom del
departament dels empleats. Ordena per salari.
```mysql
SELECT 
	e.cognoms, e.salari, e.departament_id, d.nom
FROM
	empleats e 
INNER JOIN 
	departaments d ON d.departament_id = e.departament_id
WHERE 
	e.salari > (SELECT AVG(e.salari)
					FROM empleats e
					WHERE d.nom = 'Compres')
ORDER BY 
	e.salari;
```

Exercici 10 - Volem saber el codi, nom i cognom del jefe de l'empleat 103. Utilitza
l'operador IN
```mysql
SELECT 
	e.empleat_id, e.nom, e.cognoms
FROM 
	empleats e
WHERE 
	e.id_cap = (SELECT e.id_cap FROM empleats e WHERE e.empleat_id = 103);
```

Exercici 11 - Quins departaments no tenim empleats? Mostra el codi i nom de
departament Utilitza l'operador NOT IN
```mysql
SELECT d.nom 
	FROM departaments d
	LEFT JOIN empleats e ON d.departament_id = e.departament_id
WHERE d.departament_id NOT IN (SELECT e.departament_id FROM empleats e);
```

Exercici 12 - Quins empleats (nom/cognom/nom_departament) pertanyen als
mateixos departaments situats a Seattle.
```mysql
SELECT e.nom, e.cognoms, d.nom, l.ciutat
	FROM empleats e
    INNER JOIN departaments d ON d.departament_id = e.departament_id
    INNER JOIN localitzacions l ON d.localitzacio_id = l.localitzacio_id
WHERE l.ciutat = 'Seattle';
```

Exercici 13 - Crea una llista dels empleats mostrant l’inicial del nom juntament
amb el cognom separat per un punt (‘.’), el salari, el nom del departament de cada
empleat que guanyi més de la mitjana del seu propi departament.
```mysql
SELECT e.nom, e.cognoms, CONCAT(SUBSTR(e.nom, 1, 1), '.', e.cognoms), e.salari, d.nom
	FROM empleats e
    INNER JOIN departaments d ON d.departament_id = e.departament_id
WHERE e.salari > (SELECT AVG(e2.salari) FROM empleats e2 WHERE e.departament_id = e2.departament_id);
```

Exercici 14 - Quins empleats només han estat assignats a un sol treball? Mostra
el codi empleat, nom, cognom i ordena per codi empleat.
```mysql
SELECT *
	FROM empleats
WHERE empleat_id NOT IN (SELECT empleat_id
							FROM historial_feines);
```

Exercici 15 - Obté per cada departament, el salari màxim. Descarta els empleats
que no tenen assignat cap departament.
```mysql
SELECT departament_id, MAX(salari)
	FROM empleats
WHERE departament_id IS NOT NULL
GROUP BY departament_id;
```

Exercici 16 - Dels empleats que no treballen a cap departament indica quins són
els que guanyen més? (nom,cognoms i salari)
```mysql
SELECT e.nom, e.cognoms, e.salari
	FROM empleats e
	LEFT JOIN departaments d ON d.departament_id = e.departament_id
WHERE e.departament_id IS NULL;
```

Exercici 17 - Volem saber quins empleats guanyen més de cada departament.
Mostra el codi empleat, nom, codi de departament, nom departament i salari.
Utilitza l’operador IN
```mysql
SELECT *
	FROM empleats
WHERE
	id_cap IN (SELECT id_cap
				FROM empleats
				WHERE empleat_id = 103)
```

Exercici 18 - Volem saber el nom, cognoms i salari dels empleats que guanyen
més QUE ALGUN dels empleats del departament de ‘Vendes’.
```mysql
SELECT e.nom, e.cognoms, e.salari
	FROM empleats e
INNER JOIN departaments d ON d.departament_id = e.departament_id
WHERE e.salari > ANY(SELECT e.salari FROM empleats e WHERE d.nom = 'Vendes');
```

Exercici 19 - Volem saber el nom, cognoms i salari dels empleats que guanyen
més QUE TOTS els empleats del departament de ‘Vendes’.
```mysql
SELECT e.nom, e.cognoms, e.salari
	FROM empleats e
INNER JOIN departaments d ON d.departament_id = e.departament_id
WHERE e.salari > ALL(SELECT e.salari FROM empleats e WHERE d.nom = 'Vendes');
```

Exercici 20 - Quants empleats tenim del departament de ‘IT’ que van ser
contractats bans que QUE ALGUN empleat del departament de ‘Vendes’? Mostra
els cognoms i la data de contractació.
```mysql
SELECT COUNT(*) AS n_empleats
	FROM empleats e
	INNER JOIN departaments d ON d.departament_id = e.departament_id
WHERE d.nom = 'IT' 
	AND e.data_contractacio < 
		ANY (SELECT e2.data_contractacio 
				FROM empleats e2 
				INNER JOIN departaments d2 
					ON d2.departament_id = e2.departament_id 
				WHERE d2.nom = 'Vendes');
```

Exercici 21 - Quants empleats tenim del departament de ‘IT’ que van ser
contractats abans que TOTS els empleats del departament de ‘Vendes’? Mostra
els cognoms i la data de contractació.
```mysql
SELECT COUNT(*) AS n_empleats
	FROM empleats e
	INNER JOIN departaments d ON d.departament_id = e.departament_id
WHERE d.nom = 'IT' 
	AND e.data_contractacio < 
		ALL (SELECT e2.data_contractacio 
				FROM empleats e2 
				INNER JOIN departaments d2 
					ON d2.departament_id = e2.departament_id 
				WHERE d2.nom = 'Vendes');
```

Exercici 22 - Utilitzant l’operador EXISTS. Volem saber els departaments que
tenen assignats empleats.
```mysql
SELECT *
	FROM departaments d
WHERE EXISTS (SELECT 1
					FROM empleats e
				WHERE d.departament_id = e.departament_id);
```

Exercici 23 - Mostra el resultat de la consulta tal i com es mostra a continuació: 
• Crea una llista de noms dels empleats per Id de departaments:
```mysql
SELECT e.cognoms, e.nom, e.departament_id
	FROM empleats e;
```

- Crea una llista de noms de departaments:
```mysql
SELECT d.nom
	FROM departaments d;
```
- Crea una llista de noms de ciutats:
```mysql
SELECT DISTINCT l.ciutat
	FROM localitzacions l;
```

- Mostra-ho de forma escalonada:
```mysql
SELECT e.cognoms, e.nom, e.departament_id
	FROM empleats e 
UNION 
SELECT '-', '-', d.nom
	FROM departaments d;
```

Exercici 24 - Crea una llista que inclogui els cost de salaris de cada feina dins de
cada departament. A la mateixa llista, mostra el cost de salaris per ciutat.
```mysql
SELECT d.nom,
       e.feina_codi,
       '-' AS ciutat,
       SUM(e.salari) AS cost_salari
	FROM departaments d
	INNER JOIN empleats e ON e.departament_id = d.departament_id
GROUP BY d.nom, e.feina_codi
UNION
SELECT '-', '-', l.ciutat,
        SUM(e.salari) AS cost_salari
	FROM departaments d
	INNER JOIN empleats e ON e.departament_id = d.departament_id
	INNER JOIN localitzacions l ON l.localitzacio_id = d.localitzacio_id
GROUP BY l.ciutat, e.feina_codi;
```

Exercici 25 - Dels empleats que han tingut 3 feines quins d’aquests estan
treballant actualment al departament de Vendes.
```mysql
SELECT e.nom, e.cognoms
	FROM empleats e
	INNER JOIN departaments d ON d.departament_id = e.departament_id
WHERE d.nom = 'Vendes' 
	AND 3 <= (SELECT COUNT(*) 
				FROM historial_feines hf 
				WHERE e.empleat_id = hf.empleat_id);
```

Exercici 26 - Mostra els empleats(nom,cognoms,salari,nom_departament) que
cobrin més que el doble de la mitjan del departament ‘Vendes’.
```mysql
SELECT e.nom, e.cognoms, e.salari, d.nom AS nom_departament
	FROM empleats e
    INNER JOIN departaments d ON d.departament_id = e.departament_id
WHERE e.salari > (SELECT AVG(e2.salari) * 2 
					FROM empleats e2 
					INNER JOIN departaments d2 
						ON d2.departament_id = e2.departament_id 
					WHERE d2.nom = 'Vendes' GROUP BY d2.nom);
```

Exercici 27 - Partint de la consulta anterior exclou els empleats del departament
de ‘Vendes’.
```mysql
SELECT e.nom, e.cognoms, e.salari, d.nom AS nom_departament
	FROM empleats e
    INNER JOIN departaments d ON d.departament_id = e.departament_id
WHERE e.salari > (SELECT AVG(e2.salari) * 2 
					FROM empleats e2 
					INNER JOIN departaments d2 
						ON d2.departament_id = e2.departament_id 
					WHERE d2.nom = 'Vendes' GROUP BY d2.nom)
	AND d.nom != 'Vendes';
```

Exercici 28 - Mostra els departaments (identificador i nom) a on tots els empleats
tinguin un salari més alt que la mitjana de tots els empleats amb salari superior a
2.000.
```mysql
SELECT d.departament_id, d.nom
FROM departaments d
WHERE (
    SELECT AVG(e2.salari)
    FROM empleats e2
    WHERE e2.salari > 2000
    GROUP BY e2.departament_id
) < ALL (
    SELECT e.salari
    FROM empleats e
    WHERE e.departament_id = d.departament_id
);
```

