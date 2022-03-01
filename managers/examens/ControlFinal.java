package managers.examens;

import java.time.Duration;
import java.util.Date;

public class ControlFinal extends Examen{
    private Date dateRattrapage;

    public ControlFinal(Date dateExam, Duration duree, Float coeff, Date dateRattrapage) {
        super(dateExam, duree, coeff);
        this.dateRattrapage = dateRattrapage;
    }

    public Date getDateRattrapage() {
        return dateRattrapage;
    }

    public void setDateRattrapage(Date dateRattrapage) {
        this.dateRattrapage = dateRattrapage;
    }

    @Override
    public String toString() {
        return "ControlFinal{" + super.toString() +
                "dateRattrapage=" + dateRattrapage +
                '}';
    }
}
