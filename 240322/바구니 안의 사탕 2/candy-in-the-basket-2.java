import java.io.*;
import java.util.*;

public class Main {
    public static int N, K;
    public static int[] candy = new int[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int count = sc.nextInt();
            int index = sc.nextInt();
            candy[index] = count;
        }
        int max = 0;
        for (int i = 0; i <= 101; i++) {
            int sum = 0;
            for (int j = i-K; j <= i+K; j++) {
                if (j < 0 || j > 100)
                    break;
                sum += candy[j];
            }
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}