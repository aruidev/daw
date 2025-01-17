// Condicionals
"use strict";

// Exercici 4: Classificació d'edats
document.getElementById("classificar").addEventListener("click", function() {
    let edat = parseInt(document.getElementById("edat").value);
    if (isNaN(edat)) {
      document.getElementById("resultat-classificacio").innerHTML = "Introdueix un número";
      return;
    }
    if (edat < 18) {
      document.getElementById("resultat-classificacio").innerHTML = "Infantil";
    } else if (edat < 30) {
      document.getElementById("resultat-classificacio").innerHTML = "Jove";
    } else if (edat < 60) {
      document.getElementById("resultat-classificacio").innerHTML = "Adult";
    } else {
      document.getElementById("resultat-classificacio").innerHTML = "Sènior";
    }
})

// Exercici 5: Número perfecte
document.getElementById("comprovar-perfecte").addEventListener("click", function() {
    let numero = parseInt(document.getElementById("numero").value);
    let suma = 0;

    if (isNaN(numero)) {
      document.getElementById("resultat-perfecte").innerHTML = "Introdueix un número";
      return;
    }

    for (var i = 1; i < numero; i++) {
      if (numero % i === 0) {
        suma += i;
      }
    }
    if (suma === numero) {
      document.getElementById("resultat-perfecte").innerHTML = `El número ${numero} és perfecte`;
    } else {
      document.getElementById("resultat-perfecte").innerHTML = `El número ${numero} <b>no</b> és perfecte`;
    }
})