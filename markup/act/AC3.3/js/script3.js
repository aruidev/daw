"use strict";
// Bucles

// Exercici 6: Taula de multiplicar
document.getElementById("generar-taula").addEventListener("click", function() {
    let numero = parseInt(document.getElementById("numero-taula").value);
    let taula = "";
    if (isNaN(numero)) {
        document.getElementById("resultat-taula").innerHTML = "Introdueix un número";
        return;
    }
    for (let i = 1; i <= 10; i++) {
        taula += `<tr> <td> ${numero} x ${i} </td> <td> = ${numero * i} </td> <tr/>`;
    }
    document.getElementById("resultat-taula").innerHTML = taula;
})

// Exercici 7: Números primers
document.getElementById("generar-primers").addEventListener("click", function() {
    let primers = [];
    for (let i = 2; i <= 20; i++) {
        let esPrimer = true;
        for (let j = 2; j < i; j++) {
            if (i % j === 0) {
                esPrimer = false;
                break;
            }
        }
        if (esPrimer) {
            primers.push(i);
        }
    }
    document.getElementById("resultat-primers").innerHTML = `Els números primers entre 1 i 20 són: <b>${primers.join(", ")}</b>`;
})