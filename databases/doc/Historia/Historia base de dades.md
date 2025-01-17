1961: 
Charles Bachman va dissenyar el primer SGBD generalitzat. El IDS.
![[Pasted image 20241128104837.png]]

1970:
Edgar Frank Codd (IBM) defineix el model relacional.
Larry Ellison va desenvolupar el Relational Software System (avui conegut com Oracle) a partir del treball de Codd.
IBM també va desenvolupar la seva versió, el System R, utilitzant el llenguatge SEQUEL (precursor de SQL).
Al 76, el doctor Peter Chen va proposar el model conceptual d'Entitat-Relació per tal de dissenyar bases de dades.

1980:
Va ser una època de creixement de les invencions que es van fer als 70.
Al 86, l'ANSI publica les primeres normes de la sintaxi i la semàntica de l'SQL, que es converteix en el llenguatge estàndar de les BD relacionals.

1990: 
Apareixen els primers SGBD orientats a objectes (Object Database Management System: ODBMS).

Exemples:
- Base de dades espacials o geogràfiques / orientat a grafs: nodes i conexions, JOAN amic MARIA amic PERE 
- Base de dades documentals: treballen amb JSON, etc
- Base de dades deductives: 

#### MODELS DE DADES

![[Pasted image 20241128111729.png]]

1. Model jeràrquic:
2. Model en xarxa:
3. Model relacional: Garantitza consistencia de dades amb les FKs (ja que aquests no poden ser dades que no existeixen).
   Problemes models relacionals: Dificultat d'escalar.

### Teorema de CAP (o teorema de Brewer)

![[Pasted image 20241128114748.png]]

En un SGBD relacional no es pot tenir Consistencia, Tolerancia a la partició i Disponibilitat tot a la vegada. Cada sistema prioritza dos.

### Arquitectura ANSI/X3/SPARC:

![[Pasted image 20241128123324.png]]
![[Pasted image 20241129110719.png]]

- Nivell extern:
  Es situen les visions lògiques que els processos usuaris tindràn de la BD.
  En l’esquema extern només hi haurà aquells atributs i entitats que interessin i es poden modificar.
- 