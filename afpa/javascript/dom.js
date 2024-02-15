const dom = {
    logements: document.getElementById("logements"),
    estDisponible: document.getElementById("estDisponible"),

    appendLogements(logements) {
        const root = this.logements;
        this.removeLogements();

        logements.forEach(logement => {
            const div = document.createElement("div");
            div.innerHTML = `
            <h2>Logement</h2>
            <p id="estDisponible${logement.getID()}">${logement.getEstDisponible() === true ? "disponible" : "indisponible"}</p>
            <p>${logement.toString()}</p>
            <h3>Propriétaire</h3>
            <p>${logement.getProprietaire().toString()}</p>
            <h3>Agent</h3>
            <p>${logement.getAgent().toString()}</p>
            <button id="reserver_${logement.getID()}">Réserver</button>
            <button id="liberer_${logement.getID()}">Libérer</button>`
            root.appendChild(div);
        });
    },

    removeLogements() {
        const root = this.logements;
        while (root.lastElementChild) {
            root.removeChild(root.lastElementChild);
        }
    },

    cacherIndisponiblesIsChecked() {
        return this.estDisponible.checked
    }
}

export default dom; 
