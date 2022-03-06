package managers.examens;

import java.time.Duration;
import java.util.Date;

public class TravailPratique extends Examen {
    private int idPostTravail;

    //===============================================================
    // Methods
    //===============================================================
    public TravailPratique(Date dateExam, Duration duree, Float coeff, int idPostTravail) {
        super(dateExam, duree, coeff);
        this.idPostTravail = idPostTravail;
    }

//region Getters&Setters
    public int getIdPostTravail() {
        return idPostTravail;
    }

    public void setIdPostTravail(int idPostTravail) {
        this.idPostTravail = idPostTravail;
    }
//endregion

    @Override
    public String toString() {
        return "TravailPratique{" + super.toString() +
                "idPostTravail=" + idPostTravail +
                '}';
    }
}
