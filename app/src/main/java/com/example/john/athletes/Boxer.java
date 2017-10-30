package com.example.john.athletes;

/**
 * Created by John on 30/10/2017.
 */

public class Boxer extends Athlete {

    private int hitsGiven;
    private int hitsTaken;

    public Boxer(int hitsGiven, int hitsTaken) {
        this.hitsGiven = hitsGiven;
        this.hitsTaken = hitsTaken;
    }

    public int getHitsGiven() {
        return hitsGiven;
    }

    public int getHitsTaken() {
        return hitsTaken;
    }

    public void calculatePoints() {
        int points =  hitsGiven - hitsTaken;
        super.setPoints(points);
    }

    public String prepare() {
        return "The boxer warms up by punching the punchbag.";
    }

    public String compete() {
        return "The boxer enters the ring for a 3 round bout.";
    }

}
