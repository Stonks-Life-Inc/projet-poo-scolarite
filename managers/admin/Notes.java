package managers.admin;

import managers.GestionGlobal;
import managers.examens.Examen;

import java.util.ArrayList;

public class Notes extends GestionGlobal {

    private Examen examen;

    public Notes(int id, String nom, FileManager fm, ArrayList<GestionGlobal> gestions,
    Examen examen) {
        super(id, nom, fm, gestions);

        this.examen = examen;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public String $toString() {
        return "Notes{" +
                "examen=" + examen +
                '}';
    }
}
