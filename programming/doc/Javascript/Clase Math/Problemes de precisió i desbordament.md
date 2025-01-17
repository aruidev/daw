Els valors que es poden utilitzar estan limitats.  
Si no es tenen en compte aquests límits, es poden produir resultats erronis.

	let val = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;    // Equivalent a 0.1 * 10  
	alert(val);    // val = 0.9999999999999999 (hauria de ser 1.0)  
  
	val = 1e-300;  
	val *= 1e-100;  
	alert(val);    // val = 0.0 (hauria de ser 1e-400)  
  
	val = 1e300;  
	val *= 1e100;  
	alert(val);    // val = Infinity (hauria de ser 1e400)  
  
	val = 9007199254740991;    // Màxim valor enter: 2 ^ 53 - 1  
	++val;  
	++val;  
	alert(val);    // val = 9007199254740992 (hauria de ser 9007199254740993)