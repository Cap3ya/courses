// Liste des mots du dictionnaire
var mots = [
    {
        terme: "Procrastination",
        definition: "Tendance pathologique à remettre systématiquement au lendemain"
    },
    {
        terme: "Tautologie",
        definition: "Phrase dont la formulation ne peut être que vraie"
    },
    {
        terme: "Oxymore",
        definition: "Figure de style qui réunit dans un même syntagme deux termes sémantiquement opposés"
    }
];

// TODO : créer le dictionnaire sur la page web, dans la div "contenu"

const root = document.getElementById('contenu');

const ul = document.createElement('ul');

mots.forEach(mot => {
    const li = document.createElement('li');
    li.innerHTML = `
        <p style='font-weight: bold'>${mot.terme}</p>
        <p>${mot.definition}</p>
    `
    ul.appendChild(li);
})

root.appendChild(ul);
