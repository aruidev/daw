## Patrons

En JavaScript, els patrons es tanquen entre / i /

Després de la segona barra (la de tancament) es pot posar un dels següents modificadors:

- `g: 
  coïncidència global (totes les vegades que aparegui el patró)`
- `i: 
  coïncidència insensitiva (sense diferenciar majúscules i minúscules)`
- `m: 
  cerca multilínia (no ve limitada pels salts de linia)`

## Caràcters especials

Els següents caràcters tenen un significat especial.

`[ ] ( ) { } \ ^ $ | ? * + .`

Si es volen utilitzar com a caràcters a detectar, cal posar \ al davant (\*   \.   \+   \(   \\...).

- `[ ]: 
  per especificar un **conjunt** de caràcters.`
- `( ): 
  per agrupar.`
- `{ }: 
  per indicar un nombre de repeticions.`
- `\: 
  per poder utilitzar caràcters especials, per representar caràcters especials o per conjunts de caràcters.`
- `^: 
  té dos possibles significats:
   - la coincidència ha d'estar al principi de la línia.
   - si es posa com a primer caràcter dins de `[ ]`, implica negació:  `[^AEIOUaeiou]` detectarà qualsevol caràcter que no sigui una vocal.

- `$: 
  
  indica que la coincidència ha d'estar al final de la línia.`
- `|:
  OR - per triar entre diferents possibilitats.`
- `?: 
  0-1 coincidencias
- `+: 
  1-N coincidencias
- `*: 
  0-N coincidencias
- `.: 
  qualsevol caracter.`

`Les següents expressions tenen un significat especial (caràcters especials o conjunt de caràcters).`

`\t   \n   \s   \S   \d   \D   \w   \W`

- `\t: 
  tabulador.`
- `\n: 
  salt de línia.`
- `\s: 
  qualsevol caràcter que sigui un separador. És equivalent a `[ \t\n\x0B\f\r]`.`
- `\S: 
  qualsevol caràcter que NO sigui un separador. És equivalent a `[^\s]`.`
- `\d: 
  qualsevol caràcter que sigui un dígit. És equivalent a `[0-9]`.`
- `\D: 
  qualsevol caràcter que NO sigui un dígit. És equivalent a `[^0-9]`.`
- `\w: 
  qualsevol caràcter que pot formar una paraula. És equivalent a `[a-zA-Z_0-9]`.`
- `\W: 
  qualsevol caràcter que NO formi part d'una paraula. És equivalent a `[^\w]`.`


## Repeticions

.{8} = Qualsevol caràcter repetit 8 vegades.
.{8,} = `.{min,max}` Qualsevol caràcter repetit com a mínim 8 vegades.

