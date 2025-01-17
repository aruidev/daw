L'operador assignació (=) serveix per guardar una dada en una variable o constant.  
La variable o constant s'ha d'haver definit prèviament.  
La dada pot ser un literal o estar en una altra constant o variable.  
Es pot definir i assignar en una mateixa sentència (no cal fer-ho en 2 passos).  
Les constants s'han de definir i inicialitzar en la mateixa sentència.

	const NOTA_MAX = 10;    // Definir i inicialitzar una constant  
	NOTA_MAX = 5;           // **ERROR: no es pot modificar el valor d'una constant**  
	  
	let edat;               // Definir variable (1r pas)  
	edat = 25;              // Assignar valor a variable (2n pas)  
	  
	nom = "Peter";          // **ERROR: la variable 'nom' encara no està definida**  
	let nom = "Mary";       // Definir i inicialitzar variable en un sol pas

Una variable només pot contenir una dada.  
Si posteriorment se li assigna un altre valor, el valor anterior es perd.

	let nota;    // Definir variable  
	nota = 4;    // Assignar valor  
	nota = 9;    // Modificar valor