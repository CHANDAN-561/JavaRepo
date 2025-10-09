import java.util.Scanner;

class trappedRainWater {

    public static void getValues(int towers[], Scanner sc) {
        for (int i = 0; i < towers.length; i++) {
            System.out.print("[" + i + "]: ");
            towers[i] = sc.nextInt();
        }
    }

    public static int getTrappedWater(int towers[], int width) {
        int n = towers.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // calculate left max
        leftMax[0] = towers[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(towers[i], leftMax[i - 1]);

        }

        // calculate right max
        rightMax[n - 1] = towers[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(towers[i], rightMax[i + 1]);
        }

        int waterLevel, trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // calculate water level using min (left max , right max)
            waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = water level - tower height * tower width
            trappedWater += (waterLevel - towers[i]) * width;
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers of Towers: ");
        int size = input.nextInt();
        System.out.print("Enter the width of all towers: ");
        int towerWidth = input.nextInt();
        int[] towers = new int[size];
        getValues(towers, input);
        System.out.println("Amount of trapped rain water is: " + getTrappedWater(towers, towerWidth) + " units.");

        input.close();
    }
}