En el cas dels **nombres enters**, a més dels operadors anteriors cal afegir l'operació mòdul (%).  
Aquesta operació retorna el residu d'una divisió entera.

	let divisio = 26 / 7;   // divisio = 3.857;  
	let residu = 26 % 7;    // residu = 5;

També es pot utilitzar en format d'operació i assignació: a %= 5 → a = a % 5

Aquest operador s'utilitza sovint en informàtica:

- Calcular si un número és múltiple d'un altre (si **25 % 5 == 0**, 25 és múltiple de 5).
- Descomposar en múltiples i submúltiples (250 segons equivalen a **250 / 60 minuts** i **250 % 60 segons**).
- Gestionar operacions cícliques (sumar **X** de forma repetida i cada cop que s'arribi a **N**, reiniciar).