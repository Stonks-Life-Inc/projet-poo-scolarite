package managers;

import utility.FileManager;

import java.util.ArrayList;

public abstract class GestionGlobal {

    private int id;
    private String nom;

    private FileManager fm;

    private ArrayList<GestionGlobal> gestions = new ArrayList<>();



    //===============================================================
    // Methods
    //===============================================================

    //Méthodes de gestion de notre liste (ajouter, supprimer, modifier)
    ArrayList<GestionGlobal> ajouterObject(GestionGlobal gestionGlobal){
        gestions.add(gestionGlobal);

        return gestions;
    }
    GestionGlobal modifierObject(GestionGlobal gestionGlobal){
        gestions.remove(gestionGlobal.id);
        gestions.add(gestionGlobal);

        return gestionGlobal;
    }
    ArrayList<GestionGlobal> supprimerObject(GestionGlobal gestionGlobal){
        gestions.remove(gestionGlobal);

        return gestions;
    }
}
