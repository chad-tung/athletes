package com.example.john.athletes;

import java.io.IOException;

/**
 * Created by John on 30/10/2017.
 */

public class Runner {

    public static void main(String[] args) throws IOException {
        AthleteLog gymnastLog;
        Gymnast gymnast;

        gymnast = new Gymnast(10, 8);

        gymnastLog = new AthleteLog("/Users/user/Desktop/CodeClanWork/week_7/day_1/Athletes/app/src/main/java/com/example/john/athletes/gymnastLog", true);

        gymnastLog.writeToFile(gymnast.newRun(40.0));
        gymnastLog.writeToFile(gymnast.newRun(35.5));
        gymnastLog.writeToFile(gymnast.newRun(18.5));

    }




}
