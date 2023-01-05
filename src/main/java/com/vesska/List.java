package com.vesska;

import java.util.ArrayList;

public class List {

    public static ArrayList<String> Countries = new ArrayList<>();

    public static String[] EU = {"Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus", "Czech Republic", "Denmark", "Estonia",
            "Finland", "France", "Germany", "Greece", "Hungary", "Ireland", "Italy", "Latvia", "Lithuania", "Luxembourg",
            "Malta", "Netherlands", "Poland", "Portugal", "Romania", "Slovakia", "Slovenia", "Spain", "Sweden"};


    public static void addCountry() {
        Countries.add("Germany");
        Countries.add("Estonia");
        Countries.add("Russia");
        Countries.add("USA");

        System.out.println(Countries);
    }

    public static void isInEU() {


        for (String s : EU) {
            for (String i : Countries) {
                if (i == s) {
                    System.out.println(i + " is in the EU");
                }
            }
        }
    }
}