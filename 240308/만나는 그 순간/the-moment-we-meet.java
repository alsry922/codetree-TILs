import java.io.*;
import java.util.*;

public class Main {
    public static int[] A = new int[1000001];
    public static int[] B = new int[1000001];
    public static int LAST_POS_A = 0, LAST_POS_B = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moveCountForA = sc.nextInt();
        int moveCountForB = sc.nextInt();
        for (int i = 0; i < moveCountForA; i++) {
            String dir = sc.next();
            int dis = sc.nextInt();
            for (int j = 0; j < dis; j++) {
                if (dir.equals("R")) {
                    A[LAST_POS_A + 1] = A[LAST_POS_A] + 1;
                } else {
                    A[LAST_POS_A + 1] = A[LAST_POS_A] - 1;
                }
                LAST_POS_A += 1;
            }

        }
        for (int i = 0; i < moveCountForB; i++) {
            String dir = sc.next();
            int dis = sc.nextInt();
            for (int j = 0; j < dis; j++) {
            if (dir.equals("R")) {
                B[LAST_POS_B + 1] = B[LAST_POS_B] + 1;
            } else {
                B[LAST_POS_B + 1] = B[LAST_POS_B] - 1;
            }
            LAST_POS_B += 1;
            }
        }
        
        for (int i = 1; i < 1000001; i++) {
            if (A[i] == B[i]) {
                if (A[i] != 0 && B[i] != 0) {
                    System.out.println(i);
                    break;
                } else {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}