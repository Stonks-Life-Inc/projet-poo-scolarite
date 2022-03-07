package managers;

import java.io.Serializable;

public abstract class GestionGlobal implements Serializable {
    //region déclaration des attributs
    protected final int id;
    protected final String nom;
//endregion

    //===============================================================
    // Methods
    //===============================================================

    public GestionGlobal(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
}