"use strict";
const formulari = document.getElementById("formulari");

// Listener
formulari.addEventListener("submit", function (event) {
    event.preventDefault();
    if (validarFormulari()) {
        alert("Formulari enviat correctament!");
    };
});

/**
 * Funció de validació global del formulari
 * @returns {boolean} 
 */
function validarFormulari() {

    // Obtenir elements del formulari
    const nom = document.getElementById("nom");
    const cognom1 = document.getElementById("cognom1");
    const dataNaixement = document.getElementById("data-naixement");
    const nif = document.getElementById("nif");
    const email = document.getElementById("email");
    const contrasenya = document.getElementById("contrasenya");
    const checkContrasenya = document.getElementById("check-contrasenya");

    // Comprovacions de camps obligatoris
    if (!longitud(nom, 3)) {
        return false;
    }

    if (!longitud(cognom1, 3)) {
        return false;
    }

    if (!noBuit(dataNaixement)) {
        return false;
    }

    if (!noBuit(nif) || !validarNIF(nif)) {
        return false;
    }

    if (!noBuit(email) || !validarEmail(email)) {
        return false;
    }

    // Comprova que la contrasenya no sigui buida i tingui més de 8 caràcters
    if (!noBuit(contrasenya) || !longitud(contrasenya, 8)) {
        return false;
    }

    // Comprova que les contrasenyes coincideixin
    if (contrasenya.value !== checkContrasenya.value) {
        alert("Les contrasenyes no coincideixen.");
        contrasenya.focus();
        contrasenya.select();
        return false;
    }

    return true;
}

/**
 * Comprova que el camp no està buit
 * @param {HTMLelement} elem Element del formulari a comprovar
 * @returns {boolean}
 */
function noBuit(elem) {
    var cadena = elem.value.trim();
    if (cadena == null || cadena.length == 0) {
        alert(`Atenció, el camp és obligatori.`);
        elem.focus();
        elem.select();
        return false;
    }
    return true;
}

/**
 * Comprova la longitud del camp
 * @param {HTMLelement} elem Element del formulari a comprovar
 * @param {int} minLong longitud del camp
 * @returns 
 */
function longitud(elem, minLong) {
    var cadena = elem.value;
    var long = parseInt(minLong);
    if (cadena.length < long) {
        alert("El camp ha de tenir mínim " + long + " caràcters.");
        elem.focus();
        elem.select();
        return false;
    }
    return true;
}

/**
 * Regex NIF
 * @param {HTMLelement} elem
 * @returns {boolean}
 */
function validarNIF(elem) {
    const nif = elem.value.trim();
    const nifRegex = /^[0-9]{8}[A-Za-z]$/;
    if (!nifRegex.test(nif)) {
        alert("NIF invàlid");
        elem.focus();
        elem.select();
        return false;
    }
    return true;
}

/**
 * Regex Email
 * @param {HTMLelement} elem
 * @returns {boolean}
 */
function validarEmail(elem) {
    const email = elem.value.trim();
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
        alert("Email invàlid");
        elem.focus();
        elem.select();
        return false;
    }
    return true;
}


