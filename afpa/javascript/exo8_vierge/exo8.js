//Créer un paragraphe qui contient une liste à puce qui affiche 
//la hauteur et la largeur de l’élément qui à l’id contenu.

const contenu = document.getElementById('contenu');
const height = contenu.offsetHeight;
const width = contenu.offsetWidth;

const root = document.getElementById('infos');

const p = document.createElement('p');
p.textContent = `Hauteur: ${height}, Largeur: ${width}`

root.appendChild(p);