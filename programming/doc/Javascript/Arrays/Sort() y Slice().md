`array.sort()` se utiliza para ordenar los elementos de un array. Modifica el array original, así que para mantener el original debemos hacer una copia antes:

`const arrayOrdenada = array.slice().sort()`

Para ordenar números, debemos hacerlo mediante una función de comparación o devolverá un error:

`const numeros = [10, 3, 5, 1, 8]; 

// Crear una copia del array y ordenarla 
`const numerosOrdenados = numeros.slice().sort((a, b) => a - b); 

`console.log(numerosOrdenados); // [1, 3, 5, 8, 10]` 
`console.log(numeros); // [10, 3, 5, 1, 8] (el array original permanece sin cambios)`

