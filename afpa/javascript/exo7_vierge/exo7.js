//Demandé à l’utilisateur une couleur pour le texte et une couleur pour le fond, 
//une fois que les couleurs sont sélectionnées appliquer les à chacun des éléments.

const textColor = prompt("Quelle couleur pour le text ?");
document.body.style.color = textColor;

const bgColor = prompt("Quelle couleur pour le fond ?");
document.body.style.backgroundColor = bgColor;

