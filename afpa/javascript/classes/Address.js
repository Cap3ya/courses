class Address {
    //PROPERTIES
    #numeroRue;
    #nomRue; 
    #codePostale; 
    #ville;
    //CLASS
    constructor(numeroRue, nomRue, codePostale, ville) {
        this.setNumeroRue(numeroRue);
        this.setNomRue(nomRue);
        this.setCodePostale(codePostale);
        this.setVille(ville);
    }
    //SETTERS
    setNumeroRue(num) {
        if (/^[0-9]+$/.test(num))
            this.#numeroRue = num;
        else 
            throw new SyntaxError(`${num} isn't numeric only`)
    }
    setNomRue(nom) {
        this.#nomRue = nom;
    }
    setCodePostale(code) {
        if (/^[0-9]{5}$/.test(code))
            this.#codePostale = code;
        else 
            throw new SyntaxError(`${code} should contains 5 digits`)
    }
    setVille(ville) {
        this.#ville = ville;
    }
    //GETTERS
    getNumeroRue() {
        return this.#numeroRue;
    }
    getNomRue() {
        return this.#nomRue;
    }
    getCodePostale() {
        return this.#codePostale;
    }
    getVille() {
        return this.#ville;
    }
    //ELSE
    toString() {
        return this.#numeroRue + " " + this.#nomRue 
            + ", " + this.#codePostale + " " + this.#ville;
    }
}

export default Address; 