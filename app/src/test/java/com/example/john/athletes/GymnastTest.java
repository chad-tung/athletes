package com.example.john.athletes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 30/10/2017.
 */

public class GymnastTest {

    Gymnast gymnast;

    @Before
    public void before() {
        gymnast = new Gymnast(8, 7);
    }

    @Test
    public void testCalculatePoints() {
        gymnast.calculatePoints();
        assertEquals(15, gymnast.getPoints());
    }

}
