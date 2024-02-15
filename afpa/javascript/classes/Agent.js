import Person from "./Person.js";

class Agent extends Person {
    //PROPERTIES
    #responsable;
    #branche;
    #salaire;
    //CLASS
    constructor(nom, prenom, age, branche, salaire, adresse) {
        super(nom, prenom, age, adresse);
        this.setSalaire(salaire);
        this.setBranche(branche);
    }
    //SETTERS
    setSalaire(salaire) {
        if (typeof salaire === 'number') {
            if (this.#salaire === undefined || this.#salaire <= salaire)
                this.#salaire = salaire;
        }
        else
            throw new TypeError(`${salaire} doit être type Number`)
    }
    setBranche(branche) {
        this.#branche = branche;
    }
    setResponsable(responsable) {
        if (responsable instanceof Agent)
            this.#responsable = responsable;
        else 
            throw new TypeError(`${responsable} doit être type Agent`)
    }
    //GETTERS
    getSalaire() {
        return this.#salaire.toLocaleString();
    }
    getBranche() {
        return this.#branche;
    }
    getResponsable() {
        return this.#responsable;
    }
    getSalaireAnnuel() {
        return (this.#salaire * 12).toLocaleString();
    }
    //ELSE 
    toString() {
        return super.toString()
            + "\nIl travail dans la branche " + this.#branche + " et gagne " + this.getSalaire() + " euros par mois (" + this.getSalaireAnnuel() + " par an)."
            + (this.#responsable != undefined ? "\nSon responsable est " + this.#responsable?.getPrenom() + " " + this.#responsable?.getNom() + "." : "");
    }
}

export default Agent; 