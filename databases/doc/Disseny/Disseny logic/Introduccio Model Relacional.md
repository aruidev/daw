+Consistencia de dades.
+Definit per Edgar Frank Codd any 1970.
+Es basa en concepte de sistema de relació.

##### Estructura de dades:

Diferencia entre visió informal i visió formal.

Tuples son files.

Definicions:
- Relacio: És una taula, amb columnes i files.
- Atribut: Camp. És la columna d'una relació.
- Tupla: Fila d'una relació.
- Grau d'una relació: nombre d'atributs que conté.
- Cardinalitat d'una relació: nombre de tuples que conté.
- Domini: conjunt de valors que pot prendre un atribut.
- Base de dades relacional: Conjunt de relacions normalitzades.

1.1.3 Clau candidata, clau primària i clau alternativa.

Una superclau, en una relació (taula) és un subconjunt d'atributs (camps) (pot ser 1 o més, o tots), que permeten identificar de manera única els exemplars de la taula.

Clau candidata: És una superclau. Es tot aquell camp, que quan el treiem del subconjunt, aquell deixa de ser superclau.
p.ej:
Si tenim la superclau DNI, nom, cognom, només DNI és clau candidata, perque si treiem DNI de la superclau, el subconjunt deixa de ser subconjunt.
Si tenim DNI, IDALU, ninguna es candidata, perque si treiem DNI, el subconjunt segueix sent superclau ja que IDALU segueix identificant de manera única l'exemplar.

Clau primaria (primary key o PK): Tota taula ha de tenir una PK, i només una. Ha de ser clau candidata i superclau. Podría tenir més d'un camp, pero s'intentarà utilitzar el menor número d'atributs posibles. No pot ser null.

Clau alternativa: Són les clau candidates que no s'han escollit com a PK.

Restriccions:
- Restriccions de domini (domini: conjunt de valors que pot agafar un atribut):
  p.ej: Estat civil: pot ser casat, solter, divorciat o separat. / Edat: entre 0 i 150.
- Restriccions de clau primaria: No pot haber-hi tuples amb valors repetits.
- Restriccions d'integritat d'entitat: La clau primaria no pot ser null.
- Restricció d'integritat referencial: Una tupla d'una relació que fa referencia a una tupla d'una altre relació, en aquesta haurà d'existir la tupla referenciada. Això manté la consistencia de dades.

Foreign Key (FK): Una FK es un camp amb referencia a una PK d'una altre relació (taula). Una FK sí pot ser null.

![[Pasted image 20241106113530.png]]

