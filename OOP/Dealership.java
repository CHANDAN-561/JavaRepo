package OOP;

import java.util.Arrays;

public class Dealership {

    private Car[] cars;

    //Deep copy: Where we create new objects to store the values of the other objects (Mainly in case of a copy constructor) to counter the "reference trap".
    public Dealership (Car[] cars) {
        this.cars = new Car [cars.length];
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car (cars[i]);
        }
    }

    public void sell (int index) {
        this.cars[index].buyCar();
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + (i + 1) + "\n";
            String carDescription = this.cars[i].toString();
            temp += carDescription + "\n";
        }
        return temp;
    }
}
