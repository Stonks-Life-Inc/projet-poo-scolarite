package managers.personnes;

import managers.admin.Cours;
import managers.examens.Examen;
import utility.ITableManager;

import java.io.IOException;
import java.util.ArrayList;
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
        return "Etudiant{" + super.toString() +
                "lesCours=" + lesCours +
                ", lesExamens=" + lesExamens +
                ", nss='" + nss + '\'' +
                ", ldn='" + ldn + '\'' +
                ", ddn=" + ddn +
                ", ne=" + ne +
                ", promo='" + promo + '\'' +
                ", mailPerso='" + mailPerso + '\'' +
                '}';
    }

    //region gestion des tableaux
    @Override
    public void writeObject(ArrayList tab, String filename) throws IOException {

    }

    @Override
    public ArrayList<Object> readObject(String filename) throws IOException, ClassNotFoundException {
        return null;
    }

    @Override
    public void listerObject(ArrayList objTable) {

    }

    @Override
    public ArrayList listerAlphabetObject(ArrayList objTable) {
        return null;
    }

    @Override
    public ArrayList<Object> ajouter(Object objClass, ArrayList<Object> tabClass) {
        return null;
    }

    @Override
    public ArrayList<Object> modifier(Object objClass, ArrayList<Object> tabClass) {
        return null;
    }

    @Override
    public ArrayList<Object> supprimer(Object objClass, ArrayList<Object> tabClass) {
        return null;
    }
    //endregion
}
