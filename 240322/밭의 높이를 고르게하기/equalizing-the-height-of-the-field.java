import java.io.*;
import java.util.*;

public class Main {
    public static int N, H, T; // 발, 높이, 최소 연속 횟수
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        H = sc.nextInt();
        T = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i <= N-T; i++) {
            int sumCost = 0;
            for (int j = i; j < i+T; j++) {
                sumCost += Math.abs(H - arr[j]);
            }
            minCost = Math.min(minCost, sumCost);
        }
        System.out.println(minCost);
    }
}