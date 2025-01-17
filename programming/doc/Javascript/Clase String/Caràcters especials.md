Hi ha uns caràcters especials que representen accions en lloc de símbols.  
Aquests caràcters s'anomenen codis d'escapament (_escape codes_).

- '\n': salt de línia.
- '\\': barra invertida.
- '\'': cometa simple.
- '\"': cometa doble.

Exemple per escriure en més d'una linea:

		let missatge = "Primera línia";  
		missatge += "\nSegona línia";  
		alert(missatge);    // Mostra el missatge amb dues línies