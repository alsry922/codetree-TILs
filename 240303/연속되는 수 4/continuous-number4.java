import java.util.*;
import java.io.*;

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
        int maxCount = 0, count = 0;
        for (int i = 0; i < N; i++) {
            int lastNum = arr[i];
            count = 0;
            for (int j = i; j < N; j++) {
                if (i == j) {
                    count += 1;
                } else if (lastNum < arr[j]) {
                    count += 1;
                    lastNum = arr[j];
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        System.out.println(maxCount);
    }
}