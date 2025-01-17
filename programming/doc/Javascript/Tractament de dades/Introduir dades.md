## Demanar dades a l'usuari

Fins ara, les dades estaven incloses en el codi del programa.  
Això implica que el programa sempre processarà les mateixes dades.

Per fer que el programa sigui més flexible, cal que l'usuari pugui introduir les dades que necessita processar.

El mètodes que permeten fer preguntes a l'usuari són:  

- confirm(pregunta): mostra una finestreta similar a un alert() però amb dos botons: **Acceptar** i **Cancel·lar**.  
    Si l'usuari prem el botó **Acceptar**, retorna true; si prem **Cancel·lar**, retorna false.
- prompt(pregunta): similar a l'anterior però amb un espai perquè l'usuari pugui escriure una resposta.  
    Retorna la resposta de l'usuari si prem **Acceptar** o null si prem **Cancel·lar**.

##### Exemple

	let resposta = **confirm**("Segur que vols esborrar les dades?");  
	if (resposta == true) alert("S'han esborrat les dades");

### Tractar les dades introduïdes

De vegades, els usuaris escriuen espais al principi o al final de la resposta que no s'han de tenir en compte.  
O cal que la resposta sigui en majúscules però l'escriuen en minúscules o barrejant majúscules i minúscules.

Per aquests casos hi ha dos mètodes que es poden aplicar a les respostes per evitar errors en el processament posterior:

- toUpperCase() (o toLowerCase()): converteix tot a majúscules (o a minúscules).
- trim(): elimina els espais que pugui haver al principi i al final del text.

##### Exemple

	let capital = prompt("Quina és la capital de Portugal?");  
	capital = capital.trim();  
	capital = capital.toUpperCase();  
	if (capital == "LISBOA") alert("Correcte!");

També es podria haver fet amb menys instruccions:

capital = capital.**trim()**.**toUpperCase()**;

### Agafar dades numèriques

Les respostes que s'obtenen amb prompt() sempre són de tipus text, encara que l'usuari escrigui un número.

Quan la resposta ha de ser un número per poder fer càlculs matemàtics, cal convertir-la utilitzant els mètodes que s'han vist en capítols anteriors: parseInt() i parseFloat().

##### Exemple

let edat = **prompt**("Quina edat tens?");  
edat = **parseInt**(edat);  
if (edat >= 18) alert("Ja ets major d'edat!");

---