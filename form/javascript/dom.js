export const form = document.querySelector('form');
export const counter = document.getElementById('textareaNbChars')

export const input = {
    nom: form.elements.nom ,
    prenom: form.elements.prenom,
    dateNaissance: form.elements.dateDeNaissance,
    lieuNaissance: form.elements.lieuDeNaissance,
    signeAstrologique: form.elements.signeAstrologique,
    email: form.elements.email,
    motDePasse: form.elements.motDePasse,
    confMotDePasse: form.elements.confMotDePasse,
    presentation: form.elements.presentation,
}

export const errorMsg = {
    nom: document.getElementById('errorMsg_nom'),
    prenom: document.getElementById('errorMsg_prenom'),
    dateNaissance: document.getElementById('errorMsg_dateNaissance'),
    lieuNaissance: document.getElementById('errorMsg_lieuNaissance'),
    signeAstrologique: document.getElementById('errorMsg_signeAstrologique'),
    email: document.getElementById('errorMsg_email'),
    motDePasse: document.getElementById('errorMsg_motDePasse'),
    confMotDePasse: document.getElementById('errorMsg_confMotDePasse'),
    presentation: document.getElementById('errorMsg_presentation'),
}