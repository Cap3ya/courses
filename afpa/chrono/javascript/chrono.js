const chrono = {
    intervalID: 0,
    prevSec: 0,
    currSec: 0,

    start(callback) {
        let startTime = new Date();
        chrono.intervalID = setInterval(() => {
            let seconds = Math.round((new Date().getTime() - startTime.getTime()) / 1000 + chrono.prevSec);
            chrono.currSec = seconds;
            let hours = parseInt(seconds / 3600);
            seconds = seconds % 3600;
            let minutes = parseInt(seconds / 60);
            seconds = seconds % 60;
            callback(hours, minutes, seconds)
        }, 1000);
    },

    pause() {
        clearInterval(chrono.intervalID);
        chrono.prevSec = chrono.currSec;
    },

    stop() {
        clearInterval(chrono.intervalID);
        chrono.prevSec = 0;
    }
}

export default chrono;
