import java.io.*;
import java.util.*;

public class Main {
    public static int[] students;
    public static int N, M, K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        students = new int[N+1];

        int answer = -1;
        for (int i = 0; i < M; i++) {
            int target = sc.nextInt();
            students[target]++;
            if (students[target] >= K) {
                answer = target;
                break;
            }
        }
        System.out.println(answer);

    }
}