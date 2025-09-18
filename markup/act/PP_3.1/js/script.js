"use strict";
// Funció de validació global del formulari
/**
 * Obté elements del document i els valida
 * @param {*} event 
 * @returns boolean
 */
function validarFormulari(event) {
    // Evitar comportament predeterminat del formulari
    event.preventDefault();

    var nom = document.getElementById("nom");
    var primerCognom = document.getElementById("primerCognom");
    var email = document.getElementById("email");
    var dataNaixement = document.getElementById("dataNaixement");
    var comentaris = document.getElementById("comentaris");
    var contrasenya = document.getElementById("contrasenya");
    var repeteixContrasenya = document.getElementById("repeteixContrasenya");

    // Validar camps obligatoris
    if (noBuit(nom, 'El nom del destinatari és obligatori', event)) return;
    if (noBuit(primerCognom, 'El primer cognom és obligatori', event)) return;
    if (noBuit(email, 'L\'email és obligatori', event)) return;
    if (noBuit(dataNaixement, 'La data de naixement és obligatoria', event)) return;
    if (noBuit(contrasenya, 'La contrasenya és obligatoria', event)) return;
    if (noBuit(repeteixContrasenya, 'La contrasenya repetida és obligatoria', event)) return;

    // Validar longitud mínima de la contrasenya
    if (contrasenya.value.length < 10) {
        alert("La contrasenya ha de tenir almenys 10 caràcters.");
        contrasenya.focus();
        contrasenya.select();
        event.preventDefault(); 
        return true; 
    }
    
    // Comprovar si les contrasenyes coincideixen
    if (contrasenya.value != repeteixContrasenya.value) {
        alert("Les contrasenyes no coincideixen.");
        contrasenya.focus();
        contrasenya.select();
        event.preventDefault(); 
        return true;
    }

    // Actualitzar la secció de "Informació introduïda"
    mostrarInformacio(nom, primerCognom, email, comentaris, dataNaixement);
    return true;
}

// Funció per actualitzar la informació al costat
/**
 * innerText
 * @param {string} nom 
 * @param {string} primerCognom 
 * @param {string} email 
 * @param {string} comentaris 
 * @param {string} dataNaixement 
 */
function mostrarInformacio(nom, primerCognom, email, comentaris, dataNaixement) {
    document.getElementById("infoNom").innerText = "Nom: " + nom.value;
    document.getElementById("infoCognom").innerText = "Cognom: " + primerCognom.value;
    document.getElementById("infoEmail").innerText = "Email: " + email.value;
	document.getElementById("infoComentaris").innerText = "Comentaris: " + (comentaris.value || "No hi ha comentaris.");
    document.getElementById("infoDataNaixement").innerText = "Data de Naixement: " + dataNaixement.value;
  

    // Mostrem un missatge d'èxit
    alert("Informació introduïda correctament!");
}

/**
 * Comproba si està buit
 * @param {*} camp 
 * @param {*} missatge 
 * @param {*} event 
 * @returns boolean
 */
function noBuit(camp, missatge, event) {
    if (camp.value.trim() == "") {
        alert(missatge);
        camp.focus();
        camp.select();
        event.preventDefault(); 
        return true; 
    }
    return false;
}   


