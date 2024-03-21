import java.io.*;
import java.util.*;

public class Main {
    public static int N, M;
    public static int[] A, B;
    public static boolean[] picked;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N];
        B = new int[M];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        int answer = 0;
        for (int i = 0; i <= N - M; i++) {
            int count = 0;
            picked = new boolean[M];
            for (int j = i; j < i + M; j++) {
                for (int k = 0; k < M; k++) {
                    if (picked[k]) 
                        continue;
                    if (A[j] == B[k]) {
                        count++;
                        picked[k] = true;
                        break;
                    }
                }
            }
            if (count == M) 
                answer++;
        }
        System.out.println(answer);
    }
}