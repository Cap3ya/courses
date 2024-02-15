import Agent from './Agent.js';
import Person from './Person.js';
import Logement from './Logement.js';

class Agence {
    //PROPERTIES
    #proprietaires = [];
    #logements = [];
    #agents = [];
    //GETTERS
    getProprietaires() {
        return this.#proprietaires;
    }
    getAgents() {
        return this.#agents;
    }
    getLogements() {
        return this.#logements;
    }
    //ELSE
    addProprietaire(proprietaire) {
        if (proprietaire instanceof Person)
            this.#proprietaires.push(proprietaire);
        else 
            throw new TypeError(`${proprietaire} n'est pas instanceof Person`);
    }
    addLogement(logement) {
        if (logement instanceof Logement)
            this.#logements.push(logement);
        else 
            throw new TypeError(`${logement} n'est pas instanceof Logement`);
    }
    addAgent(agent) {
        if (agent instanceof Agent)
            this.#agents.push(agent);
        else 
            throw new TypeError(`${agent} n'est pas instanceof Agent`)
    }
}
export default Agence; 