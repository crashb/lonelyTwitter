package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import org.junit.Test;

import java.util.ArrayList;

public class TweetListTest extends ActivityInstrumentationTestCase2{

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    // JUnit test method for adding tweet into TweetList
    @Test
    public void testAddTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added tweet");
        tweetList.add(tweet);

        assertTrue(tweetList.hasTweet(tweet));
    }

    // JUnit test method for checking whether a tweet is in the TweetList
    @Test
    public void testHasTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        assertFalse(tweetList.hasTweet(tweet));

        tweetList.add(tweet);

        assertTrue(tweetList.hasTweet(tweet));
    }

    // JUnit test method for testing if a tweet is gotten properly
    @Test
    public void testGetTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("get tweet check");

        tweetList.add(tweet);
        Tweet retreivedTweet = tweetList.getTweet(0);

        assertEquals(retreivedTweet, tweet);
    }

    @Test
    public void testGetTweets() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("1");

        ArrayList<Tweet> arrayList = new ArrayList<Tweet>();
        assertEquals(arrayList, tweetList.getTweets());

        arrayList.add(tweet);
        tweetList.add(tweet);
        assertEquals(arrayList, tweetList.getTweets());
    }

    // JUnit test method for testing if a tweet is deleted properly
    @Test
    public void testDeleteTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("delete check");

        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));

        tweetList.delete(tweet);
        assertFalse(tweetList.hasTweet(tweet));
    }

    // JUnit test method for counting tweets in tweet list
    @Test
    public void testGetCount() {
        TweetList tweetList = new TweetList();
        assertEquals(0, tweetList.getCount());

        Tweet tweet = new NormalTweet("1");
        tweetList.add(tweet);
        assertEquals(1, tweetList.getCount());
    }
}
