1. Llista totes les columnes de la taula empleats.
```mysql
SELECT * 
	FROM empleats;
```

2. Llista els cognoms de tots els empleats.
```mysql
SELECT cognoms
	FROM empleats;
```
   
3. Llista els cognoms dels empleats eliminant els cognoms que estiguin repetits.
```mysql
SELECT cognoms
	FROM empleats
GROUP BY cognoms;
```
   
4. Llista el nom i els cognoms de tots els empleats.
```mysql
SELECT nom, cognoms
	FROM empleats;
```
   
5. Mostra els cognoms i nom dels empleats concatenats amb una coma i un
espai en blanc.
```mysql
SELECT cognoms, nom, CONCAT(cognoms, ", ", nom) AS nom_complet
	FROM empleats;
```

6. Volem una columna on estigui tot en majúscules i l’altre tot en minúscules. Anomena les columnes com a "nom_majuscules" i "nom_minuscules" respectivament.
```mysql
SELECT UCASE(nom), LCASE(nom)
	FROM empleats;
```
   
7. Mostra les 6 primeres lletres dels cognoms dels empleats
```mysql
SELECT LEFT(cognoms, 6) AS cognoms_curts
	FROM empleats;
```
   
8. Quins són els empleats que tenen la longitud del cognoms major a 6? (Mostra els cognoms i la longitud)
```mysql
SELECT cognoms, LENGTH(cognoms) AS longitud_cognoms  
	FROM empleats
WHERE LENGTH(cognoms) > 6;
```
   
9. Substitueix totes les 'a' dels cognoms dels empleats per 'e'. Ordena pel nou valor dels cognoms
```mysql
SELECT REPLACE(REPLACE(cognoms, 'a', 'e'), 'A', 'E') AS cognoms_modificats  
	FROM empleats
ORDER BY cognoms_modificats;
```

10. Mostra tots els empleats que tenen en la segona posició dels cognoms una 'a'. (Sense utilitzar l’operador LIKE, ni REGEXP)
```mysql
SELECT cognoms
	FROM empleats 
WHERE SUBSTRING(LOWER(TRIM(cognoms)), 2, 1) = 'a';
```

11. Per cada empleat mostra el codi d’empleat, cognom i el salari amb un augment del 15% expressat com un número enter, etiqueta la columna amb el nom "nou_salari".
```mysql
SELECT empleat_id, cognoms, salari, salari + salari * 0.15 AS nou_salari
	FROM empleats;
```   

12. Partint de la consulta anterior, afegeix una nova columna que mostri la diferencia salarial entre el nou salari i l’antic. Etiqueta la columna com a "increment"    
```mysql
SELECT empleat_id, cognoms, salari, 
		ROUND((salari * 1.15), 2) AS nou_salari, 
        ROUND((salari * 1.15), 2) - salari AS increment
	FROM empleats;
```

13. Fes una consulta on mostri el cognom de l’empleat en majúscules i la longitud del cognom dels empleats on el seu cognom comenci per J, A o M. Ordena els resultats per cognom d’empleat.
```mysql
SELECT UCASE(cognoms) AS cognoms_majuscula, LENGTH(cognoms) AS longitud_cognoms
	FROM empleats  
WHERE LEFT(cognoms, 1) IN ('J', 'A', 'M', 'j', 'a', 'm')  
	ORDER BY cognoms;
```   

14. Fes una consulta on mostri el codi, nom i cognoms dels empleats que van ser contractats un dilluns o un divendres.
```mysql
SELECT empleat_id, nom, cognoms 
	FROM empleats
WHERE DAYOFWEEK(data_contractacio) IN (2, 6);
```   

15. Mostra l’import de comissió dels empleats. Etiqueta la columna com a "import_comissio" i arrodoneix el valor a 2 decimals. Si un empleat no té assignada comissió fes el que calgui per tal que el resultat de l’operació surti zero en comptes de NULL. Mostra també el cognom i el salari en Ptes despreciant els decimals (truncar)
```mysql
SELECT cognoms, salari,
    ROUND(IFNULL(salari * pct_comissio, 0), 2) AS import_comissio,
    TRUNCATE(salari * 166.386, 0) AS salari_ptes
FROM empleats;
```   

16. Utilitzant alguna de les funcions de dates, obté el nom, cognom i data de contractació dels empleats contractats durant el 1997.
```mysql
SELECT nom, cognoms, data_contractacio
	FROM empleats
WHERE YEAR(data_contractacio) = 1997;
```   

17. Utilitzant alguna de les funcions de data, mostra tots els empleats que van ser contractats entre els mesos de juny i novembre, independentment de l’any.
```mysql
SELECT nom, cognoms, data_contractacio
	FROM empleats
WHERE MONTH(data_contractacio) BETWEEN 6 AND 11;
```   

18. El nostre departament de recursos humans s’aborreix molt i per justificar el seu sou està elaborant tot d’estadístiques extranyes. Ara volen saber quins empleats varen ser contractats en un dia parell.
```mysql
SELECT nom, cognoms, data_contractacio, DAY(data_contractacio) AS dia
	FROM empleats  
WHERE DAY(data_contractacio) % 2 = 0;
```   

19. Mostra el cognom, la data de contractació i el dia de la setmana en el que va començar l’empleat a treballar. Etiqueta la columna com a dia. Ordena els resultats per dia de la setmana.
```mysql
SET lc_time_names = 'ca_ES';
SELECT  
    cognoms,  
    data_contractacio,  
    DAYNAME(data_contractacio) AS dia  
FROM empleats  
ORDER BY WEEKDAY(data_contractacio);
```   

20. Mostra el codi d’empleat, cognoms i la data de contractació en format AAAAMM. El dia no ens interessa ara en el nostre estudi estadístic. Ordena per aquest nou format de data.
```mysql
SELECT  
    empleat_id, 
    cognoms,
    DATE_FORMAT(data_contratacio, '%Y%m') AS any_mes
FROM empleats
ORDER BY any_mes;
```   

21. Per cada empleat, mostra el cognom, la data de contractació i el número de mesos entre el dia d’avui i la data de contractació. Etiqueta la columna com a "mesos_treballats" i arrodoneix sense decimals. Ordena el resultat segons els mesos treballats de més a menys.
```mysql
SELECT  
    cognoms,  
    data_contractacio,  
    ROUND(TIMESTAMPDIFF(MONTH, data_contractacio, CURDATE())) AS mesos_treballats  
FROM empleats  
ORDER BY mesos_treballats DESC;
```   

22. Mostra el nom, cognom i anys d’antiguitat dels empleats que tenen una antiguitat superior o igual a 20 anys a l’empresa.
```mysql
SELECT  
    nom,  
    cognoms,  
    TIMESTAMPDIFF(YEAR, data_contractacio, CURDATE()) AS anys_antiguitat  
FROM empleats  
WHERE TIMESTAMPDIFF(YEAR, data_contractacio, CURDATE()) >= 20  
ORDER BY anys_antiguitat DESC;
```   

23. Crea una consulta per mostrar el cognom i salari de tots els empleats que guanyen més de 10.000 a l’any. Dona format al camp salari per a que tingui 15 caràcters de longitud, omplint per l’esquerra amb $. Etiqueta la columna com a salari.
```mysql
SELECT  
    cognoms,  
    LPAD(salari, 15, '$') AS salari  
FROM empleats  
WHERE salari > 10000;
```      

24. Mostra el cognom, salari i percentatge de comissió dels empleats. Afegeix una nova columna en que si un empleat no té assignada comissió, posi "SenseComissió". Etiqueta la columna amb nom "no_comissio"
```mysql
SELECT  
    cognoms,  
    salari,  
    comissio,  
    IFNULL(comissio, 'SenseComissió') AS no_comissio  
FROM empleats;
```      

25. Mostra el cognom, salari i utilitzant la funció CASE, mostra el següent en
funció del valor del salari
  - Si el salari està entre 0 i 3000 -> "Mig"
  - Si el salari està entre 12000 i 24000 -> "Alt"
  - Qualsevol altre valor posa "Altres"
  - Anomena la columna com a "poder_adquisitiu" i ordena per salari de menor a major
```mysql
SELECT  
    cognoms,  
    salari,  
    CASE  
        WHEN salari BETWEEN 0 AND 3000 THEN 'Mig'  
        WHEN salari BETWEEN 12000 AND 24000 THEN 'Alt'  
        ELSE 'Altres'  
    END AS poder_adquisitiu  
FROM empleats  
ORDER BY salari;
```      

26. Llista el codi dels departaments dels empleats que apareixen a la taula empleats.
```mysql
SELECT departament_id  
	FROM empleats;
```      

27. Partint de la consulta anterior elimina els codis de departament repetits.
```mysql
SELECT DISTINCT departament_id  
	FROM empleats;
WHERE departament_id IS NOT NULL;
```      

28. Calcula el nombre d'empleats que **no tenen** comissió assignada.
```mysql
SELECT COUNT(*) AS n_empleats_sense_comissio  
	FROM empleats  
WHERE comissio IS NULL;
```      
