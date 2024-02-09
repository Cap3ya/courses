import dom from './dom.js';
import pendu from './pendu.js';
import dictionary from './dictionary.js';

dom.buttons.addEventListener("click", (e) => {

    if (e.target.id === "btnStart")
        start();

    else if (e.target.classList.contains('btnsLetter'))
        guess(e.target);
})

// FUNCTIONS 

function start() {

    // Create btnsLetter if not defined yet
    if (dom.btnsLetter.length === 0)
        dom.setBtnLetters()
    // Else display and enable them
    else
        dom.btnsLetter.forEach(btn => {
            btn.hidden = false;
            btn.disabled = false;
        })
    // Show button start
    dom.btnStart.hidden = true;
    // Show correct 9pts image 
    dom.image.src = '../images/9.png'
    // Indique le nbr de tentatives restantes
    dom.info.textContent = 'Il te reste 9 tentatives'

    // Get a word to be guessed from the dictionary and reset game; 
    pendu.setSecret(dictionary.getWord());
    // Initialize current guessed word and display it
    pendu.setGuess(); 
    dom.secret.textContent = pendu.getGuess();
    // Reset number of errors
    pendu.errors = 0;

    console.log(pendu.secret)
}

function guess(target) {

    // Update guessed word with letter
    pendu.checkGuess(target.textContent)

    // DOM
    target.disabled = true;
    dom.secret.textContent = pendu.guess.join(" ");
    dom.info.textContent = "Il te reste " + pendu.getRemainingErrors() + " " + (pendu.getRemainingErrors() > 1 ? "tentatives" : "tentative");
    dom.image.src = `../images/${pendu.getRemainingErrors()}.png`

    if (pendu.secret === pendu.guess.join("")) {
        dom.image.src = "../images/10.png";
        dom.info.textContent = "Tu as Gagné!"
        outcome();
    }
    else if (pendu.getRemainingErrors() == 0) {
        dom.info.textContent = "Tu as Perdu!";
        dom.secret.textContent = pendu.secret;
        outcome();
    }
}

function outcome() {
    dom.btnStart.hidden = false;
    dom.btnStart.textContent = "Restart";
    dom.btnsLetter.forEach(btn => btn.hidden = true)
}
