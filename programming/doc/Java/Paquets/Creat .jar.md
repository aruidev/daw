https://www.sapalomera.cat/moodlecf/apunts/daw/prog/index.html?cap=50&ref=2007
## Creació d'un arxiu executable JAR

Quan un projecte conté diversos paquets i/o classes, el procés d'instal·lació en altres màquines pot ser complicat i és fàcil cometre algun error, per exemple, oblidar-se algun arxiu.

Tampoc és fàcil executar-lo (encara que es pot automatitzar el procés).

Per facilitar aquests processos, es pot crear un arxiu JAR que contindrà tots els arxius necessaris.

En IntelliJ, per crear un arxiu JAR cal seguir els següents passos:

1. Crear la configuració per generar l'arxiu JAR

1. En el menú principal, seleccionar **File → Project Structure...**
2. En l'apartat **Artifacts**, afegir (**+**) **JAR → From modules with dependencies...**
3. Triar la classes principal, per exemple **TestFuncions** i guardar.

3. Crear l'arxiu JAR

1. En el menú principal, **Build → Build Artifacts...**
2. Seleccionar el JAR, per exemple **TestFuncions:jar** i **Build** o **Rebuild**

L'arxiu JAR no es genera automàticament: si es fa algun canvi en el codi, cal tornar-lo a construir (**Build → Build Artifacts... → Rebuild**)

### Executar un arxiu JAR

##### Des del mateix IDE

En IntelliJ, menú principal **Run → Run...** **→ TestFuncions.jar**

En la barra d'eines superior hi ha un deplegable on es pot triar si es vol executar la classe o l'arxiu JAR.  
Cal vigilar perquè si està seleccionat el JAR, els canvis que es facin en el codi no actualitzen el JAR quan es clica el botó d'executar (només reconstrueix les classes).

##### Des de la consola

1. Obrir un terminal i anar al directori on s'ha creat l'arxiu JAR, per exemple, IdeaProjects\TestFuncions\out\artifacts\TestFuncions_jar.
2. Executar l'arxiu JAR amb la comanda java -jar TestFuncions.jar.

### Instal·lar el programa JAR en altres màquines

Només cal copiar l'arxiu JAR en un directori qualsevol i crear un enllaç amb la comanda per executar-lo.