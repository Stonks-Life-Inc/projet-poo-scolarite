package managers.examens;

import managers.personnes.Etudiant;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

public class Projet extends Examen{
    private ArrayList<Etudiant> etudiants;

    public Projet(Date dateExam, Duration duree, Float coeff, ArrayList<Etudiant> etudiants) {
        super(dateExam, duree, coeff);
        this.etudiants = etudiants;
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    @Override
    public String toString() {
        return "Projet{" + super.toString() +
                "etudiants=" + etudiants +
                '}';
    }
}
