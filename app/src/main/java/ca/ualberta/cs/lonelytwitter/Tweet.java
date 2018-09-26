package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class Tweet {

    private String text;
    private final ArrayList<BaseMood> moods;

    public Tweet(String newText) {
        text = newText;
        moods = new ArrayList<BaseMood>();
    }

    public String getText() {
        return text;
    }

    public void addMood(BaseMood mood) {
        moods.add(mood);
    }

    public String getMoods() {
        String moodString = "";
        for (int i = 0; i < moods.size(); i++) {
            moodString += moods.get(i).getDesc() + "\n";
        }
        return moodString;
    }

    public String toString() {
        return getText();
    }
}
