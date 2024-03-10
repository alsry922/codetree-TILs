import java.io.*;
import java.util.*;

public class Main {
    public static int N, M;
    public static int[] A = new int[1000001];
    public static int[] B = new int[1000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        int posA = 0;
        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                posA++;
                A[posA] = A[posA-1] + v;
            }
        }

        int posB = 0;
        for (int i = 0; i < M; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                posB++;
                B[posB] = B[posB-1] + v;
            }
        }

        int lead = 0, count = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == 0) 
                continue;

            if (A[i] > B[i]) {
                if (lead != 1) {
                    lead = 1;
                    count++;
                }
            } else if (A[i] < B[i]) {
                if (lead != 2) {
                    lead = 2;
                    count++;
                }
            } else {
                if (lead != 3) {
                    lead = 3;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}