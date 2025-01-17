Els noms de les constants i variables han de seguir unes regles:

- Ha de ser una paraula (no pot contenir espais entre mig)
- Pot contenir números però no pot començar amb un número
- Pot començar amb guió baix __ o $ en casos determinats
- No pot ser una [paraula reservada de JavaScript](https://www.w3schools.com/js/js_reserved.asp)
- No pot contenir caràcters especials, excepte el guió baix
- Les majúscules i minúscules es consideren diferents (_case-sensitive_)

	const NOTA_MAXIMA = 10;    // OK  
	const NOTA MAXIMA = 10;    // ERROR  
	const NOTA*MAXIMA = 10;    // ERROR  
	let edat2 = 0;             // OK  
	let 2edat;                 // ERROR (comença amb un dígit)  
	let break;                 // ERROR (paraula reservada)  
	let nomPersona = "";       // OK  
	let nompersona = "Mary";   // OK (és una variable diferent de nomPersona)

Recomanacions:

- Els noms de constants i variables han de ser significatius
- Els noms de les constants es posaran en majúscules i, si contenen més d'una paraula, separades per guió baix.
- Els noms de les variables el posaran en minúscules i, si contenen més d'una paraula, cada nova paraula es posarà amb la primera lletra majúscula (_camelCase_)

	const PI;                                       // OK  
	const NOMBRE_MAXIM_DE_PERSONES_EN_EL_CONCERT;   // OK però... no es podria simplificar una mica?  
	const NMPC;                                     // OK però... convé evitar sigles (poc significatiu)  
	const NOMBREPARTICIPANTS;                       // OK però... separar les paraules amb guió baix  
	let maximPersones;                              // OK  
	let MaximPersones;                              // OK però... primera lletra ha de ser minúscula  
	let maxim_persones;                             // OK però... no utilitzar guió baix