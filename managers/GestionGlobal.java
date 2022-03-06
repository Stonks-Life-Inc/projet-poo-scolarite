package managers;

public abstract class GestionGlobal {
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