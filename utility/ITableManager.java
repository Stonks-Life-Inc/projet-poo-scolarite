package utility;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

//Cette interface permet de contrôller les tableaux d'objets plus facilement.
//Elle permet : d'ajouter, modifier ou supprimer un objet.
//Charger et enregistrer un tableau dans un fichier.
//Trier et lister le tableau.
public interface ITableManager extends Serializable {

//region Ecriture & lecture dans un fichier

    void writeObject(ArrayList tab, String filename)
            throws IOException; //Method de la classe serialize

    ArrayList<Object> readObject(String filename)
            throws IOException,
            ClassNotFoundException; //Method de la classe serialize

//endregion


//region Lister et triage

    //Lister tous les objets
    void listerObject(ArrayList objTable);

    //Trier les objets alphabetiquement
    ArrayList listerAlphabetObject(ArrayList objTable);

//endregion


//region Modifier ajouter supprimer

    //Ajouter
    ArrayList<Object> ajouter(Object objClass, ArrayList<Object> tabClass);

    //Modifier
    ArrayList<Object> modifier(Object objClass, ArrayList<Object> tabClass);

    //Supprimer
    ArrayList<Object> supprimer(Object objClass, ArrayList<Object> tabClass);

//endregion
}
