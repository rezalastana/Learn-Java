package tech.oop.dasar.app;

import tech.oop.dasar.data.City;

public class LocationApp {
    public static void main(String[] args) {
//        Location location = new Location()  ini akan error karena location berupa abstarc class
        City city = new City();
        city.name = "Jakarta"; //jangan lupa buat anme pada city public

        System.out.println(city.name);


    }
}
