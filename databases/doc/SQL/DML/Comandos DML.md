INSERT
![[Pasted image 20250116110955.png]]

<hr>

DELETE
![[Pasted image 20250116111737.png]]

DELETE más de un registro
![[Pasted image 20250116112038.png]]
o
![[Pasted image 20250116112229.png]]
Se pueden utilizar todo tipo de operadores lógicos como >, >=, AND, etc.
AND no se utilizaría en este caso porque la PK no puede ser 102 y 103 al mismo tiempo.

![[Pasted image 20250116112851.png]]
Tenemos campos de "Logistica" repetidos y queremos borrar los duplicados. Podemos hacer esta operación.

<hr>

UPDATE
![[Pasted image 20250116112541.png]]
WHERE el departament id sigui 100, canvia el nom amb SET...

![[Pasted image 20250116113548.png]]

Si el registre es NULL...
![[Pasted image 20250116114322.png]]
NUNCA comparar NULL con =, !=, >... etc.
NULL tiene sus propios operadores, ya que todas las comparaciones con NULL el resultado es FALSE!

<hr>

SELECT
![[Pasted image 20250116115036.png]]

![[Pasted image 20250116115226.png]]

![[Pasted image 20250116120236.png]]
ORDER BY camp;

![[Pasted image 20250116120322.png]]
ORDER BY camp DESCENDENT

![[Pasted image 20250116120404.png]]

