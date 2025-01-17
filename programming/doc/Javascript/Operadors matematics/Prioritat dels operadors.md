Si no es posen parèntesis, les operacions s'executen en el següent ordre:

1. Operadors unaris (signe -, increment ++, decrement --)
2. Multiplicació, divisió i residu ( *,  / , %)
3. Suma i resta (+ , -)
4. Relacionals (< , > , <= , >= , == , !=)
5. Lògics (!, &&, ||)

Igual que en matemàtiques, la prioritat es pot modificar utilitzant parèntesis.  
Fins i tot en expressions simples, és convenient utilitzar parèntesis per indicar l'ordre de les operacions.

	let a = 2 * 3 + 1;      // a = 7  
	let b = 1 + 2 * 3;      // b = 7  
	let c = 2 * (3 + 1);    // c = 8

En el cas d'operadors que tinguin la mateixa precedència, s'executa primer el que es troba més a l'esquerra en l'expressió:

let a = 10 / 5 * 3;     // primer es fa 10 / 5 i el resultat (2) es multiplica per 3

**IMPORTANT:** quan es combinen textos i números en una operació, es poden produir resultats imprevistos:

	let import = 1000;  
	let iva = import * 21 / 100;  
	let resultat = "El total és " + import + iva + " €";    // resultat = El total és 1000210 €