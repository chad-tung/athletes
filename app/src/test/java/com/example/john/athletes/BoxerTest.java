package com.example.john.athletes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 30/10/2017.
 */

public class BoxerTest {
    Boxer boxer;

    @Before
    public void before() {
        boxer = new Boxer(26, 13);
    }

    @Test
    public void testCalculatePoints() {
        boxer.calculatePoints();
        assertEquals(13, boxer.getPoints());
    }

    @Test
    public void canPrepare() throws Exception {
        assertEquals("The boxer warms up by punching the punchbag.", boxer.prepare());
    }

    @Test
    public void canCompete() throws Exception {
        assertEquals("The boxer enters the ring for a 3 round bout.", boxer.compete());
    }
}
