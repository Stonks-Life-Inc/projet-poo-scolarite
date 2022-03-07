package utility;

import managers.examens.ControlFinal;
import managers.examens.Controle;
import managers.examens.Projet;
import managers.examens.TravailPratique;
import managers.personnes.Enseignant;
import managers.personnes.Etudiant;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class TableManager implements ITableManager {

    ArrayList<Object> etudiants = new ArrayList<Object>();
    ArrayList<Enseignant> enseignants = new ArrayList<>();

    ArrayList<TravailPratique> tps = new ArrayList<>();
    ArrayList<Projet> projets = new ArrayList<>();
    ArrayList<ControlFinal> cfs = new ArrayList<>();
    ArrayList<Controle> controles = new ArrayList<>();

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
    public void listerObject(ArrayList tabObj) {
        for (int i = 0; i <= tabObj.size()-1; i++) {
            System.out.println(tabObj.get(i));
        }
    }

    @Override
    public ArrayList<Object> listerAlphabetObject(ArrayList tabObj) {
        tabObj.sort((Comparator) tabObj);
        for (int i = 0; i <= tabObj.size()-1; i++) {
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