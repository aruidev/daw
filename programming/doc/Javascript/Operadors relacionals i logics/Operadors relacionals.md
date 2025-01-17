S'utilitzen per fer comparacions.  
El resultat només pot ser true o false.

- Menor que (<)
- Major que (>)
- Menor o igual que (<=)
- Major o igual que (>=)
- Igual que ( == )
- No igual que (!=)

##### Exemples

	let edat1 = 18, edat2 = 20;  
	alert(edat1 >= edat2);   // Mostrarà false  
	alert(edat1 < edat2);    // Mostrarà true  
	alert(edat1 != edat2);   // Mostrarà true

Per comparar si dos cadenes de caràcters són iguals, s'ha d'utilitzar la funció equals(), **no es pot utilitzar** ==:

	alert("Quina és la capital de PORTUGAL? ");  
	let resposta = scan.nextLine();  
	if (resposta.equals("LISBOA")) alert("CORRECTE");