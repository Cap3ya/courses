//function infosLiens() {
//    votre code ...
//}

function possede(_id, _class) {  
    return document.getElementById(_id).
        classList.contains(_class);
}

// infosLiens();

console.log(possede("saxophone", "bois")); // Doit afficher true
console.log(possede("saxophone", "cuivre")); // Doit afficher false
console.log(possede("trompette", "cuivre")); // Doit afficher true
console.log(possede("contrebasse", "cordes")); // Doit afficher une erreur