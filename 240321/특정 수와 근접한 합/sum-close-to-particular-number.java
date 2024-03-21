import java.io.*;
import java.util.*;

public class Main {
    public static int S, N;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.nextInt();
        N = sc.nextInt();
        sc.nextLine();
        arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        for (int i = 0; i < S-1; i++) {
            for (int j = i+1; j < S; j++) {
                int sum = 0;
                for (int k = 0; k < S; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    sum += arr[k];
                }
                if (Math.abs(answer - N) > Math.abs(sum - N)) {
                    answer = sum;
                }
            }
        }
        System.out.println(Math.abs(answer - N));
    }
}