`let array = [`
	`[00, 01, 02, 03],`
	`[10, 11, 12, 13],`
	`[20, 21, 22, 23]`
	`];`


`array.length = 3`
`array[0].length = 4`

| 00  | 01  | 02  | 03  |
| --- | --- | --- | --- |
| 10  | 11  | 12  | 13  |
| 20  | 21  | 22  | 23  |

`array[Fila][Columna]`

Inicializar todas las celdas:

`for (let i = 0; i < F; ++i) {`
	`array[i] = [];`
	`for (let j = 0; j < C; ++j)`
		`array[i][j] = 0;`
	`}`


Mostrar valor de todas las celdas:

- Forma sencilla

`let resultat = "";`
`for (let i = 0; i < F; ++i) {`
	`resultat += array[i].join(" ") + "\n"`
`}`
`console.log(resultat)`

- Forma paso a paso (como string)

`let resultat = "";`
`for (let i = 0; i < F; ++i) {`
	`for (let j = 0; j < C; ++j) {`
	`resultat += array[i][j] + " ";`
	`}`
`resultat += "\n"`
`}`
`console.log(resultat)`

- Forma paso a paso (como array)

`let resultat = [];`
`for (let i = 0; i < F; ++i) {`
	`for (let j = 0; j < C; ++j) {`
	`resultat.push(array[i][j]);`
	`}`
`}`
console.log(resultat.join("\n"))

Mostrar valor de todas las celdas (de arriba a abajo)

`let resultat = "";`
`for (let j = 0; j < C; ++j) {`
	`for (let i = 0; i < F; ++i) {`
	`resultat += array[i][j] + " ";`
	`}`
`resultat += "\n"`
`}`


Arrays tridimensionals:

`array[F][C][P]`

Treballar amb constants
A partir de dades:

`const F = array.length`
`const C = array[0].length`

A partir de prompt:

`const F = parseInt(prompt("Introdueix Files))`
`const C = parseInt(prompt("Introdueix columnes))`

`for (let i = 0; i < F; ++i)...`




