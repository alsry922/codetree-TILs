import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[] xCheck;
    public static int[] yCheck;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        xCheck = new int[N];
        yCheck = new int[N];
        for (int i = 0; i < N; i++) {
            xCheck[i] = sc.nextInt();
            yCheck[i] = sc.nextInt();
        }

        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i < N-1; i++) {
            int skip = i;
            int distance = 0;
            for (int j = 1; j < N; j++) {
                if (j == skip)
                    continue;
                if (j - 1 == i)
                    distance +=  Math.abs(xCheck[j] - xCheck[j-2]) + Math.abs(yCheck[j] - yCheck[j-2]);
                else
                    distance += Math.abs(xCheck[j] - xCheck[j-1]) + Math.abs(yCheck[j] - yCheck[j-1]);            
            }
            minDistance = Math.min(minDistance, distance);
        }

        System.out.println(minDistance);
    }
}