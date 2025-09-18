"use strict";

function actualitzarCarta() {
    var nomDestinatari = document.getElementById('nomDestinatari').value;
    var nomRemitent = document.getElementById('nomRemitent').value;
    var assumpte = document.getElementById('assumpte').value;
    var contingut = document.getElementById('contingut').value;

    
    document.getElementById('destinatariCarta').innerText = "Per a: " + nomDestinatari;
    document.getElementById('assumpteCarta').innerText = "Assumpte: " + assumpte;
    document.getElementById('contingutCarta').innerText = "Contingut: " + contingut;
    document.getElementById('remitentCarta').innerText = "De: " + nomRemitent;


    console.log("Carta actualitzada: ", {
        nomDestinatari,
        nomRemitent,
        assumpte,
        contingut
    });
}


function validarFormulari(event) {
    var nomDestinatari = document.getElementById('nomDestinatari');
    var nomRemitent = document.getElementById('nomRemitent');
    var assumpte = document.getElementById('assumpte');
    var contingut = document.getElementById('contingut');

    // Comprovar camps buits
    if (noBuit(nomDestinatari, 'El nom del destinatari és obligatori', event)) return;
    if (noBuit(nomRemitent, 'El nom del remitent és obligatori', event)) return;
    if (noBuit(assumpte, 'L\'assumpte és obligatori', event)) return;
    if (noBuit(contingut, 'El contingut de la carta és obligatori', event)) return;

    // Si tot és correcte, actualitzem la carta
    actualitzarCarta();
    event.preventDefault();  // Evitem l'enviament real del formulari
}

// Funció per eliminar la carta
function eliminarCarta() {
    document.getElementById('destinatariCarta').innerText = '';
    document.getElementById('assumpteCarta').innerText = '';
    document.getElementById('contingutCarta').innerText = '';
    document.getElementById('remitentCarta').innerText = '';
}

// Funció per enviar la carta
function enviarCarta() {
    var nomDestinatari = document.getElementById('nomDestinatari').value;
    var nomRemitent = document.getElementById('nomRemitent').value;
    var assumpte = document.getElementById('assumpte').value;
    var contingut = document.getElementById('contingut').value;
    
    console.log("Enviant carta: ", {
        nomDestinatari,
        assumpte,
        contingut,
        nomRemitent
    });

    alert("La carta s'ha enviat correctament!");
}

function noBuit(camp, missatge, event) {
    if (camp.value.trim() === '') {
        alert(missatge);
        camp.focus();
        camp.select();
        event.preventDefault(); 
        return true; 
    }
    return false;
}


