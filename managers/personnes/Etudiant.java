package managers.personnes;

import managers.admin.Cours;
import managers.admin.Notes;
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
    ArrayList<Notes> notes = new ArrayList<Notes>();
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

    public ArrayList<Notes> getNotes(){
        return this.notes;
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
        // Serialization
        try {
            // Sauvegarde des objets dans un fichier
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Serialization des objets
            for (Object obj :
                    tab) {
                out.writeObject(obj);
            }

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }

    @Override
    public ArrayList<Object> readObject(String filename) throws IOException, ClassNotFoundException {
        // Deserialization
        try {
            // Lecture des objets depuis un fichier
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            ArrayList<Object> tabObj = new ArrayList<>();

            // Deseizalization des objets
            tabObj.add((Object) in.readObject());

            in.close();
            file.close();

            return tabObj;
        } catch (IOException ex) {
            System.out.println("IOException is caught");
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
        return null;
    }

    @Override
    public void listerObject(ArrayList tabObj) {
        for (int i = 0; i <= tabObj.size() - 1; i++) {
            System.out.println(tabObj.get(i));
        }
    }

    @Override
    public ArrayList<Object> listerAlphabetObject(ArrayList tabObj) {
        tabObj.sort((Comparator) tabObj);
        for (int i = 0; i <= tabObj.size() - 1; i++) {
            System.out.println(tabObj.get(i));
        }
        return tabObj;
    }

    @Override
    public ArrayList<Object> ajouter(Object obj, ArrayList<Object> tabObj) {
        tabObj.add(obj);
        return tabObj;
    }

    @Override
    public ArrayList<Object> modifier(Object obj, ArrayList<Object> tabObj) {
        tabObj.remove(obj);
        tabObj.add(obj);

        return tabObj;
    }

    @Override
    public ArrayList<Object> supprimer(Object obj, ArrayList<Object> tabObj) {
        tabObj.remove(obj);
        return tabObj;
    }



//endregion
}
