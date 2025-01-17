// Operadors
"use strict";

// Exercici 1: Suma de dos números
document.getElementById("sumar").addEventListener("click", function() {
    let num1 = parseFloat(document.getElementById("num1").value);
    let num2 = parseFloat(document.getElementById("num2").value);
    let resultat = num1 + num2;
    if (isNaN(resultat)) {
        document.getElementById("resultat-suma").innerHTML = "Introdueix números vàlids";
        return;
    }
    document.getElementById("resultat-suma").innerHTML = `La suma de ${num1} i ${num2} es ${resultat}`;
})

// Exercici 2: Comprovació de divisibilitat
document.getElementById("comprovar").addEventListener("click", function() {
    let divident = parseFloat(document.getElementById("divident").value);
    let divisor = parseFloat(document.getElementById("divisor").value);
    if (isNaN(divident) || isNaN(divisor)) {
        document.getElementById("resultat-divisibilitat").innerHTML = "Introdueix números vàlids";
        return;
    }
    if (divident % divisor === 0) {
        document.getElementById("resultat-divisibilitat").innerHTML = `El número ${divident} es divisible per ${divisor}`;
    } else {
        document.getElementById("resultat-divisibilitat").innerHTML = `El número ${divident} <b>no</b> es divisible per ${divisor}`;
    }
})

  // Exercici 3: Intercanvi de variables
document.getElementById("intercanviar").addEventListener("click", function() {
    let var1 = document.getElementById("var1").value;
    let var2 = document.getElementById("var2").value;
    let t = var1;
    var1 = var2;
    var2 = t;
    if (var1 == "" || var2 == "") {
        document.getElementById("resultat-intercanvi").innerHTML = "Introdueix variables";
        return;
    }
    document.getElementById("resultat-intercanvi").innerHTML = `Ara var1 és <b>${var1}</b>, i var2 és <b>${var2}</b>`;
})