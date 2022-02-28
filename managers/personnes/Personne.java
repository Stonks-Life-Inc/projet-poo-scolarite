package managers.personnes;

import java.util.HashMap;



public abstract class Personne {
    private String nom;
    private String prénom;
    private String mailUni;

    public Personne(String nom, String prénom, String mailUni) {
        this.nom = nom;
        this.prénom = prénom;
        this.mailUni = mailUni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getMailUni() {
        return mailUni;
    }

    public void setMailUni(String mailUni) {
        this.mailUni = mailUni;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", mailUni='" + mailUni + '\'' +
                '}';
    }
}
