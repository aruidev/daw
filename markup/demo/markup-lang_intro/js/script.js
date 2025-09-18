"use strict"
// Variables
const main = document.getElementById("main-index").style;

/**
 * Oculta totes les descripcions
 */
function ocultarDescripcions() {
    document.getElementById("html-container").style.display = "none";
    document.getElementById("css-container").style.display = "none";
    document.getElementById("js-container").style.display = "none";
}

// Mostrar la descripció de la tecnologia clicada
document.getElementById("html-button").addEventListener("click", function() {
    ocultarDescripcions(); 
    main.opacity = "1";
    document.getElementById("html-container").style.display = "block"; 
});

document.getElementById("css-button").addEventListener("click", function() {
    ocultarDescripcions(); 
    main.opacity = "1";
    document.getElementById("css-container").style.display = "block"; 
});

document.getElementById("js-button").addEventListener("click", function() {
    ocultarDescripcions(); 
    main.opacity = "1";
    document.getElementById("js-container").style.display = "block"; 
});