package OOP.ClassObj.Section04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        City paris = new City("Paris", 2161000);
        City paris2 = new City(paris);

        System.out.println(paris.equals(paris2)); // true
        // paris2.setPopulation(2059003);
        // paris.setPopulation(3129003);

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Paris", 2161000));
        cities.add(new City("Florence", 382258));
        cities.add(new City("Venice", 261905));
        cities.add(new City("Versailles", 85771));
        cities.add(new City("London", 8982000));

        System.out.println(cities.contains(paris));
    }
}