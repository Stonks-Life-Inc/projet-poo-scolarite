package managers;

import utility.IFileManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public abstract class GestionGlobal {

    private final int id;
    private final String nom;

    private ArrayList<GestionGlobal> gestions;

    //===============================================================
    // Methods
    //===============================================================


    public GestionGlobal(int id, String nom, ArrayList<GestionGlobal> gestions) {
        this.id = id;
        this.nom = nom;
        this.gestions = gestions;
    }

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

    void listerObject(){
        for(int i = 0; i<= gestions.size(); i++){
            System.out.println(gestions.get(i));
        }

    }
    ArrayList<GestionGlobal> listerAlphabetObject(){
        gestions = Collections.sort(gestions);
        for(int i = 0; i<= gestions.size(); i++){
            System.out.println(gestions.get(i));
        }
        return gestions;
    }
}
ArrayList<GestionGlobal> listerObject(GestionGlobal gestionGlobal){
	for(int i = 0; i<= gestions.size; i++){
		system.out.println(gestionGlobal);
	 }
}
ArrayList<GestionGlobal> listerAlphabetObject(GestionGlobal gestionGlobal){
	Array.sort(gestions);
	for(int i = 0; i<= gestions.size; i++){
		system.out.println(gestionGlobal);
	 }
}
