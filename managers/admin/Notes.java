package managers.admin;

import managers.GestionGlobal;
import managers.examens.Examen;

public class Notes extends GestionGlobal {

    private Examen examen;

    //===============================================================
    // Methods
    //===============================================================
    public Notes(int id, String nom, Examen examen) {
        super(id, nom);
        this.examen = examen;
    }

    public String $toString() {
        return "Notes{" +
                "examen=" + examen +
                '}';
    }

}
