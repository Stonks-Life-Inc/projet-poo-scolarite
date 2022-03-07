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

    ArrayList<Etudiant> etudiants = new ArrayList<>();
    ArrayList<Enseignant> enseignants = new ArrayList<>();

    ArrayList<TravailPratique> tps = new ArrayList<>();
    ArrayList<Projet> projets = new ArrayList<>();
    ArrayList<ControlFinal> cfs = new ArrayList<>();
    ArrayList<Controle> controles = new ArrayList<>();

//region gestion du tableau Etudiant

//    @Override
//    public void ecritureFichier(String filePath, ArrayList etudiants) {
//
//    }
//
//    @Override
//    public ArrayList<Etudiant> lectureFichier(String filePath) {
//
//        Path pathToFile = Paths.get(filePath);
//        String[] attr;
//
//        Etudiant etudiant;
//
//
//        String line;
//
//        //We init a new BufferedReader in this try catch clause.
//        try (BufferedReader br = Files.newBufferedReader(pathToFile)) {
//
//            //We loop through each line (item) in our table
//            do {
//                //We read all lines at once
//                line = br.readLine();
//
//                //We split each value by , (because our CSV is split thanks to ,)
//                attr = line.split(",");
//
//                //We call our ceateClass method to reconstruct an object from this String[]
//                etudiant = createClass(attr);
//
//                //We add our newly created obj into our table
//                etudiants.add(etudiant);
//
//
//            } while (line != null);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            return etudiants;
//        }
//    }

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
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
        return null;
    }

    @Override
    public void listerObject(ArrayList etudiants) {
        for (int i = 0; i <= etudiants.size(); i++) {
            System.out.println(etudiants.get(i));
        }
    }

    @Override
    public ArrayList<Etudiant> listerAlphabetObject(ArrayList etudiants) {
        etudiants.sort((Comparator) etudiants);
        for (int i = 0; i <= etudiants.size(); i++) {
            System.out.println(etudiants.get(i));
        }
        return etudiants;
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