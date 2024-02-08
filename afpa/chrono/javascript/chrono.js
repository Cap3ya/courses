const chrono = {
    intervalID: 0,
    prevTps: 0,
    currTps: 0,

    start(callback) {
        let startTime = new Date();
        chrono.intervalID = setInterval(() => {
            let seconds = Math.round((new Date().getTime() - startTime.getTime()) / 1000 + chrono.prevTps);
            chrono.currTps = seconds;
            let hours = parseInt(seconds / 3600);
            seconds = seconds % 3600;
            let minutes = parseInt(seconds / 60);
            seconds = seconds % 60;
            callback(hours, minutes, seconds)
        }, 1000);
    },

    pause() {
        clearInterval(chrono.intervalID);
        chrono.prevTps = chrono.currTps;
    },

    stop() {
        clearInterval(chrono.intervalID);
        chrono.prevTps = 0;
    }
}

export default chrono;
