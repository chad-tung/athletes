package com.example.john.athletes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 30/10/2017.
 */

public class AthleteTest {
    Gymnast gymnast;
    Boxer boxer;
    Boxer boxer2;
    Gymnast gymnast2;

    @Before
    public void before() {
        gymnast = new Gymnast(8, 7);
        boxer = new Boxer(26, 13);
        boxer2 = new Boxer(13, 13);
        gymnast2 = new Gymnast(5, 4);
        gymnast.newRun(15.5);
    }

    @Test
    public void testAwardGold() {
        gymnast.calculatePoints();
        assertEquals("Gold medal", gymnast.awardMedal());
    }

    @Test
    public void testAwardSilver() {
        boxer.calculatePoints();
        assertEquals("Silver medal", boxer.awardMedal());
    }

    @Test
    public void testAwardBronze() {
        gymnast2.calculatePoints();
        assertEquals("Bronze medal", gymnast2.awardMedal());
    }

    @Test
    public void testNoAward() {
        boxer2.calculatePoints();
        assertEquals("Try harder", boxer2.awardMedal());
    }

    @Test
    public void canGetDistances() {
        assertEquals(15.5, gymnast.getPreviousRun(), 0.1);
        assertEquals(15.5, gymnast.getTotalDistance(), 0.1);
    }

    @Test
    public void canRegisterRuns() {
        gymnast.newRun(14.5);
        assertEquals(14.5, gymnast.getPreviousRun(), 0.1);
        assertEquals(30.0, gymnast.getTotalDistance(), 0.1);
    }

    @Test
    public void canGetLog() {
        assertEquals("You've just ran 14.5km.  Your total distance covered is 30.0km.", gymnast.newRun(14.5));
    }
}
