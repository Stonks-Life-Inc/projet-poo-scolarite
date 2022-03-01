package managers.personnes;

import java.util.Date;

public class Etudiant extends Personne{

    private String nss; //Numéro SS
    private String pob; //Place of birth
    private Date ddn; //Date de naissance
    private String promo; //Promo
    private String mailPerso;

    public Etudiant(String nom, String prénom, String mailUni, String nss, String pob, Date ddn, String promo, String mailPerso) {
        super(nom, prénom, mailUni);
        this.nss = nss;
        this.pob = pob;
        this.ddn = ddn;
        this.promo = promo;
        this.mailPerso = mailPerso;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public Date getDdn() {
        return ddn;
    }

    public void setDdn(Date ddn) {
        this.ddn = ddn;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public String getMailPerso() {
        return mailPerso;
    }

    public void setMailPerso(String mailPerso) {
        this.mailPerso = mailPerso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "nss='" + nss + '\'' +
                ", pob='" + pob + '\'' +
                ", ddn=" + ddn +
                ", promo='" + promo + '\'' +
                ", mailPerso='" + mailPerso + '\'' +
                '}';
    }
}
