// Funcions
"use strict";

// Exercici 10: Funció suma
function suma(a, b) {
    let resultat = a + b;
    if (isNaN(resultat)) {
        document.getElementById("resultat-suma").innerHTML = "Introdueix números vàlids";
        return;
    }
    document.getElementById("resultat-suma").innerHTML = `La suma de ${a} i ${b} és: <b>${resultat}</b>`;
}

// Exercici 11: Funció màxim
function maxim(a, b) {
    let resultat;
    if (a > b) {
        resultat = a;
    } else {
        resultat = b;
    }
    if (isNaN(resultat)) {
        document.getElementById("resultat-maxim").innerHTML = "Introdueix números vàlids";
        return;
    }
    document.getElementById("resultat-maxim").innerHTML = `El màxim entre ${a} i ${b} és: <b>${resultat}</b>`;
}

// Exercici 10
document.getElementById("suma").addEventListener("click", function() {
    let num1 = parseInt(document.getElementById("num1-suma").value);
    let num2 = parseInt(document.getElementById("num2-suma").value);
    suma(num1, num2);
})

// Exercici 11
document.getElementById("trobar-maxim").addEventListener("click", function() {
    let num1 = parseInt(document.getElementById("num1-maxim").value);
    let num2 = parseInt(document.getElementById("num2-maxim").value);
    maxim(num1, num2);
})