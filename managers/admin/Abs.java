package managers.admin;

import managers.GestionGlobal;
import managers.personnes.Etudiant;

import java.util.Date;

public class Abs extends GestionGlobal {
    private Etudiant etudiant;
    private Cours cours;
    private Date dateAbs;
    private String motif;

    public Abs(int id, String nom, Etudiant etudiant, Cours cours, Date dateAbs, String motif) {
        super(id, nom);
        this.etudiant = etudiant;
        this.cours = cours;
        this.dateAbs = dateAbs;
        this.motif = motif;
    }

    public Abs(int id, String nom) {
        super(id, nom);
    }

    @Override
    public String toString() {
        return "Abs{" + super.toString() +
                "etudiant=" + etudiant +
                ", cours=" + cours +
                ", dateAbs=" + dateAbs +
                ", motif='" + motif + '\'' +
                '}';
    }
}
