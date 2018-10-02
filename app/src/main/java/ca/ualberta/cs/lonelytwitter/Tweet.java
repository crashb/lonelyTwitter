/*
 * Tweet class represents a single tweet
 *
 * @author: nphoskin
 * @since   1.0
 * @see     java.io
 *
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Tweet class represents a single tweet.
 */
public class Tweet {

    private String text;
    private final ArrayList<BaseMood> moods;

    /**
     * Generate a new tweet.
     * @param newText the text of the tweet
     */
    public Tweet(String newText) {
        text = newText;
        moods = new ArrayList<BaseMood>();
    }

    /**
     * Return the text of the tweet
     * @return the text of the tweet
     */
    public String getText() {
        return text;
    }

    /**
     * Add a Mood object to the tweet
     * @param mood the mood being added to the tweet
     */
    public void addMood(BaseMood mood) {
        moods.add(mood);
    }

    /**
     * Get moods of tweets in string value.
     * @return the combined list of moods
     */
    public String getMoods() {
        String moodString = "";
        for (int i = 0; i < moods.size(); i++) {
            moodString += moods.get(i).getDesc() + "\n";
        }
        return moodString;
    }

    /**
     * Represent a tweet in string value
     * @return the text of the tweet
     */
    public String toString() {
        return getText();
    }
}
