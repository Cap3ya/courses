import Agent from "./Agent.js";
import Person from "./Person.js";

class Logement {
    //PROPERTIES
    static count = 0;
    #id;
    #agent;
    #proprietaire;
    #estDisponible;
    #superficie;
    #nbPerson;
    //CLASS
    constructor(agent, proprietaire, superficie, nbPerson, estDisponible = true) {
        this.setAgent(agent);
        this.setProprietaire(proprietaire);
        this.setEstDisponible(estDisponible);
        this.setNbPerson(nbPerson);
        this.setSuperficie(superficie);
        this.#id = Logement.count++;
    }
    //SETTERS
    setAgent(agent) {
        if (agent instanceof Agent)
            this.#agent = agent;
        else
            throw new TypeError(`${agent} doit être type Agent`)
    }
    setProprietaire(proprietaire) {
        if (proprietaire instanceof Person)
            this.#proprietaire = proprietaire;
        else
            throw new TypeError(`${proprietaire} doit être type Person`)
    }
    setEstDisponible(estDisponible) {
        this.#estDisponible = Boolean(estDisponible);
    }
    setNbPerson(nbPerson) {
        if (typeof nbPerson === 'number')
            this.#nbPerson = nbPerson;
        else
            throw new TypeError(`${nbPerson} doit être type Number`)
    }
    setSuperficie(superficie) {
        if (typeof superficie === 'number')
            this.#superficie = superficie;
        else
            throw new TypeError(`${superficie} doit être type Number`)
    }
    //GETTERS
    getID() {
        return this.#id;
    }
    getAgent() {
        return this.#agent;
    }
    getProprietaire() {
        return this.#proprietaire;
    }
    getEstDisponible() {
        return this.#estDisponible;
    }
    getNbPerson() {
        return this.#nbPerson;
    }
    getSuperficie() {
        return this.#superficie;
    }
    //ELSE
    reserver() {
        this.#estDisponible = false;
    }
    liberer() {
        this.#estDisponible = true;
    }
    toString() {
        return "Une superficie de " + this.#superficie + "m² pour " + this.#nbPerson + " personnes."
    }
}

export default Logement; 