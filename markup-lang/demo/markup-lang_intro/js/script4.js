// Arrays
"use strict";

// Exercici 8: Màxim d'un array
document.getElementById("trobar-maxim").addEventListener("click", function() {
    let array = document.getElementById("array-maxim").value.split(",");
    let max = parseInt(array[0]);
    for (let i = 1; i < array.length; i++) {
        let num = parseInt(array[i]);
        if (num > max) {
            max = num;
        }
    }
    if (isNaN(max)) {
        document.getElementById("resultat-maxim").innerHTML = "Introdueix números vàlids i separats per comes";
        return;
    } else {
        document.getElementById("resultat-maxim").innerHTML = `El valor màxim és: <b>${max}</b>`;
    }
})

// Exercici 9: Ordenar un array
document.getElementById("ordenar-array").addEventListener("click", function() {
    let array = document.getElementById("array-ordenar").value.split(",");
    for (let i = 0; i < array.length - 1; i++) {
        for (let j = i + 1; j < array.length; j++) {
            if (parseInt(array[i]) > parseInt(array[j])) {
                let t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
    }
    document.getElementById("resultat-ordenar").innerHTML = `L'array ordenat és: <b>${array.join(", ")}</b>`;
})