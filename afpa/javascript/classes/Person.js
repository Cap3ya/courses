import Address from "./Address.js";

class Person {
    //PROPERTIES
    #nom;
    #prenom;
    #age;
    #address;
    //CLASS
    constructor(nom, prenom, age, address) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAge(age);
        this.setAddress(address);
    }
    //SETTERS
    setNom(nom) {
        this.#nom = nom;
    }
    setPrenom(prenom) {
        this.#prenom = prenom;
    }
    setAge(age) {
        if (typeof age === 'number')
            this.#age = age;
        else 
            throw new TypeError(`${age} doit être type Number`)
    }
    setAddress(address) {
        if (address instanceof Address)
            this.#address = address;
        else 
            throw new TypeError(`${address} doit être type Address`)
    }
    //GETTERS
    getNom() {
        return this.#nom;
    }
    getPrenom() {
        return this.#prenom;
    }
    getAge() {
        return this.#age;
    }
    getAddress() {
        return this.#address;
    }
    //ELSE 
    toString() {
        return this.#prenom + " " + this.#nom + " " + this.#age + " ans, habite au " + this.#address.toString() + ".";
    }
}
export default Person;
