package managers.admin;

import managers.GestionGlobal;
import managers.examens.Examen;
import managers.personnes.Enseignant;
import managers.personnes.Etudiant;
import utility.ITableManager;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Cours extends GestionGlobal implements ITableManager {
    //region déclaration des attributs
    ArrayList<Etudiant> lesEtudiants = new ArrayList<Etudiant>();
    ArrayList<Examen> lesExamens = new ArrayList<Examen>();
    private Enseignant enseignantRef;
//endregion

    //===============================================================
    // Methods
    //===============================================================
    public Cours(int id, String nom, Enseignant enseignantRef) {
        super(id, nom);
        this.enseignantRef = enseignantRef;
    }

    @Override
    public String toString() {
        return "Cours{" + super.toString() +
                "lesEtudiants=" + lesEtudiants +
                ", lesExamens=" + lesExamens +
                ", enseignantRef=" + enseignantRef +
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
