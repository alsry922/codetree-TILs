import java.io.*;
import java.util.*;

public class Main {
    public static int N, K, LENGTH = 10000;
    public static int[] pictures = new int[10001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            int index = Integer.parseInt(input[0]);
            int picture = input[1].charAt(0);
            if (picture == 'G') {
                pictures[index] = 1;
            } else {
                pictures[index] = 2;
            }
        }
        int answer = 0;
        for (int i = 0; i <= LENGTH-K; i++) {
            int sum = 0;
            for (int j = i; j < i+K+1; j++) {
                sum += pictures[j];
            }
            answer = Math.max(answer, sum);
        }
        System.out.println(answer);
    }
}