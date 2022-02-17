import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    // CONSTANTES - non -

    // ATTRIBUTS
    int id;
    int numEtudiant;
    String numSecu;
    String nom;
    String prenom;
    String lieuDeNaissance;
    Date dateDeNaissance;
    String promotion;
    String mailPerso;
    String mailPro;

    // CONSTRUCTEUR singleton
    public Etudiant() {
     
    }

    public Etudiant(int id, int numEtudiant, String numSecu, String nom, String prenom, String lieuDeNaissance, Date dateDeNaissance, String promotion, String mailPerso, String mailPro) {
        this.id = id;
        this.numEtudiant = numEtudiant;
        this.numSecu = numSecu;
        this.nom = nom;
        this.prenom = prenom;
        this.lieuDeNaissance = lieuDeNaissance;
        this.dateDeNaissance = dateDeNaissance;
        this.promotion = promotion;
        this.mailPerso = mailPerso;
        this.mailPro = mailPro;
    }

    // METHODES D'ENCAPSULATION

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumEtudiant() {
        return this.numEtudiant;
    }

    public void setNumEtudiant(int numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public String getNumSecu() {
        return this.numSecu;
    }

    public void setNumSecu(String numSecu) {
        this.numSecu = numSecu;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLieuDeNaissance() {
        return this.lieuDeNaissance;
    }

    public void setLieuDeNaissance(String lieuDeNaissance) {
        this.lieuDeNaissance = lieuDeNaissance;
    }

    public Date getDateDeNaissance() {
        return this.dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getPromotion() {
        return this.promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getMailPerso() {
        return this.mailPerso;
    }

    public void setMailPerso(String mailPerso) {
        this.mailPerso = mailPerso;
    }

    public String getMailPro() {
        return this.mailPro;
    }

    public void setMailPro(String mailPro) {
        this.mailPro = mailPro;
    }

    // METHODES USUELLES

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", numEtudiant='" + getNumEtudiant() + "'" +
            ", numSecu='" + getNumSecu() + "'" +
            ", nom='" + getNom() + "'" +
            ", prenom='" + getPrenom() + "'" +
            ", lieuDeNaissance='" + getLieuDeNaissance() + "'" +
            ", dateDeNaissance='" + getDateDeNaissance() + "'" +
            ", promotion='" + getPromotion() + "'" +
            ", mailPerso='" + getMailPerso() + "'" +
            ", mailPro='" + getMailPro() + "'" +
            "}";
    }

    // METHODES SPECIFIQUES

}
