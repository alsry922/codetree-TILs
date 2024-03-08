import java.io.*;
import java.util.*;

public class Main {
    public static final int MAX = 1000000;
    public static int[] A = new int[MAX+1];
    public static int[] B = new int[MAX+1];
    
    public static int N, M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        int timeA = 1;
        for (int i = 0; i < N; i++) {
            int dis = sc.nextInt();
            String dir = sc.next();
            for (int j = 0; j < dis; j++) {
                if (dir.equals("L")) {
                    A[timeA] = A[timeA - 1] - 1;
                } else {
                    A[timeA] = A[timeA - 1] + 1;
                }
                timeA++;
            }
        }

        Arrays.fill(A, timeA - 1, A.length, A[timeA - 1]);

        int timeB = 1;
        for (int i = 0; i < M; i++) {
            int dis = sc.nextInt();
            String dir = sc.next();
            for (int j = 0; j < dis; j++) {
                if (dir.equals("L")) {
                    B[timeB] = B[timeB - 1] - 1;
                } else {
                    B[timeB] = B[timeB - 1] + 1;
                }
                timeB++;
            }
        }

        Arrays.fill(B, timeB - 1, B.length, B[timeB - 1]);

        int answer = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == B[i]) {
                if (A[i-1] != B[i-1])
                    answer++;
            }
        }

        System.out.println(answer);
    }
}