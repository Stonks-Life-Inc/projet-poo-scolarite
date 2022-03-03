package utility;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class FileManager implements Serializable {

    private BufferedReader br;
    private String filePath;
    private Stream<String> fileContent;

    public FileManager(String filePath) {
        //Nous devons déclarer le chemin quand nous initialisons la classe
        this.filePath = filePath;

        //Nous pouvons ensuite ouvrire et lire le fichier  directement.
        br = ouvrirFichierCSV(this.filePath, 0);
        fileContent = lireFichier(br);
    }

    //Méthode de gestion des fichiers CSV lecture
    BufferedReader ouvrirFichierCSV(String filePath, int typeOuverture){
        BufferedReader br = null;
        //L'ouverture d'un fichier peu renvoyer des exceptions.
        //Nous effectuons un try catch pour la "sécurité"
        try {
            File file = new File(filePath);
            switch (typeOuverture){
                case 0: //Ouverture en lecture
                    br = new BufferedReader(new FileReader(file));
                    break;
                case 1: //Ouverture en écriture
                    br = new BufferedReader(new FileReader(file));
                    break;
            }

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

    void ecritureFichier(BufferedReader currentBuffer, ArrayList<Class> gestions){
        StringBuffer sb = new StringBuffer();
        for (Class test:
             gestions) {
            test.getId();
        }

    }

}
