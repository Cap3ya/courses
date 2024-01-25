// Liste des journaux
let journaux = ["http://lemonde.fr", "http://lefigaro.fr", "http://liberation.fr", "http://sudouest.fr"];

// TODO : ajouter la liste des journaux sur la page, dans la div "contenu"

const root = document.getElementById('contenu');

const ul = document.createElement('ul');

journaux.forEach(journal => {
    const li = document.createElement('li');
    li.innerText = journal;
    ul.appendChild(li)
})

root.appendChild(ul)