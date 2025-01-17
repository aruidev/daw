Pasos:
1. Entitats fortes: Agafo l'entitat i creo una taula amb tots els exemplars.

2. Entitats febles: El mateix que a pas 1, pero agafo la PK de l'entitat forta de la que depén.
   La PK de la entitat feble serà el conjunt de l'atribut discriminant i l'atribut identificador de l'entitat forta.

3. Generalitzacions i especialitzacions (subentitats o subclasses):
   Per cada subentitat, creo una nova taula i agafo els atributs identificatius de la superclasse. Seràn FKs i PKs.
   
4. Interrelacions 1:1: 
   Puc agafar la PK d'un costat i pasar-la a un altre segons el context.
   Però si la relació és 1,1 : 0,1 el tractarem com 1:N.
   
   En el cas de una relació 0,1 : 0,1 farem una nova taula de la relació (com si fos una N:M). Agafem les PKs de les dos entitats i els atributs de la relació. (en aquest podem escollir com a PK de la nova taula una de les dos)
   
5. Interrelacions 1:N:
   Copio la PK del costat 1 i la poso al costat N. Tots els atributs de la relació també els porto al costat N. Aquesta nova FK no serà PK a la nova ubicació.
   
6. Interrelacions N:M: Crear una taula nova ajudant-me del nom de la relació entre les dos entitats.
   
   Nom de la taula: MATRÍCULA. Agafo només les PKs de les dos entitats i els atributs de la relació.

7. Interrelacions N-àries (ternaries, quaternaries, etc.)
   Aplicarem el mateix procediment depenent de les cardinalitats.
   
   Ternaria N:M:P: Nova taula amb la relació i els PK.
   
   Ternaria 1:N:M: Nova taula amb la relació i els PK.
   
   Ternaria 1:1:N: Nova taula amb la relació i els PK.
   
   Ternaria 1:1:1: Nova taula amb la relació i els PK.
   
   
8. Entitats associatives / agregacions:
   Primer s'aplica el pas de l'interior de la entitat associativa. Després apliquem el pas amb la entitat que es relaciona amb la associació.

9. Incloure restriccions de domini i integritat.