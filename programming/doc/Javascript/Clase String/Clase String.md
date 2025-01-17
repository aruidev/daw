Els mètodes dels _strings_ s'utilitzen cridant-los amb el nom de la variable que conté el text, però també es poden cridar utilitzant un literal de text:

	let nom = "Peter";  
	let nomMajuscules = **nom.toUpperCase()**;        // nomMajuscules = "PETER"  
	let nomMinuscules = **"Mary".toLowerCase()**;    // nomMinuscules = "mary"

### Propietats i mètodes dels "strings"

Els mètodes més importants són:

- `length`: és una variable que conté el nombre de caràcters que té la cadena.

- `charAt(n)`: retorna el caràcter en la posició n-èsima. (comença a contar desde 0, no 1)

- `toLowerCase()` i `toUpperCase()`: retorna la cadena convertida a minúscules o majúscules, respectivament.

- `trim()`: retorna una cadena eliminant els espais del principi i del final. També hi ha trimStart() i trimEnd() que només eliminan els del principi o els del final, respectivament.

- `includes (text[, posicio])`: comprova si una cadena conté una altra cadena (retorna true o false).  
    El paràmetre opcional posicio serveix per començar a buscar a partir d'un caràcter en lloc de començar des del principi del text. El primer caràcter d'un text és el 0.

- `indexOf(text[, posicio])`: retorna la primera posició on es troba el text buscat, o -1 si no el troba.  
    El paràmetre opcional posicio permet començar la cerca a partir d'una posició determinada.

- `lastIndexOf(text[, posicio])`: igual que l'anterior però començant pel final del text.

- `substring(inici[, final])`: retorna la subcadena entre els índexs inici i final (o fins al final).  
    El caràcter en la posició final no s'inclou.

- `replace(t1, t2)` i `replaceAll(t1, t2)`: retorna la cadena després de substituir t1 per t2.  
    Substitueix la primera aparició o totes, respectivament.

- `repeat(n`): retorna la cadena repetida n vegades.
- `padStart(n, text)` i `padEnd(n, text)`: enganxa text a l'_string_ tantes vegades com sigui necessari fins que tingui la ongitud indicada en n.  
    Ho enganxa al principi o al final de l'_string_, respectivament.

- `startsWith(text)` o `endsWith(text)`: comprova si la cadena comença o acaba amb la subcadena especificada, respectivament.

- `split(text)`: retorna un _array_ de _String_ que és el resultat de separar la cadena utilitzant una altra cadena com a separador.

- `string1.compareLocale(string2)`: Compara la posició que ocuparien les paraules en ordre alfabètic. Retorna 0 si string1 i string2 son iguals. Si s1 < s2 retorna <0. Si s1 > s2 retorna >0.

// (En la documentación, cuando vemos "[ ]" para envolver un parámetro, significa que es un parámetro opcional) //

Alguns mètodes d'aquesta classe serveixen per fer modificar textos: es poden utilitzar sense paràmetres, amb un o amb més paràmetres, i retornen un _string_ que es pot guardar en una variable diferent o en la mateixa variable:

	let hola = "HOLA";  
	hola.replace('A', 'I');          // NO FA CAP CANVI A LA VARIABLE hola!
	hola = hola.replace('A', 'I');   // ARA SÍ: hola = "HOLI"

La majoria de mètodes retornen un nou text.  
Altres poden retornar un número enter, un booleà o fins i tot un _array_ de _Strings_ (més endavant es veuran els _arrays_).

	let l = "Hello World".length;             // l = 11 
	let c = "Hello World".charAt(6);          // c = 'W'  
	let repetit = "Hola".repeat(3);           // repetit = "HolaHolaHola"  
	let ambZeros = "123".padStart(5, '0');    // ambZeros = "00123"  
  
	let hola = "Hello World";  
	let inclou = hola.includes("World");                // inclou = true  
	let ndx = hola.indexOf(" ");                        // ndx = 5  
	let s1 = hola.substring(0, ndx).toUpperCase();      // s1 = "HELLO"  
	let s2 = hola.substring(ndx + 1).toLowerCase();     // s2 = "world"

**ATENCIÓ:** la primera lletra d'un _string_ és la 0 (zero), i l'última és length - 1

	let s = "Hola";  
	let mida = s.length;      // mida = 4  
	let c = s.charAt(0);      // c = 'H'  
	c = s.charAt(mida - 1);   // c = 'a'  
	c = s.charAt(mida);       // c = ''

Si s'intenta accedir a una posició negativa o superior o igual a la seva mida, retorna un text buit.

