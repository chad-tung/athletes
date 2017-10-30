package com.example.john.athletes;

/**
 * Created by John on 30/10/2017.
 */

public class Gymnast extends Athlete {

    private int difficultyPoints;
    private int executionPoints;

    public Gymnast(int difficultyPoints, int executionPoints) {
        this.difficultyPoints = difficultyPoints;
        this.executionPoints = executionPoints;
    }

    public int getDifficultyPoints() {
        return difficultyPoints;
    }

    public int getExecutionPoints() {
        return executionPoints;
    }

    public void calculatePoints() {
        int points = difficultyPoints +executionPoints;
        super.setPoints(points);
    }

    public String prepare() {
        return "The gymnast warms up by stretching their muscles.";
    }

    public String compete() {
        return "The gymnast performs their routine and awaits scores from the judges.";
    }
}
