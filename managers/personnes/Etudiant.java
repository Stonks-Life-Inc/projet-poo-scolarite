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

//region gestion des tableaux

    @Override
    public void writeObject(ArrayList tab, String filename) throws IOException {
        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            // Method for serialization of object
            for (Object obj:
                    tab) {
                out.writeObject(obj);
            }

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    @Override
    public ArrayList<Object> readObject(String filename) throws IOException, ClassNotFoundException {
        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            ArrayList<Object> tabObj = new ArrayList<>();

            // Method for deserialization of object
            tabObj.add((Object) in.readObject());

            in.close();
            file.close();

            return tabObj;
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
            System.out.println(ex);
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
        return null;
    }

    @Override
    public void listerObject(ArrayList etudiants) {
        for (int i = 0; i <= etudiants.size()-1; i++) {
            System.out.println(etudiants.get(i));
        }
    }

    @Override
    public ArrayList<Object> listerAlphabetObject(ArrayList tabObjets) {
        tabObjets.sort((Comparator) tabObjets);
        for (int i = 0; i <= tabObjets.size()-1; i++) {
            System.out.println(tabObjets.get(i));
        }
        return tabObjets;
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
