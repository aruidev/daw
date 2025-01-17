- FN1: Els atributs o camps només poden tenir valors atòmics (1 valor).

| Pelicula  | Emissions                   |
| --------- | --------------------------- |
| Star Trek | 2/01/24 - 4/01/24 - 5/01/24 |
| Star Wars | 3/01/24 - 5/01/24 - 6/01/24 |
Això sería incorrecte, els camps no poden tenir més d'un valor.
Si ens trobem això, trencarem la taula en trossos més petits. 
Farem una nova taula d'emissions.

- FN2: A una taula, no hem de trobar atributs que només depenen parcialment d'una de les PKs.
- FN3: No pot haber-hi transitivitat entre un atribut y la PK.
- FN4: 

FN1: 1 celda 1 valor.
FN2: 1 celda debe depender de toda la PK, no solo de una parte.
FN3: Las celdas deben depender de la PK, no de otras celdas no clave.