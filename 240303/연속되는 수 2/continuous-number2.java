import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCount = 0, count = 1;
        for (int i = 0; i < N; i++) {
            if (i == 0 || arr[i] == arr[i-1]) {
                // count++;
                maxCount = Math.max(maxCount, count++);
            } else {
                count = 1;
            }
        }

        System.out.println(maxCount);
    }
}