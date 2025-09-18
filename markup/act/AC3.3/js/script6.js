// Llistes
"use strict"

// Obtenir elements
const ulInput = document.getElementById("ul-input");
const olInput = document.getElementById("ol-input");
const dtInput = document.getElementById("dt-input");
const ddInput = document.getElementById("dd-input");

const ulContainer = document.getElementById("ul-container");
const olContainer = document.getElementById("ol-container");
const dlContainer = document.getElementById("dl-container");

const ulButton = document.getElementById("ul-button");
const olButton = document.getElementById("ol-button");
const dlButton = document.getElementById("dl-button");

const ulRemove = document.getElementById("ul-remove");
const olRemove = document.getElementById("ol-remove");  
const dlRemove = document.getElementById("dl-remove");

// Listeners
ulButton.addEventListener("click", function() {
    addUlElement(ulInput.value);
    console.log("addUlElement called");
});

ulRemove.addEventListener("click", function() {
    removeUlElement(ulContainer.lastElementChild);
    console.log("removeUlElement called"); 
});

olButton.addEventListener("click", function() {
    addOlElement(olInput.value);
    console.log("addOlElement called");
});

olRemove.addEventListener("click", function() {
    removeOlElement(olContainer.lastElementChild);
    console.log("removeOlElement called");
});

dlButton.addEventListener("click", function() {
    addDlElement(dtInput.value, ddInput.value);
    console.log("addDlElement called");
});

dlRemove.addEventListener("click", function() {
    removeDlElement(dlContainer.lastElementChild);
    console.log("removeDlElement called");
});

/**
 * Afegim un element a la llista no ordenada
 * @param {string} liValue input text
 * @returns 
 */
function addUlElement(liValue) {
    if (liValue == "") {
        alert("Introdueix el text");
        return;
    }
    const li = document.createElement("li");
    li.textContent = liValue;
    ulContainer.appendChild(li);
    ulInput.value = "";
    ulInput.focus();
    console.log("li added");
}

/**
 * Esborra últim element
 * @returns 
 */
function removeUlElement() {
    if (ulContainer.lastElementChild == null) {
        alert("No hi ha cap element per esborrar");
        return;
    }
    const lastLi = ulContainer.lastElementChild;
    ulContainer.removeChild(lastLi);
    console.log("li removed");
}

/**
 * Afegir un element a la llista ordenada
 * @param {string} liValue input text
 * @returns 
 */
function addOlElement(liValue) {
    if (liValue == "") {
        alert("Introdueix el text");
        return;
    }
    const li = document.createElement("li");
    li.textContent = liValue;
    olContainer.appendChild(li);
    olInput.value = "";
    olInput.focus();
    console.log("li added");
}

/**
 * Esborrar últim element
 * @returns
 */
function removeOlElement() {
    if (olContainer.lastElementChild == null) {
        alert("No hi ha cap element per esborrar");
        return;
    }
    const lastLi = olContainer.lastElementChild;
    olContainer.removeChild(lastLi);
    console.log("li removed");
}

/**
 * Afegir un element a la llista descriptiva
 * @param {string} dtValue input text titol
 * @param {string} ddValue input text descripció
 * @returns 
 */
function addDlElement(dtValue, ddValue) {
    if (dtValue == "" || ddValue == "") {
        alert("Introdueix el títol i la descripció");
        return;
    }
    const dt = document.createElement("dt");
    dt.textContent = dtValue;
    const dd = document.createElement("dd");
    dd.textContent = ddValue;
    dlContainer.appendChild(dt);
    dlContainer.appendChild(dd);
    dtInput.value = "";
    ddInput.value = "";
    dtInput.focus();
    console.log("dt added");
    console.log("dd added");
}

/**
 * Esborrar últim element
 * @returns 
 */
function removeDlElement() {
    if (dlContainer.lastElementChild == null) {
        alert("No hi ha cap element per esborrar");
        return;
    }
    const lastDt = dlContainer.lastElementChild;
    dlContainer.removeChild(lastDt); 
    const lastDd = dlContainer.lastElementChild;
    dlContainer.removeChild(lastDd);
    console.log("dt removed");
    console.log("dd removed");
}
