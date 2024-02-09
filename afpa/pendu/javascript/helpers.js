export function getAlphabet() {
    const CHARCODE_A = 97; const CHARCODE_Z = 122;

    const letters = []
    for (let i = CHARCODE_A; i <= CHARCODE_Z; i++) {
        letters.push(String.fromCharCode(i));
    }

    return letters;
}