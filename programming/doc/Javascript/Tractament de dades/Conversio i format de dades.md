### Conversió entre text i números

#### De número a text

Per convertir qualsevol valor numèric a text, es pot utilitzar:

- "" + valor
- variable.toString() (variable és un valor numèric)

let s = **"" + 123**;    // s = "123"  
  
let v = 25;  
s = **v.toString()**;    // s = "25"  

#### De text a número

Per convertir un text que contingui un valor numèric vàlid, es pot utilitzar el mètode parseInt(text) o parseFloat(text) per convertir a enter o a real, respectivament:

	let n = parseInt("123");    // n = 123  
	n = parseFloat("123");      // n = 123.0  
	  
	n = parseInt("123.8");      // n = 123    (no arrodoneix)  
	n = parseFloat("123 Hola"); // n = 123.0  (només té en compte els números del principi)  
	  
	n = parseFloat("Hola 123"); // n = NaN    (si no hi ha números al principi, retorna NaN)

Si el text no conté un valor numèric, retorna el valor especial NaN (**Not a Number**).

### Formatar números

Per mostrar resultats, és habitual demanar un nombre determinat de decimals o separar els milers i els decimals amb punts o comes depenent de cada país.

Per determinar el nombre de decimals, es pot utilitzar el mètode valor.toFixed(decimals).  
Aquest mètode arrodoneix el valor amb el nombre de decimals desitjat i el converteix a text.

	let v = 123.456789;  
	let t = v.toFixed(2);    // t = "123.45"

Si es vol separar milers i decimals amb el caràcter corresponent a un idioma, es pot utilitzar el mètode valor.toLocaleString([codi]).  
Si no es posa cap codi, s'utilitzarà l'idioma configurat en el navegador.

	let v = 1234567.89;  
	let t = v.toLocaleString();          // t = "1.234.567,89"  
	let t = v.toLocaleString("en-US");   // t = "1,234,567.89"