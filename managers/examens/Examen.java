package managers.examens;

import java.time.Duration;
import java.util.Date;

public abstract class Examen {
    private Date dateExam;
    private Duration duree;
    private Float coeff;

    public Examen(Date dateExam, Duration duree, Float coeff) {
        this.dateExam = dateExam;
        this.duree = duree;
        this.coeff = coeff;
    }

    public Date getDateExam() {
        return dateExam;
    }

    public void setDateExam(Date dateExam) {
        this.dateExam = dateExam;
    }

    public Duration getDuree() {
        return duree;
    }

    public void setDuree(Duration duree) {
        this.duree = duree;
    }

    public Float getCoeff() {
        return coeff;
    }

    public void setCoeff(Float coeff) {
        this.coeff = coeff;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "dateExam=" + dateExam +
                ", duree=" + duree +
                ", coeff=" + coeff +
                '}';
    }
}
