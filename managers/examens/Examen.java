package managers.examens;

import managers.admin.Cours;
import managers.personnes.Etudiant;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

public abstract class Examen {
    ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
    private Date dateExam;
    private Duration duree;
    private Float coeff;
    private Cours unCours;

    public Examen(Date dateExam, Duration duree, Float coeff) {
        this.dateExam = dateExam;
        this.duree = duree;
        this.coeff = coeff;
    }

    public Date getDateExam() {
        return dateExam;
    }

    public void setDateExam(Date dateExam) {
        this.dateExam = dateExam;
    }

    public Duration getDuree() {
        return duree;
    }

    public void setDuree(Duration duree) {
        this.duree = duree;
    }

    public Float getCoeff() {
        return coeff;
    }

    public void setCoeff(Float coeff) {
        this.coeff = coeff;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "dateExam=" + dateExam +
                ", duree=" + duree +
                ", coeff=" + coeff +
                '}';
    }

    //TODO: reprogrammer cette méthode après avoir nettoyer notre project un peux.
    /*public Float calculerMoyenne(ArrayList<Etudiant> lesPresents) {
        Float resultat = 0;
        for (int i = 0; i <= lesPresents.size(); i++) {
            resultat = resultat + unCours.h; //Ajouter notes dans les attributs (Soit dans Cours, soit dans Examen)
        }
        resultat = resultat / lesPresents.size;
    }*/
}
