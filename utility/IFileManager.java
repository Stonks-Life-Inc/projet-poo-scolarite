package utility;

import java.io.BufferedReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Stream;

public interface IFileManager extends Serializable {
    //Attributes
    BufferedReader Ibr = null;
    String IfilePath = null;
    Stream<String> IfileContent = null;

    //Méthodes
    BufferedReader ouvrirFichierCSV(String filePath, int typeOuverture);
    Stream<String> lireFichier(BufferedReader currentBuffer);
    void ecritureFichier(BufferedReader currentBuffer, ArrayList<Class> gestions);
}
