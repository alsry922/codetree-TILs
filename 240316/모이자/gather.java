import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[] house;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        house = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < house.length; i++) {
            int sumDistance = 0;
            for (int j = 0; j < house.length; j++) {
                sumDistance += house[j] * Math.abs(i-j);
            }
            minDistance = Math.min(minDistance, sumDistance);
        }

        System.out.println(minDistance);
    }
}