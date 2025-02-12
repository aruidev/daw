- `COUNT(*)` //*Con \* tiene en cuenta los NULL, si se pone un campo en el parámetro, excluye los NULL.
- `MIN()` / `MAX()`
- `AVG()` / `STD()` //*Std return cuanto más bajo más regular

NO utilitzar funcions d'agregació amb altres camps.
p.ej:
```mysql
SELECT MAX(LENGTH(salari)), salari
	FROM empleats;
```

Això no funcionaria, s'ha de posar al WHERE.
```mysql
SELECT salari
	FROM empleats
WHERE MAX(LENGTH(salari));
```

Se puede usar COUNT con DISTINCT para contar un campo presente en una tabla.
```mysql
SELECT COUNT(DISTINCT(departament_id))
	FROM empleats
```

Agrupar departaments
```mysql
SELECT departament_id, COUNT(*)
	FROM empleats
GROUP BY departament_id;
```

<hr>

`COUNT(PK)` - Se suele utilitzar para contar filas con mayor rendimiento que \*.

<hr>

```mysql
SELECT llistaExpressions 
	FROM llistaTaules 
[WHERE condicionsSeleccio] 
[GROUP BY llistaCampsPerAgrupar] 
[HAVING condicionsSeleccioDeGrups] 
[ORDER BY llistaCampsOrdenació];
```

<hr>

#### HAVING

És el `where` del `group by`.
Filtra els resultats del select.