import java.util.*;
import java.io.*;

public class Main {
    public static int[] developers = new int[5];
    public static int minDiff = Integer.MAX_VALUE;
    public static int sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < developers.length; i++) {
            developers[i] = sc.nextInt();
        }
        sum = Arrays.stream(developers).sum();

        for (int i = 0; i < developers.length; i++) {
            for (int j = i+1; j < developers.length; j++) {
                for (int k = 0; k < developers.length; k++) {
                    for (int l = k+1; l < developers.length; l++) {
                        if (k == i || k == j || l == i || l == j) {
                            continue;
                        }
                        int team1 = developers[i] + developers[j];
                        int team2 = developers[k] + developers[l];
                        int team3 = sum - team1 - team2;
                        if (team1 == team2 || team2 == team3 || team1 == team3) {
                            continue;
                        }
                        minDiff = Math.min(minDiff, getMinDiff(team1, team2, team3));
                    }
                }
            }
        }
        if (minDiff == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minDiff);
        }
    }

    public static int getMinDiff(int num1, int num2, int num3) {
        int result = Math.abs(num1 - num2);
        result = Math.max(result, Math.abs(num2 - num3));
        result = Math.max(result, Math.abs(num1 - num3));
        return result;
    }
}