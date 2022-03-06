package managers.personnes;

import managers.GestionGlobal;

import java.util.ArrayList;


public abstract class Personne extends GestionGlobal {
//region déclaration des attributs
    private String prénom;
    private String mailUni;
//endregion

    //===============================================================
    // Methods
    //===============================================================
    public Personne(int id, String nom, String prénom, String mailUni) {
        super(id, nom);
        this.prénom = prénom;
        this.mailUni = mailUni;
    }

//region Getters&Setters
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
//endregion

    @Override
    public String toString() {
        return "Personne{" +
                ", prénom='" + prénom + '\'' +
                ", mailUni='" + mailUni + '\'' +
                '}';
    }

    //Methodes tableau (ajouter, supprimer, modifier)


    //FileManager méthodes
    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getNom() {
        return super.getNom();
    }
}
