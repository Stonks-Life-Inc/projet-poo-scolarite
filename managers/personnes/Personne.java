package managers.personnes;

import managers.GestionGlobal;


public abstract class Personne extends GestionGlobal {
    private String prénom;
    private String mailUni;


    public Personne(String nom, String prénom, String mailUni) {
        super(id, nom, gestions);
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
}
