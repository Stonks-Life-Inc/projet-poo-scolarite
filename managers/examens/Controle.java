package managers.examens;

import java.time.Duration;
import java.util.Date;

public class Controle extends Examen {
    //Mêmes attributs et méthodes que la classe Examen.
    //Si nous avons besoin d'ajouter de nouveaux attributs ou action pour cette partie métier, nous pouvons just ajouter
    //Les informations ici

    //===============================================================
    // Methods
    //===============================================================
    public Controle(Date dateExam, Duration duree, Float coeff) {
        super(dateExam, duree, coeff);
    }

    @Override
    public String toString() {
        return "Controle{" + super.toString() +
                "etudiants=" + etudiants +
                '}';
    }
}
