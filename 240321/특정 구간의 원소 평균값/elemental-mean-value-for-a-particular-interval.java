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
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int sum = 0;
                int length = j - i + 1;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                for (int k = i; k <= j; k++) {
                    if (arr[k] == (double)(sum)/length) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}