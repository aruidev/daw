### Consultes sobre una taula utilitzant agrupaments

1. Quants empleats van ser contractats l'any passat.
```mysql
SELECT COUNT(empleat_id) AS empleats_any_passat  
	FROM empleats  
WHERE YEAR(data_contractacio) = YEAR(CURDATE()) - 1;
```   
   
2. Quin és el treballador (nº d’anys no el nom del treballador) amb més anys d'antiguitat.
```mysql
SELECT MAX(TIMESTAMPDIFF(YEAR, data_contractacio, CURDATE())) AS max_antiguitat
	FROM empleats;
```   
   
3. Quin és el treballador(nº d’anys no el nom del treballador) amb menys anys d'antiguitat.
```mysql
SELECT MIN(TIMESTAMPDIFF(YEAR, data_contractacio, CURDATE())) AS min_antiguitat
	FROM empleats;
```   
   
4. Quin és el salari mig de l'empresa
```mysql
SELECT ROUND(AVG(salari), 2) AS salari_mig
	FROM empleats;
```   
   
5. Mostra el salari més alt i el més baix dels empleats. Anomena les columnes com a "salari_max" i "salari_min" respectivament.
```mysql
SELECT ROUND(MAX(salari), 2) AS salari_max, ROUND(MIN(salari), 2) AS salari_min
	FROM empleats;
```   
   
6. Mostra la mitjana dels salaris i el número d’empleats que tenim. Arrodoneix la mitjana al número enter més pròxim i anomena les columnes com a salari_mig i num_empleats respectivament.
```mysql
SELECT ROUND(AVG(salari)) AS salari_mig, COUNT(empleat_id) AS num_empleats
	FROM empleats;
```   
   
7. Mostra, per cada tipus de treball, la mitjana dels salaris. Ordena la informació per tipus de treball.
```mysql
SELECT 
	feina_codi,
	ROUND(AVG(salari), 2) AS salari_mig
	FROM empleats
GROUP BY feina_codi
ORDER BY feina_codi;
```   
   
8. Quants empleats tenim assignats a cada tipus de treball? Ordena la informació per número d’empleats.
```mysql
SELECT 
	feina_codi,
    COUNT(empleat_id) AS num_empleats
    FROM empleats
GROUP BY feina_codi
ORDER BY num_empleats DESC;
```   
   
9. Quants empleats tenim assignats a cada departament? Mostra el  codi de departament i el número d’empleats que té. Ordena la informació per número d’empleats.
```mysql
SELECT 
	departament_id,
    COUNT(empleat_id) AS num_empleats
    FROM empleats
WHERE departament_id IS NOT NULL
GROUP BY departament_id
ORDER BY num_empleats DESC;
```   
   
10. Partint de la consulta anterior, volem saber també quants empleats no tenen departament assignat. Mostra el text "No assignat" com a identificador del departament.
```mysql
SELECT
	IFNULL(departament_id, "No assignat") AS departament_assignat,
    COUNT(empleat_id) AS num_empleats
FROM empleats
GROUP BY departament_id
ORDER BY departament_id;
```   

11. Quants directors (caps) diferents tenim? Anomena la columna com a "numero_de_directors"
```mysql
SELECT COUNT(DISTINCT(id_cap)) AS num_directors
	FROM empleats;
```      

12. Fes una consulta per calcular la diferència que hi ha entre el salari màxim i el mínim dels empleats. Anomena la columna com a "diferencia".
```mysql
SELECT 
	ROUND(MAX(salari), 2) AS salari_max, 
	ROUND(MIN(salari), 2) AS salari_min, 
    ROUND(MAX(salari), 2) - ROUND(MIN(salari), 2) AS diferencia
    FROM empleats;
```      

13. Mostra, per cada cap, el número identificador de l’empleat (com a cap) i el salari de l’empleat pitjor pagat per a aquest cap. Exclou els empleats  que no tinguin assignat cap.  
```mysql
SELECT 
	id_cap,
	MIN(salari) AS min_salari
	FROM empleats
WHERE id_cap IS NOT NULL
GROUP BY id_cap;
```      

14. Partint de la consulta anterior, exclou també aquells caps en què el salari mínim sigui inferior o igual a 6.000.
```mysql
SELECT 
	id_cap,
	MIN(salari) AS min_salari
FROM empleats
WHERE id_cap IS NOT NULL
GROUP BY id_cap
HAVING min_salari > 6000;
```         

15. Obté el número d’empleats contractats per cada any. Ordena la informació per any.
```mysql
SELECT 
	COUNT(empleat_id) AS num_empleats,
    YEAR(data_contractacio) AS any_contractacio
FROM empleats
GROUP BY YEAR(data_contractacio)
ORDER BY any_contractacio;
```         

16. Mostra els codis de departament que tenen 3 o més empleats. Mostra només el codi del departament.
```mysql
SELECT 
	departament_id,
	COUNT(empleat_id) AS num_empleats
FROM empleats
WHERE departament_id IS NOT NULL
GROUP BY departament_id 
HAVING num_empleats >= 3;
```         

17. Mostra el nombre d'empleats que cobren més de 9.000 euros.
```mysql
SELECT
	COUNT(empleat_id) AS num_empleats
FROM empleats
WHERE salari > 9000
```         
