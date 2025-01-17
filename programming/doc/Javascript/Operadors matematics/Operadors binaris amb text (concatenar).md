En el cas dels textos, els operadors **suma** (+) i **suma i assignació** (+=) serveixen per concatenar (enganxar) textos.  
La resta d'operadors (-, *, ...) no es poden utilitzar amb textos.

	let nom = "Peter";  
	let cognom = "Soft";  
	let **persona = nom + " " + cognom;**    // 'persona' conté el text "Peter Soft"  
	  
	**persona = nom;**                       // 'persona' conté el text "Peter"  
	**persona += " ";**                      // 'persona' conté el text "Peter "  
	**persona += cognom;**                   // 'persona' conté el text "Peter Soft"

Si es suma un text i un número, el número es transforma en "string".

Les operacions van d'esquerra a dreta. Utilitzem els paréntesis per separar i prioritzar operacions de números i text.

	"Suma " + 5 + 3 //Es mostra: Suma 53
	"Suma " + (5 + 3) //Es mostra: Suma 8
	5 + 3 + "suma" //Es mostra: 8 suma

