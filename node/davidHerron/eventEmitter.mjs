import EventEmitter from 'events';

export class Pulser extends EventEmitter {
    start() {
        setInterval(() => {
            console.log(`${new Date().toISOString()} >>>> pulse`);
            this.emit('pulse');
            console.log(`${new Date().toISOString()} <<<< pulse`)
        }, 1000);
    }
}

const pulser = new Pulser(); 

pulser.on('pulse', () => {
    console.log(`${new Date().toISOString()} pulse received`);
});

pulser.start();