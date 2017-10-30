package com.example.john.athletes;

/**
 * Created by John on 30/10/2017.
 */

public abstract class Athlete {
    private int points;
    private double totalDistance;
    private double previousRun;

    public Athlete() {
        this.points = 0;
        this.previousRun = 0;
        this.totalDistance = 0;
    }

    public int getPoints() {
        return this.points;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public double getPreviousRun() {
        return previousRun;
    }

    public void setPreviousRun(double previousRun) {
        this.previousRun = previousRun;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String awardMedal() {
        int points = this.getPoints();
        if (points >= 15) {
            return"Gold medal";
        }
        if (points >= 10) {
            return "Silver medal";
        }
        if (points >= 5) {
            return "Bronze medal";
        }
        return "Try harder";
    }

    public void updateTotalDistance() {
        this.totalDistance += this.previousRun;
    }

    public String newRun(double distance) {
        setPreviousRun(distance);
        updateTotalDistance();
        return "You've just ran " + getPreviousRun() + "km.  Your total distance covered is " + getTotalDistance() + "km.";
    }

}
