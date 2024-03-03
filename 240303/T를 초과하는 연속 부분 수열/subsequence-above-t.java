import java.io.*;
import java.util.*;

public class Main {
    public static int N, T;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        T = sc.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCount = 0, count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > T) {
                count += 1;
            } else {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount);
    }
}