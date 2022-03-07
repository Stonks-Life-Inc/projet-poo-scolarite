package managers.examens;

import managers.personnes.Etudiant;
import utility.ITableManager;

import java.io.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Projet extends Examen implements ITableManager {
    private ArrayList<Etudiant> etudiants;

    //===============================================================
    // Methods
    //===============================================================
    public Projet(Date dateExam, Duration duree, Float coeff, ArrayList<Etudiant> etudiants) {
        super(dateExam, duree, coeff);
        this.etudiants = etudiants;
    }

    @Override
    public String toString() {
        return "Projet{" + super.toString() +
                "etudiants=" + etudiants +
                '}';
    }

    //region gestion des tableaux

    @Override
    public void writeObject(ArrayList tab, String filename) throws IOException {
        // Serialization
        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            // Method for serialization of object
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
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            ArrayList<Object> tabObj = new ArrayList<>();

            // Method for deserialization of object
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
    public void listerObject(ArrayList etudiants) {
        for (int i = 0; i <= etudiants.size() - 1; i++) {
            System.out.println(etudiants.get(i));
        }
    }

    @Override
    public ArrayList<Object> listerAlphabetObject(ArrayList tabObjets) {
        tabObjets.sort((Comparator) tabObjets);
        for (int i = 0; i <= tabObjets.size() - 1; i++) {
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
