package OOP.ClassObj.Section04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class arrayList {
    public static void main() {
        Scanner scan = new Scanner(System.in);

        List<Integer> numberlist = new ArrayList<>();
        // we can create lists using only the "List" keyword it just creates a list
        // without any class type checkings. It is not recomended since it can bypass
        // the Java's error detection feature because it can hold any kind of objects.

        // eg: List values = new ArrayList<>();
        @SuppressWarnings("unused")
        List<Integer> numbers = new ArrayList<>();
        // It is a good practice to mention the class of the objects you are holding
        // inside
        // the list beforehand, Because then the Java compiler will only let the
        // specific type of objects to be stored inside the list.

        numberlist.add(2); // here the list created a 10 element long dynamic array
        numberlist.add(4);
        numberlist.add(12);
        numberlist.add(23);
        numberlist.add(63);
        numberlist.add(23);
        numberlist.add(7);
        numberlist.add(1);
        numberlist.add(90);
        numberlist.add(60);
        // 11th number
        numberlist.add(31); // here the list incresed its size from 10 to 15
        numberlist.add(63);
        numberlist.add(33);
        numberlist.add(7);
        numberlist.add(1);
        // 16th number
        numberlist.add(223); // here it increased again to 20 elements

        List<String> names = new ArrayList<>();

        names.add("Harry");
        names.add("Tony");
        System.out.println(names.getFirst());

        System.out.print(numberlist.size());

        numberlist.remove(1);
        numberlist.remove(0);

        scan.close();
    }
}
