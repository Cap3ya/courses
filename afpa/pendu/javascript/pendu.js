const pendu = {
    errors: 0,
    maxErrors: 9,

    secret: "",
    guess: [],

    setSecret(word) {
        this.secret = word;
    },

    getRemainingErrors() {
        return this.maxErrors - this.errors;
    },

    incErrors() {
        this.errors += 1;
    },

    setGuess() {
        const initialGuess = [];
        for (let i = 0; i < this.secret.length; i++) {
            initialGuess.push("_")
        }
        this.guess = initialGuess;
    },

    getGuess() {
        return this.guess.join(" ");
    },

    checkGuess(letter) {
        const normalizedSecret = this.secret.normalize("NFD").replace(/\p{Diacritic}/gu, "");

        if (normalizedSecret.includes(letter)) {

            for (let i = 0; i < normalizedSecret.length; i++) {

                if (normalizedSecret.charAt(i) === letter)
                    this.guess[i] = this.secret.charAt(i);

                else if (this.guess[i] !== this.secret.charAt(i))
                    this.guess[i] = "_"
            }
        }
        else {
            this.incErrors();
        }
    },
}

export default pendu; 