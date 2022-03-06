package utility;

import managers.personnes.Etudiant;

import java.io.Serializable;
import java.util.ArrayList;

public interface ITableManager<Class> extends Serializable {

//region Ecriture & lecture dans un fichier

    //Ecriture
    void ecritureFichier(String filePath, ArrayList<Class> tableauxClass);

    //Lecture
    ArrayList<Etudiant> lectureFichier(String filePath);

    //Reconstruction de notre classe
    Class createClass(String[] metadata);

//endregion


//region Lister et triage

    //Lister tous les objets
    void listerObject(ArrayList<Class> objTable);

    //Trier les objets alphabetiquement
    ArrayList<Class> listerAlphabetObject(ArrayList<Class> objTable);

//endregion


//region Modifier ajouter supprimer

    //Ajouter
    Class ajouter(Class objClass, ArrayList<Class> tabClass);

    //Modifier
    Class modifier(Class objClass, ArrayList<Class> tabClass);

    //Supprimer
    void supprimer(Class objClass, ArrayList<Class> tabClass);

//endregion
}
