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
        
        int maxCount = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) count += 1;
            else if ((arr[i] ^ arr[i-1]) >= 0) {
                count += 1;
            }
            else count = 1;
            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount);
    }
}