package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class FileManager {

    private BufferedReader br;
    private String filePath;
    private Stream<String> fileContent;

    public FileManager(String filePath) {
        //Nous devons déclarer le chemin quand nous initialisons la classe
        this.filePath = filePath;

        //Nous pouvons ensuite ouvrire et lire le fichier  directement.
        br = ouvrirFichierCSV(this.filePath);
        fileContent = lireFichier(br);
    }

    //Méthode de gestion des fichiers CSV lecture
    BufferedReader ouvrirFichierCSV(String filePath){
        BufferedReader br = null;
        //L'ouverture d'un fichier peu renvoyer des exceptions.
        //Nous effectuons un try catch pour la "sécurité"
        try {
            File file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
        } catch(IOException e) {
            //Notre code a renvoyé une exception.
            //Nous affichons les informations nécessaires pour le débugage

            e.printStackTrace();
        } finally {
            //Dans tous les cas, nous voulons effectuer les opérations suivantes
            return br;
        }
    }

    Stream<String> lireFichier(BufferedReader currentBuffer){
        String line;
        Stream<String> fileContent;

        fileContent = currentBuffer.lines();

        return fileContent;
    }

}
