package managers;

import managers.personnes.Personne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class GestionGlobal {
//region déclaration des attributs
    protected final int id;
    protected final String nom;

    private ArrayList<GestionGlobal> gestions = new ArrayList<>();
//endregion

    //===============================================================
    // Methods
    //===============================================================
    public GestionGlobal(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
//region Getters&Setters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
//endregion

//region Modification des tableaus
    //Modification du tableau des personnes
    ArrayList<GestionGlobal> ajouterObjet(ArrayList<GestionGlobal> gb){
        gb.add(this);
        return gb;
    }

    ArrayList<GestionGlobal> supprimerObjet(ArrayList<GestionGlobal> gb){
        gb.remove(this);
        return gb;
    }

    ArrayList<GestionGlobal> modifierObjet(ArrayList<GestionGlobal> gb){
        gb.remove(this.id);
        gb.add(this);
        return gb;
    }
//endregion

//region Listes et triage
    void listerObject() {
        for (int i = 0; i <= gestions.size(); i++) {
            System.out.println(gestions.get(i));
        }
    }

    ArrayList<GestionGlobal> listerAlphabetObject(ArrayList<GestionGlobal> gestions) {
        gestions.sort((Comparator<? super GestionGlobal>) gestions);
        for (int i = 0; i <= gestions.size(); i++) {
            System.out.println(gestions.get(i));
        }
        return gestions;
    }
//endregion
}
