package com.vesska;


import java.util.HashSet;


public class Set {
    public static HashSet<String> Continents = new HashSet<>();

    public static void addContinents() {
        Continents.add("Eurasia");
        Continents.add("North America");
        Continents.add("Africa");
        Continents.add("South America");
        Continents.add("Australia");
        Continents.add("Antarctica");



    }
    public static void printContinents() {
        for (int i = 0; i < Continents.size(); i ++) {
            System.out.println("Continent number " + (i + 1) + " is " + Continents.toArray()[i]);

        }
    }



}
