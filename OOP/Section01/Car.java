package OOP.Section01;

import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf (parts, parts.length);
    }

    //copy constructor

    public Car (Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf (source.parts, source.parts.length);
    }

    // setter methodes

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYaer(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts (String[] parts) {
        this.parts = Arrays.copyOf (parts, parts.length);
    }

    // getter methodes

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String[] getParts() {
        return Arrays.copyOf (parts, parts.length);
    }


    public void buyCar () {
        System.out.println("Excellent choice!!. The " + this.getYear() + " " + this.getColor() + " " + this.getMake() + " is a great pick for " + this.getPrice() + " $");
    }

    /*The below method exists in the "Object.java" file by default, And when we try to print the
     * hashcode of an object the JVM makes a call to the very method and whatever the methode returns it
     * will be get printed in the console.
     *
     * The default state of the method is:
     *
     * public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
       }
     *
     * since there is another "toString()" methode exists in the "Car" class,
     * JVM will call this method instead
     * So whatever the method returns will get printed on the console...
     */

    public String toString () {
        return "Make: " + this.make + ".\n"
                +  "Price: " + (int) this.price + " $.\n"
                +  "Year: " + this.year + ".\n"
                +  "Color: " + this.color + ".\n"
                +  "Parts: " + Arrays.toString(parts) + ".\n";
    }
}
