package managers.personnes;

import managers.GestionGlobal;
import utility.IFileManager;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;


public abstract class Personne extends GestionGlobal {
    private String prénom;
    private String mailUni;

    public Personne(int id, String nom, ArrayList<GestionGlobal> gestions, String prénom, String mailUni) {
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
