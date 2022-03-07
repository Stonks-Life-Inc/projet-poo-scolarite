package utility;

import java.io.BufferedReader;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;

public interface IFileManager<Class> extends Serializable {

    //Lecture
    ArrayList<Class> lireFichier(String filename);

    //Ecriture
    void ecritureFichier(BufferedReader currentBuffer, ArrayList<Class> gestions);

    //Reconstruction de notre classe
    Class createClass(String[] metadata) throws ParseException;
}
