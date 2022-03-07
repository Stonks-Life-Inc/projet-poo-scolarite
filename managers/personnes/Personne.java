package managers.personnes;

import managers.GestionGlobal;

import java.util.ArrayList;

//@Data
public abstract class Personne extends GestionGlobal {
    //region déclaration des attributs
    private String prénom;
    private String mailUni;
//endregion

    //===============================================================
    // Methods
    //===============================================================
    public Personne(int id, String nom, String prénom, String mailUni) {
        super(id, nom);
        this.prénom = prénom;
        this.mailUni = mailUni;
    }

//region Overriden methods

    public Personne(int id, String nom) {
        super(id, nom);
    }

    @Override
    public String toString() {
        return "Personne{" + super.toString() +
                "prénom='" + prénom + '\'' +
                ", mailUni='" + mailUni + '\'' +
                '}';
    }

    //endregion
}
