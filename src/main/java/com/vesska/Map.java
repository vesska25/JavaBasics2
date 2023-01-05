package com.vesska;

import java.util.HashMap;

public class Map {

    public static HashMap<String, String> Cities = new HashMap<String, String>();

    public static void addCities(){
        Cities.put("Cologne", "Germany");
        Cities.put("Frankfurt", "Germany");
        Cities.put("Moscow", "Russia");
        Cities.put("Tallinn", "Estonia");

    }

    public static void whereIsTheCity(){
        for (String city: Cities.keySet()) {
            System.out.println(city + " is in " + Cities.get(city));

        }
    }
}
