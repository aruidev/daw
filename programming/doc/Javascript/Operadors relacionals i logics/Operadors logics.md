Operadors lògics
S'apliquen a valors binaris (true i false).
Es poden utilitzar per combinar el resultat de diferents operacions relacionals.
El resultat només pot ser true o false.

NOT (!): inverteix el valor (si era true, el converteix a false; si era false el converteix a true).
AND (&&): només si els dos valors són true, el resultat és true.
OR (||): només que un dels dos valors sigui true, el resultat serà true.
XOR (^): si els dos valors són iguals, el resultat serà false.

Exemples

	let edat = 18;
	let cConduir = false;
	alert(edat >= 18 && cConduir == true);   // Mostrarà false
	alert(edat >= 18 && !cConduir);          // Igual que l'anterior

	let nFills = 2;
	let vidua = true;
	let fNombrosa = nFills >= 3 || (nFills == 2 && vidua == true);   // true
	    fNombrosa = nFills >= 3 || (nFills == 2 && vidua);   // Igual que l'anterior