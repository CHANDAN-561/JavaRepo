package OOP.Section01;

public class constructor {
    public static void main (String[] args) {
        String[] parts = new String[] {"Tyres", "Headlights", "Bumper guard"};
        Car nissan = new Car ("Nissan", 10000L, 2016, "Red", parts);
        Car audi = new Car ("Audi", 12_000L, 2020, "White",  parts);

        //the dealerships are giving a 40% discount on sale
        nissan.setPrice (0.6 * nissan.getPrice());
        audi.setPrice (0.6 * audi.getPrice());

        //the dealerships are also giving us color options
        nissan.setColor ("Black");
        audi.setColor ("Purple");

        //the audi spare parts stock have changed
        String[] updatedParts = new String[] {"OilFilters", "Taillights", "TimingChains", "CatalyticConverter"};
        audi.setParts (updatedParts);


        //System.out.println(System.lineSeparator() + "This is a " + nissan.getMake() + " car. " + "It's a " + nissan.getYear() + " model, " + nissan.getColor() + " color. It costs around " + (int) nissan.getPrice() + " $" + System.lineSeparator() + "Available spare parts are: " + Arrays.toString (nissan.getParts()));

        //System.out.println(System.lineSeparator() + "This is an " + audi.getMake() + " car. " + "It's a " + audi.getYear() + " model, " + audi.getColor() + " color. It costs around " + (int) audi.getPrice() + " $" + System.lineSeparator() + "Available spare parts are: " + Arrays.toString (audi.getParts()));

        //copy the car chacateristics
        Car nissan2 = new Car (nissan);

        //System.out.println(System.lineSeparator() + "(From copy constructor) \nThis is  " + nissan2.getMake() + " car. " + "It's a " + nissan2.getYear() + " model, " + nissan2.getColor() + " color. It costs around " + (int) nissan2.getPrice() + " $" + System.lineSeparator() + "Available spare parts are: " + Arrays.toString (nissan2.getParts()));

        //printing all the charactristics of each obj by calling the toString() methode
        System.out.println(nissan);
        System.out.println(audi);
        System.out.println("From copy constructor...\n" + nissan2);
    }
}
