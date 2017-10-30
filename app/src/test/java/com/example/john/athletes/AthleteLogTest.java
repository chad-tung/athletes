package com.example.john.athletes;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static android.R.attr.src;

/**
 * Created by John on 30/10/2017.
 */

public class AthleteLogTest {
    AthleteLog gymnastLog;
    Gymnast gymnast;

    @Before
    public void before() {
        gymnast = new Gymnast(10, 8);
        gymnast.newRun(15.5);
        gymnastLog = new AthleteLog("/Users/user/Desktop/CodeClanWork/week_7/day_1/Athletes/app/src/main/java/com/example/john/athletes/gymnastLog");
    }

    @Test
    public void testNewFile() throws IOException {
        String textLog = gymnast.newRun(15.5);
        gymnastLog.writeToFile(textLog);
    }
}
