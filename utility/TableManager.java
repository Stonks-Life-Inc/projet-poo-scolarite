package utility;

import managers.examens.ControlFinal;
import managers.examens.Controle;
import managers.examens.Projet;
import managers.examens.TravailPratique;
import managers.personnes.Enseignant;
import managers.personnes.Etudiant;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class TableManager implements ITableManager<TableManager> {

    ArrayList<Etudiant> etudiants = new ArrayList<>();
    ArrayList<Enseignant> enseignants = new ArrayList<>();

    ArrayList<TravailPratique> tps = new ArrayList<>();
    ArrayList<Projet> projets = new ArrayList<>();
    ArrayList<ControlFinal> cfs = new ArrayList<>();
    ArrayList<Controle> controles = new ArrayList<>();

//region gestion du tableau Etudiant

    @Override
    public void ecritureFichier(String filePath, ArrayList etudiants) {

    }

    @Override
    public ArrayList<Etudiant> lectureFichier(String filePath) {
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        Path pathToFile = Paths.get(filePath);
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
    public Etudiant createClass(String[] metadata) {
        int id = Integer.parseInt(metadata[0]);
        int numEtud = Integer.parseInt(metadata[1]);
        String numSS = metadata[2];
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

        return new Etudiant(id, nom, prenom, mailUni, numSS, ldn, ddn, numEtud, promo, mailPerso);
    }

    @Override
    public void listerObject(ArrayList etudiants) {
        for (int i = 0; i <= etudiants.size(); i++) {
            System.out.println(etudiants.get(i));
        }
    }

    @Override
    public ArrayList<Etudiant> listerAlphabetObject(ArrayList etudiants) {
        etudiants.sort((Comparator) etudiants);
        for (int i = 0; i <= etudiants.size(); i++) {
            System.out.println(etudiants.get(i));
        }
        return etudiants;
    }

    @Override
    public ArrayList<Etudiant> ajouter(Etudiant etudiant, ArrayList<Etudiant> etudiants) {
        etudiants.add(etudiant);
        return etudiants;
    }

    @Override
    public ArrayList<Etudiant> modifier(Etudiant etudiant, ArrayList<Etudiant> etudiants) {
        etudiants.remove(etudiant);
        etudiants.add(etudiant);

        return etudiants;
    }

    @Override
    public ArrayList<Etudiant> supprimer(Etudiant etudiant, ArrayList<Etudiant> etudiants) {
        etudiants.remove(etudiant);
        return etudiants;
    }

//endregion

//region gestion du tableau Enseignant

    @Override
    public void ecritureFichier(String filePath, ArrayList enseignants) {

    }

    @Override
    public ArrayList<Enseignant> lectureFichier(String filePath) {
        ArrayList<Enseignant> enseignants = new ArrayList<>();
        Path pathToFile = Paths.get(filePath);
        String[] attr;
        Enseignant Enseignant;
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
                Enseignant = createClass(attr);

                //We add our newly created obj into our table
                enseignants.add(Enseignant);


            } while (line != null);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return enseignants;
        }
    }

    @Override
    public Enseignant createClass(String[] metadata) {


        return new Enseignant();
    }

    @Override
    public void listerObject(ArrayList enseignants) {
        for (int i = 0; i <= enseignants.size(); i++) {
            System.out.println(enseignants.get(i));
        }
    }

    @Override
    public ArrayList<Enseignant> listerAlphabetObject(ArrayList enseignants) {
        enseignants.sort((Comparator) enseignants);
        for (int i = 0; i <= enseignants.size(); i++) {
            System.out.println(enseignants.get(i));
        }
        return enseignants;
    }

    @Override
    public ArrayList<Enseignant> ajouter(Enseignant Enseignant, ArrayList<Enseignant> enseignants) {
        enseignants.add(Enseignant);
        return enseignants;
    }

    @Override
    public ArrayList<Enseignant> modifier(Enseignant Enseignant, ArrayList<Enseignant> enseignants) {
        enseignants.remove(Enseignant);
        enseignants.add(Enseignant);

        return enseignants;
    }

    @Override
    public ArrayList<Enseignant> supprimer(Enseignant Enseignant, ArrayList<Enseignant> enseignants) {
        enseignants.remove(Enseignant);
        return enseignants;
    }

//endregion
}