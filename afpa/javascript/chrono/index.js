const interface = {
  display: document.getElementById('display'),
  button: {
    start: document.getElementById('start'),
    pause: document.getElementById('pause'),
    stop: document.getElementById('stop'),
  },
}

const chrono = {
  intervalID: 0,
  currentTime: 0,
  previousTime: 0,

  start() {
    const startTime = new Date();

    chrono.intervalID = setInterval(() => {

      let seconds = Math.round(
        (new Date().getTime() - startTime.getTime()) / 1000
        + chrono.previousTime);

      let hours = parseInt(seconds / 3600);
      seconds = seconds % 3600;

      let minutes = parseInt(seconds / 60);
      seconds = seconds % 60;

      interface.display.innerText = ajouteUnZero(hours)
        + ":" + ajouteUnZero(minutes)
        + ":" + ajouteUnZero(seconds);
      chrono.currentTime += 1;
    }, 1000)
  },
  pause() {
    chrono.previousTime += chrono.currentTime
    clearInterval(chrono.intervalID)
    chrono.currentTime = 0;

    console.log(chrono.currentTime)
    console.log(chrono.previousTime)

  },
  stop() {
    chrono.currentTime = 0;
    chrono.previousTime = 0;
    clearInterval(chrono.intervalID)
  },
}

function ajouteUnZero(num) {
  return (num < 10) ? "0" + num : num
}

const listenOnBtnStart = () => interface.button.start.addEventListener('click', chrono.start, {once: true});
interface.button.pause.addEventListener('click', () => {
  chrono.pause();
  listenOnBtnStart();
});
interface.button.stop.addEventListener('click', () => {
  chrono.stop(); 
  listenOnBtnStart(); 
});

listenOnBtnStart(); 