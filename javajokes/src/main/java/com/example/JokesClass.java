package com.example;

import java.util.Random;

public class JokesClass {
    public String joker(){
        String[] jokes = new String[3];
        Random random = new Random();
        jokes[0] = "An Android activity walks into a bar. When he orders a drink, " +
                "the bartender tells him the keg is having problems. He says, Problems? I have a Bundle.";
        jokes[1] = "An Android app walks into a bar. Bartender asks," +
                " \"Can I get you a drink?\" The app looks disappointed and says, \"That wasn't my intent.\"";
        jokes[2] = "A fragment walks into a bar and says, \"I'm lost. Can I please speak to the FragmentManager?\"";
        return jokes[random.nextInt(jokes.length)];
    }
}
