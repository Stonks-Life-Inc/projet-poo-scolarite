package managers.personnes;

import managers.admin.Cours;
import managers.examens.Examen;
import utility.IFileManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Etudiant extends Personne implements IFileManager<Etudiant> {

    ArrayList<Cours> lesCours = new ArrayList<Cours>();
    ArrayList<Examen> lesExamens = new ArrayList<Examen>();
    private String nss; //Numéro SS
    private String pob; //Place of birth
    private Date ddn; //Date de naissance
    private String promo; //Promo
    private String mailPerso;

    //TODO: "reconstruire" les arguments du constructeur pour les mettre dans le bon ordre et qu'ils soit tous présent!
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

    //File Manager method

    @Override
    public ArrayList<Etudiant> lireFichier(String filename) {
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        Path pathToFile = Paths.get(filename);
        String[] attr;
        Etudiant etudiant;
        String line;

        //We init a new BufferedReader in this try catch clause.
        try (BufferedReader br = Files.newBufferedReader(pathToFile)) {

            //We loop through each line (item) in our table
            do {
                //We read all lines at once
                line = br.readLine();

                //We split each value by , (because our CSV is split thanks to ,)
                attr = line.split(",");

                //We call our ceateClass method to reconstruct an object from this String[]
                etudiant = createClass(attr);

                //We add our newly created obj into our table
                etudiants.add(etudiant);


            } while (line != null);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return etudiants;
        }
    }

    @Override
    public void ecritureFichier(BufferedReader currentBuffer, ArrayList<Etudiant> gestions) {

    }

    @Override
    public Etudiant createClass(String[] metadata) {
        int id = Integer.parseInt(metadata[0]);
        int numEtud = Integer.parseInt(metadata[1]);
        int numSS = Integer.parseInt(metadata[2]);
        String nom = metadata[3];
        String prenom = metadata[4];
        String ldn = metadata[5];
        Date ddn = null;
        try {
            ddn = new SimpleDateFormat("dd/MM/yyy").parse(metadata[6]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String promo = metadata[7];
        String mailPerso = metadata[8];
        String mailUni = metadata[9];

        return new Etudiant(id, numEtud, numSS, nom, prenom, ldn, ddn, promo, mailPerso, mailUni);
    }
}
