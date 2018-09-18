package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class BaseMood {

    private Date date;

    public BaseMood() {
        date = new Date();
    }

    public BaseMood(Date newDate) {
        date = newDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date newDate) {
        date = newDate;
    }

    public abstract String getDesc();
}
