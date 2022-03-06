package managers.personnes;

import managers.GestionGlobal;

import java.util.ArrayList;


public abstract class Personne extends GestionGlobal {
    private String prénom;
    private String mailUni;

    public Personne(int id, String nom, String prénom, String mailUni) {
        super(id, nom);
        this.prénom = prénom;
        this.mailUni = mailUni;
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
                ", prénom='" + prénom + '\'' +
                ", mailUni='" + mailUni + '\'' +
                '}';
    }

    //FileManager méthodes

    public Personne(int id, String nom) {
        super(id, nom);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public ArrayList<GestionGlobal> getGestions() {
        return super.getGestions();
    }

    @Override
    public void setGestions(ArrayList<GestionGlobal> gestions) {
        super.setGestions(gestions);
    }
}
