/*
 * BaseMood class represents a single mood
 *
 * @author: nphoskin
 * @since   1.0
 * @see     java.io
 *
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * BaseMood class represents a single mood, to be implemented by other classes.
 */
public abstract class BaseMood {

    private Date date;

    /**
     * Constructor for each mood - set the date
     */
    public BaseMood() {
        date = new Date();
    }

    /**
     * Constructor where a date is provided
     * @param newDate the provided date
     */
    public BaseMood(Date newDate) {
        date = newDate;
    }

    /**
     * Get the date of the mood
     * @return the date of the mood
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the date of the mood
     * @param newDate the date of the mood
     */
    public void setDate(Date newDate) {
        date = newDate;
    }

    /**
     * Get a description of the mood
     * @return the description of the mood
     */
    public abstract String getDesc();
}
