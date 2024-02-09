import dom from "./dom.js";
import chrono from "./chrono.js";

dom.btnStart.addEventListener('click', () => {

    chrono.start((h, m, s) =>
        dom.displayChrono(h, m, s)
    );

    dom.btnStart.hidden = true;
    dom.btnStop.hidden = false;
    dom.btnPause.hidden = false;
});
dom.btnPause.addEventListener('click', () => {

    chrono.pause();

    dom.btnPause.hidden = true;
    dom.btnStart.hidden = false;
    dom.btnStart.value = "Reprendre"
});
dom.btnStop.addEventListener('click', () => {

    chrono.stop()

    dom.btnStop.hidden = true;
    dom.btnPause.hidden = true;
    dom.btnStart.hidden = false;
    dom.btnStart.value = "Start";
    dom.resetDisplayChrono()
});