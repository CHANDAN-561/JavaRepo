package Strings;

import java.util.Scanner;
public class shortestPathInSpace {

    public static void findShortestPath (String path, int x1, int y1) {
        int x2 = 0, y2 = 0;
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'E' :
                    x2++;
                    break;
                case 'W' :
                    x2--;
                    break;
                case 'N' :
                    y2++;
                    break;
                case 'S':
                    y2--;
                    break;
                default:
                    System.out.println("Invalid path value");
            }
        }
//        System.out.println("Destination coordinate is (" + x2 + "," + y2 + ")");
        int valuex2x1 = x2 - x1, valuey2y1 = y2 - y1;
        double shortestPathLength = Math.sqrt((valuex2x1 * valuex2x1) + (valuey2y1 * valuey2y1));
        System.out.print("Shortest path to (" + x2 + "," + y2 + ") is: " + shortestPathLength);
    }

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("'E' for East" + System.lineSeparator() + "'W' for West" +  System.lineSeparator() + "'N' for North" + System.lineSeparator() + "'S' for South" + System.lineSeparator() + "The path should look like this: NWEENSSENW");
        System.out.print("Enter the path (shouldn't contain any white spaces): ");
        String path = input.nextLine();

        System.out.print("Enter origin (x): ");
        int x1 = input.nextInt();
        System.out.print("Enter origin (y): ");
        int y1 = input.nextInt();
        findShortestPath (path, x1, y1);

        input.close();
    }
}
