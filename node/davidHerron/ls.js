const fs = require('fs').promises; 

( async () => {
    const dir = process.argv[2] ? process.argv[2] : ".";
    const files = await fs.readdir(dir);
    for (const file of files) {
        console.log(file);
    }
})().catch(err => { console.error(err); });
