import Address from "./classes/Address.js";
import Agence from "./classes/Agence.js";
import Agent from "./classes/Agent.js";
import Person from "./classes/Person.js";
import Logement from "./classes/Logement.js";
import dom from "./dom.js";

// Creation Agence
const agence = new Agence;
// Creation 3 agents
let pierre, paul, jack; 
try {
	pierre = new Agent("Martin", "Pierre", 20, "Vente", 5_000,
		new Address("28", "Cours Marechal-Joffre", "40100", "Dax")
	);
	paul = new Agent("Bernard", "Paul", 30, "Vente", 10_000,
		new Address("82", "Rue Marie De Médicis", "06400", "Cannes")
	);
	jack = new Agent("Thomas", "jack", 40, "Management", 15_000,
		new Address("62", "Place de Miremont", "92390", "Villeneuve-la-garenne")
	);
} catch ({ name, message }) {
	console.log(name + "\n" + message)
}

// set jack comme responsable de pierre et paul
try {
	pierre.setResponsable(jack);
	paul.setResponsable(jack);
} catch ({name, message}) {
	console.log(name + "\n" + message)
}

// add agents to agence.agents
try {
	agence.addAgent(pierre);
	agence.addAgent(paul);
	agence.addAgent(jack);
} catch ({ name, message }) {
	console.log(name + "\n" + message)
}

// Creation 3 proprietaires
let jade, louise, ambre; 
try {
	jade = new Person("Petit", "Jade", 25,
		new Address("36", "rue de Raymond Poincaré", "44300", "Nantes")
	);
	louise = new Person("Robet", "Louise", 35,
		new Address("44", "Chemin Du Lavarin", "06800", "Cagnes-sur-mer")
	);
	ambre = new Person("Richard", "Ambre", 45,
		new Address("13", "Place du Jeu de Paume", "38200", "Vienne")
	);
} catch ({ name, message }) {
	console.log(name + "\n" + message)
}
//add proprietaires to agence.proprietaires
try {
	agence.addProprietaire(jade);
	agence.addProprietaire(louise);
	agence.addProprietaire(ambre);
} catch ({ name, message }) {
	console.log(name + "\n" + message)
}
// Creation 10 logements // Logement n'implement pas class adresse
try {
	for (let i = 0; i < 10; i++) {
		const agent = agence.getAgents()[Math.floor(3 * Math.random())];
		const proprietaire = agence.getProprietaires()[Math.floor(3 * Math.random())];
		const superficie = Math.floor(200 * Math.random());
		const nbPerson = Math.floor(superficie / 20);
		const estLibre = Math.random() > .5;
		const logement = new Logement(agent, proprietaire, superficie, nbPerson, estLibre)
		agence.addLogement(logement);
	}
} catch ({ name, message }) {
	console.log(name + "\n" + message)
}
// append Logements
dom.appendLogements(agence.getLogements())
// Checkbox pour cacher logements indisponibles
dom.estDisponible.addEventListener('input', (event) => {
	const logements = event.target.checked === true ?
		agence.getLogements().filter(logement => logement.getEstDisponible() === true) :
		agence.getLogements();

	dom.appendLogements(logements);
})
// Button pour réserver, libérer un logement
dom.logements.addEventListener("click", (event) => {
	if (event.target.tagName === 'BUTTON') {
		const [method, id] = event.target.id.split("_");
		const logement = agence.getLogements().find(logement => logement.getID() == id)

		//UPDATE MODEL
		if (method === "reserver") {
			logement.reserver();
			if (dom.cacherIndisponiblesIsChecked()) {
				event.target.parentNode.remove();
				return; // Pour éviter ligne 97 et son erreur (element est undefined car removed)
			}
		}
		else if (method === "liberer")
			logement.liberer();

		document.getElementById(`estDisponible${id}`).textContent = logement.getEstDisponible() ? "disponible" : "indisponible";
	}
})
