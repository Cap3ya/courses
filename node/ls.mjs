import { promises as fs } from 'fs';

async function listFiles() {
    const files = await fs.readdir('.');
    for (const file of files) {
        console.log(files);
    }
}

listFiles().catch(err => console.log(err));