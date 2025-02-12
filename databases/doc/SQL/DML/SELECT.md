```
SELECT <projeccio>
	FROM <taula>
WHERE <condicio>
ORDER BY <_> [ASC]
```

Operadores útiles para WHERE

IN
```
SELECT salari, empleat_id AS id
	FROM empleats
WHERE salari IN  (17000, 9000);
```

BETWEEN 
```
SELECT salari, empleat_id AS id
	FROM empleats
WHERE salari BETWEEN 17000 AND 25000;
```

IS NULL / IS NOT NULL
```
SELECT salari, empleat_id AS id
	FROM empleats
WHERE departament_id IS NULL;
```

Funciones para SELECT

IFNULL(campo, "mensaje")
```
SELECT salari, empleat_id, IFNULL(departament_id, "No té departament") AS departament_id
	FROM empleats;
```

LIKE %
```
SELECT salari, empleat_id
, nom, IFNULL(departament_id, "No té departament") AS departament_id
	FROM empleats
WHERE nom LIKE '%a%';
```

RLIKE 
*(regex)*
```
SELECT salari, empleat_id
, nom, IFNULL(departament_id, "No té departament") AS departament_id
	FROM empleats
WHERE nom RLIKE '[A-C]$';

```

Se pueden aplicar todos los operadores lógicos y aritméticos.

