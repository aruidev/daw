## Introduir dades dins d'un bucle

### Introduir una dada fins que sigui correcta

	let num;
	
	do {
	    num = prompt("Introdueix un número entre 0 i 10");
	} while (num < 0 || num > 10);

De vegades és més fàcil pensar quina és la condició per sortir del bucle i posar-la invertida:

	while (!(num >= 0 && num <= 10));

### Introduir dades fins que s'introdueixi un valor determinat

	let nom;
	let edat;
	let altura;
	
	nom = prompt("Com et dius?");
	while (nom.toUpperCase() != "FI") {
	    edat = prompt("Quina edat tens?");
	    altura = prompt("Quant medeixes?");
	    // Processar o guardar les dades
	    // ...
	    nom = prompt("Com et dius?");
	}

En el següent exemple s'utilitza un bucle que, en principi, sembla que no acabarà mai, perquè la condició per repetir el bucle és sempre certa.
En aquests casos cal posar dins del bucle alguna condició que permeti sortir del bucle.

No és recomanable utilitzar bucles infinits exceptuant aquells casos en què les condicions de sortida del bucle siguin moltes i complexes. En el següent exemple, no està justificat utilitzar-lo.

	let nom;
	let edat;
	let altura;
	while (true) {
	    nom = prompt("Com et dius?");
	    if (nom.toUpperCase() == "FI") break;
	    edat = prompt("Quina edat tens?");
	    altura = prompt("Quant medeixes?");
	    // Processar o guardar les dades
	    // ...
	}

## Invertir la condició per sortir del bucle

En els bucles while i do ... while, la condició que s'ha de posar és la que farà que es repeteixi el bucle.
Però, en general, resulta més fàcil pensar en la condició per sortir del bucle.

Per això, una forma fàcil per crear la condició sense equivocar-se és pensar la condició de sortida i després invertir-la, sigui negant tota l'expressió o invertint tots els operadors relacionals i lògics.

Per exemple, si no s'ha de sortir del bucle fins que l'edat introduïda estigui entre 18 i 65 anys, s'ha de posar aquesta condició i invertir-la:

edat >= 18 && edat <= 65 (condició per sortir del bucle)

while (!(edat >= 18 && edat <= 65)) o while (edat < 18 || edat > 65) (condició per repetir el bucle)