package managers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class GestionGlobal {

    protected final int id;
    protected final String nom;

    private ArrayList<GestionGlobal> gestions = new ArrayList<>();

    //===============================================================
    // Methods
    //===============================================================
    public GestionGlobal(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<GestionGlobal> getGestions() {
        return gestions;
    }

    public void setGestions(ArrayList<GestionGlobal> gestions) {
        this.gestions = gestions;
    }

    //Méthodes de gestion de notre liste (ajouter, supprimer, modifier)
    ArrayList<GestionGlobal> ajouterObject(GestionGlobal gestionGlobal) {
        gestions.add(gestionGlobal);

        return gestions;
    }

    GestionGlobal modifierObject(GestionGlobal gestionGlobal) {
        gestions.remove(gestionGlobal.id);
        gestions.add(gestionGlobal);

        return gestionGlobal;
    }

    ArrayList<GestionGlobal> supprimerObject(GestionGlobal gestionGlobal) {
        gestions.remove(gestionGlobal);

        return gestions;
    }

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
}
