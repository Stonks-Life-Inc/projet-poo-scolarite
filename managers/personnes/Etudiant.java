package managers.personnes;

import managers.admin.Cours;
import managers.examens.Examen;
import utility.ITableManager;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Etudiant extends Personne implements ITableManager {
    //region déclaration des attributs
    ArrayList<Cours> lesCours = new ArrayList<Cours>();
    ArrayList<Examen> lesExamens = new ArrayList<Examen>();
    private String nss; //Numéro SS
    private String ldn; //Place of birth
    private Date ddn; //Date de naissance
    private int ne; //Numéro étudiant
    private String promo; //Promo
    private String mailPerso;
//endregion

    //===============================================================
    // Methods
    //===============================================================
    public Etudiant(int id, String nom, String prénom, String mailUni, String nss, String ldn, Date ddn, int ne, String promo, String mailPerso) {
        super(id, nom, prénom, mailUni);
        this.nss = nss;
        this.ldn = ldn;
        this.ddn = ddn;
        this.ne = ne;
        this.promo = promo;
        this.mailPerso = mailPerso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "nss='" + nss + '\'' +
                ", pob='" + ldn + '\'' +
                ", ddn=" + ddn +
                ", promo='" + promo + '\'' +
                ", mailPerso='" + mailPerso + '\'' +
                '}';
    }


}
