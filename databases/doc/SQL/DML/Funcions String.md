![[Pasted image 20250123120632.png]]

**CONCAT(text,text,...)** 
Retorna un string concatenant els valors passats per paràmetre LENGTH(text) Retorna la longitud del string text 

**LOWER(text) / LCASE(text)** 
Retorna el string text a minúscules. UPPER(text) / UCASE(text) Retorna el string text a majúscules. 

**LEFT(text,len)** 
Retorna els len primers caràcters del string text començant per l'esquerra 

**RIGHT(text,len)**
Retorna els len primers caràcters del string text començant per la dreta 

**MID(text, pos, len) / SUBSTRING(text, pos) SUBSTRING(text, pos, len) SUBSTR == SUBSTRING** 
S'utilitza per obtenir porcions d'una cadena de text. Si el paràmetre pos és negatiu indicarà la posició en sentit dreta-esquerra. 

**INSTR(text, sub_text)** 
Retorna la posició de la primera aparició de sub_text dins a text 

**LOCATE(sub_text, text), LOCATE(sub_text, text, pos)** 
Igual que la funció anterior, però amb l'ordre dels paràmetres al revés. A més podem indicar la posició a iniciar la cerca. 

**LPAD(text, len, padtext)** 
Retorna el string text omplint-lo amb el text padtext per l'esquerra fins obtenir la longitud len. Si len és inferior a la longitud del text original el modifica. 

**RPAD(text,len,padtext)** 
Retorna el string text omplint-lo amb el text padtext per la dreta fins obtenir la longitud len. Si len és inferior a la longitud del text original el modifica. 

**TRIM(text) LTRIM(text)** 
Retorna el text traient els possibles espais en blanc d'esquerra i dreta.

REPEAT(text, count) 
Retorna un string de longitud count repetint el string text. 

SPACE(len) 
Retorna un string de longitud len només format per espais en blanc 

**REPLACE(text, from, to)** 
Retorna el string text reemplaçant les ocurrències del string from per el string to. 

**REVERSE(text)**
Retorna string text amb l'orde dels caràcters en format invers 

**FORMAT(numero, D, \[locale])**
Locale info Formata un decimal arrodonint a D decimals i el retorna com un string. Amb el tercer paràmetre podem definir la localització Com es mostren els milers, el caràcter de decimal,... 

**ELT(índex, srtring, string,..)** 
Donat un índex i una sèrie de strings retorna l'string situat a la posició indicat pel paràmetre índex.