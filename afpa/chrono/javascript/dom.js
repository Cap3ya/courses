const dom = {
    btnStart: document.getElementById("btnStart"),
    btnStop: document.getElementById("btnStop"),
    btnPause: document.getElementById("btnPause"),
    pChrono: document.getElementById("chrono"),

    displayChrono(h, m, s) {
        const addZero = (num) => {return num < 10 ? "0" + num : num};
        this.pChrono.textContent = addZero(h)  + ':' + addZero(m) + ':' + addZero(s);
    },

    resetDisplayChrono() {
        this.pChrono.textContent = "00:00:00"
    },
}

export default dom; 