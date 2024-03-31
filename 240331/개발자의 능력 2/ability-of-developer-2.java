import java.util.*;
import java.io.*;

public class Main {
    public static int[] developers = new int[6];
    public static boolean[] picked = new boolean[6];
    public static int sum, answer = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < developers.length; i++) {
            developers[i] = sc.nextInt();
        }
        sum = Arrays.stream(developers).sum();

        for (int i = 0; i < developers.length; i++) {
            picked[i] = true;
            for (int j = i+1; j < developers.length; j++) {
                picked[j] = true;
                for (int k = 0; k < developers.length; k++) {
                    for (int l = k+1; l < developers.length; l++) {
                        if (picked[k] || picked[l]) {
                            continue;
                        }
                        int team1 = developers[i] + developers[j];
                        int team2 = developers[k] + developers[l];
                        int team3 = sum - team1 - team2;
                        int max = getMax(team1, team2, team3);
                        int min = getMin(team1, team2, team3);
                        answer = Math.min(answer, Math.abs(max - min));
                    }
                }
                picked[j] = false;
            }
            picked[i] = false;
        }

        System.out.println(answer);
    }
    public static int getMax(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        return Math.max(max, num3);
    }

    public static int getMin(int num1, int num2, int num3) {
        int min = Math.min(num1, num2);
        return Math.min(min, num3);
    }
}