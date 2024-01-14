package Main;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Trips {
    private String trip;
    private Date scheduled;
    private Date actual;

    public Trips(String trip, Date scheduled, Date actual) {
        this.trip = trip;
        this.scheduled = scheduled;
        this.actual = actual;
    }

    public Date getVariance(){
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date actualTime = format.parse

        return actual - scheduled;
    }

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }

    public Date getScheduled() {
        return scheduled;
    }

    public void setScheduled(Date scheduled) {
        this.scheduled = scheduled;
    }

    public Date getActual() {
        return actual;
    }

    public void setActual(Date actual) {
        this.actual = actual;
    }
}
