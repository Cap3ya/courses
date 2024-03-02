import { counter, form, input, errorMsg } from "./dom.js";

form.addEventListener('submit', (event) => {

    let isValid = true;

    //NOM
    if (input.nom.value.length < 3) {
        errorMsg.nom.hidden = false;
        isValid = false;
    } else
        errorMsg.nom.hidden = true;
    //PRENOM
    if (input.prenom.value.length < 3) {
        errorMsg.prenom.hidden = false;
        isValid = false;
    } else
        errorMsg.prenom.hidden = true;
    //DATE DE NAISSANCE
    if (!/^\d{2}-\d{2}-\d{4}$/.test(input.dateNaissance.value)) {
        errorMsg.dateNaissance.hidden = false;
        isValid = false;
    } else
        errorMsg.dateNaissance.hidden = true;
    //LIEU DE NAISSANCE
    if (input.lieuNaissance.value.length < 3) {
        errorMsg.lieuNaissance.hidden = false;
        isValid = false;
    } else
        errorMsg.lieuNaissance.hidden = true;
    //SIGNE ASTROLOGIQUE
    if (!input.signeAstrologique.value) {
        errorMsg.signeAstrologique.hidden = false;
        isValid = false;
    } else
        errorMsg.signeAstrologique.hidden = true;
    //EMAIL
    if (!/^\S+@\S+\.\S+$/.test(input.email.value)) {
        errorMsg.email.hidden = false;
        isValid = false;
    } else
        errorMsg.email.hidden = true;
    //MOT DE PASSE
    if (!/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@.#$!%*?&^])[A-Za-z\d@.#$!%*?&]{5,}$/.test(input.motDePasse.value)) {
        errorMsg.motDePasse.hidden = false;
        isValid = false;
    } else
        errorMsg.motDePasse.hidden = true;
    //CONFIRMATION MOT DE PASSE
    if (input.confMotDePasse.value !== input.motDePasse.value) {
        errorMsg.confMotDePasse.hidden = false;
        isValid = false;
    } else
        errorMsg.confMotDePasse.hidden = true;
    //PRESENTATION
    if (input.presentation.value.length < 10 || input.presentation.value.length > 15) {
        errorMsg.presentation.hidden = false;
        isValid = false;
    } else
        errorMsg.presentation.hidden = true;

    if (!isValid)
        event.preventDefault()
    else {
        const user = [
            ["Nom" , input.nom.value],
            ["Prénom", input.prenom.value],
            ["Date de naissance", input.dateNaissance.value],
            ["Lieu de naissance", input.lieuNaissance.value],
            ["Signe astrologique", input.signeAstrologique.value], 
            ["Email", input.email.value], 
            ["Mot de passe", input.motDePasse.value], 
            ["Présentation", input.presentation.value]
        ]
        localStorage.setItem("user", JSON.stringify(user));
    }
        
})

input.presentation.addEventListener('keyup', (event) => {
    const count = event.target.value.length;
    counter.textContent = count + " " + (count > 1 ? "caractères" : "caractère")
})


