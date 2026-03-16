package OOP.Section04;

import java.util.Objects;

public class City {

    private String name;
    private long population;

    public City(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public City(City source) {
        this.name = source.name;
        this.population = source.population;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    // improved equals() method which doesn't just check for the same ref but it's
    // class and field values
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof City)) {
            return false;
        }

        City city = (City) o; // now 'city' and 'o' shares the same ref
        return Objects.equals(name, city.name) && Objects.equals(population, city.population); // returns 1 cuz the ref
                                                                                               // of
                                                                                               // the 'city'
        // ...obj and the called obj 'o' is same.
    }

    public int hashCode() {
        return Objects.hash(name, population);
    }

}