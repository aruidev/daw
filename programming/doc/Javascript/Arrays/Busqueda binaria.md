    
        let array = [];
        let element = prompt("Introduce un elemento en el array").toUpperCase();

    while (element !== "FIN") {
        array.push(element);
        element = prompt("Introduce un elemento en el array").toUpperCase();
    }

    array.sort();

    console.log(array.join(" - "))
    
    let target = prompt("Introdueix una paraula per buscar a l'array").toUpperCase();
    let start = 0;
    let end = array.length - 1;
    let found = false;
    let position = -1;  // Inicializamos position con un valor inválido

    while (start <= end) {
        let mid = Math.floor((start + end) / 2);
        if (array[mid] === target) {
            found = true;
            position = mid;
            break;  // Salimos del bucle una vez encontrado
        } else if (array[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    
    if (found) {
        alert(target + " se encuentra en la posición " + position + " del array.");
    } else {
        alert(target + " no se encuentra en el array.");
    }