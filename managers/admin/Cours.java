package managers.admin;

import managers.GestionGlobal;
import managers.examens.Examen;
import managers.personnes.Enseignant;
import managers.personnes.Etudiant;

import java.util.ArrayList;

public class Cours extends GestionGlobal {
    //region déclaration des attributs
    ArrayList<Etudiant> lesEtudiants = new ArrayList<Etudiant>();
    ArrayList<Examen> lesExamens = new ArrayList<Examen>();
    private Enseignant enseignantRef;
//endregion

    //===============================================================
    // Methods
    //===============================================================
    public Cours(int id, String nom, Enseignant enseignantRef) {
        super(id, nom);
        this.enseignantRef = enseignantRef;
    }

    @Override
    public String toString() {
        return "Cours{" + super.toString() +
                "lesEtudiants=" + lesEtudiants +
                ", lesExamens=" + lesExamens +
                ", enseignantRef=" + enseignantRef +
                '}';
    }
}
