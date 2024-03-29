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

        int posA = 1;
        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                A[posA] = A[posA - 1] + v;
                posA++;
            }
        }

        int posB = 1;
        for (int i = 0; i < M; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                B[posB] = B[posB - 1] + v;
                posB++;
            }
        }

        int count = 0;
        String first = "";
        for (int i = 1; i < A.length; i++) {
            if (A[i] > B[i]) {
                if (first.equals("B")) {
                    count++;
                }
                first = "A";
            } else if (B[i] > A[i]){
                if (first.equals("A")) {
                    count++;
                }
                first = "B";
            }
        }
        System.out.println(count);
    }
}