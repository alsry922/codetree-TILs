import java.io.*;
import java.util.*;

public class Main {
    public static int N, K;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        sc.nextLine();
        arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        for (int i = 0; i <= N-K; i++) {
            int sum = 0;
            for (int j = i; j < i+K; j++) {
                sum += arr[j];
            }
            answer = Math.max(answer, sum);
        }
        System.out.println(answer);
    }
}