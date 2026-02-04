package OOP.Section04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedListVSArrayList {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        long timer = System.currentTimeMillis();
        for(int i = 0; i < 11_000_000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        System.out.println("Loop timer: " + (System.currentTimeMillis() - timer) + "ms");

        /******************FETCHING DATA******************/

        System.out.println("\nFETCHING DATA\n");

        long start = System.currentTimeMillis();
        linkedList.get(82_00_000);
        System.out.println("For Linked list fetch: " + (System.currentTimeMillis() - start) + "ms");

        //Here ArrayList would be better option because It's always faster. Linked list have to travel to the nth poisition in the list to retrive the value , and it takes time while Array list stores the values index wise so it just have to go to the nth index and then get the value.

        start = System.currentTimeMillis();
        arrayList.get(82_00_000);
        System.out.println("For Array list fetch: " + (System.currentTimeMillis() - start) + "ms");

        /******************FIRST / LAST INDEX******************/

         System.out.println("\nFIRST / LAST INDEX\n");

         start = System.currentTimeMillis();
         linkedList.get(0);
         linkedList.get(linkedList.size() - 1);
         System.out.println("For Linked list fetch: " + (System.currentTimeMillis() - start) + "ms");

         //Here both of them performs the same because linked list can just get the value at the  start or at the end of the list without traversing, and Array list uses indexes so it can just go to that index that's why they are both very fast.

         start = System.currentTimeMillis();
         arrayList.get(0);
         arrayList.get(arrayList.size() - 1);
         System.out.println("For Array list fetch: " + (System.currentTimeMillis() - start) + "ms");


        /******************INSERTION FROM MIDDLE******************/

         System.out.println("\nINSERTION FROM MIDDLE\n");

         start = System.currentTimeMillis();
         linkedList.add(5,134);
         System.out.println("For Linked list insertion: " + (System.currentTimeMillis() - start) + "ms");

         //The further the linked list have to travel to find the desired node can take time but not as much as array list because, Linked list goes to the position and then adds an element and updates the pointers but array list shifts all the values positioned right to the index and then adds a value to that index, which takes way more time than linked list.

         start = System.currentTimeMillis();
         arrayList.add(5, 134);
         System.out.println("For Array list insertion: " + (System.currentTimeMillis() - start) + "ms");


        /******************INSERTION******************/

         System.out.println("\nINSERTION\n");

         start = System.currentTimeMillis();
         linkedList.add(121);
         System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

         //Here both of them takes the same amount of time because, both of em can just simply add a value at the end of the list.

         start = System.currentTimeMillis();
         arrayList.add(121);
         System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

        /******************REMOVAL******************/

         System.out.println("\nREMOVAL\n");

         start = System.currentTimeMillis();
         linkedList.remove(400);
         System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

         //Just like insertion from middle, Linked list takes time to remove the value, but it is way faster than array list, because array list arranges the values after any of it got removed from the list which takes time.

         start = System.currentTimeMillis();
         arrayList.remove(400);
         System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************UPDATES******************/

         System.out.println("\nUPDATES\n");

         start = System.currentTimeMillis();
         linkedList.set(4_500_000, 5);
         System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

         //Linked list here takes more time, because it needs time to reach the exact position but array list uses indexes which makes it faster to reach the position and just update it.

         start = System.currentTimeMillis();
         arrayList.set(4_500_000, 5);
         System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

    }

}
