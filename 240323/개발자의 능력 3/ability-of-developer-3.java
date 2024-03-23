import java.io.*;
import java.util.*;

public class Main {
    public static int[] developers = new int[6];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            developers[i] = sc.nextInt();
        }
        int sum = Arrays.stream(developers).sum();
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = i+1; j < 6; j++) {
                for (int k = j+1; k < 6; k++) {
                    int teamSum1 = developers[i] + developers[j] + developers[k];
                    int teamSum2 = sum - teamSum1;
                    minDiff = Math.min(minDiff, Math.abs(teamSum1 - teamSum2));
                }
            }
        }

        System.out.println(minDiff);
    }
}