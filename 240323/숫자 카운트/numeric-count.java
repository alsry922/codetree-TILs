import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[] numbers;
    public static int[] countA;
    public static int[] countB;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        numbers = new int[N];
        countA = new int[N];
        countB = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
            countA[i] = sc.nextInt();
            countB[i] = sc.nextInt();
        }

        int answer = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (i == j || j == k || i == k)
                        continue;
                    boolean success = true;
                    for (int l = 0; l < N; l++) {
                        int a = numbers[l] / 100;
                        int b = numbers[l] / 10 % 10;
                        int c = numbers[l] % 10;
                        int cnt1 = 0, cnt2 = 0;
                        if (a == i) {
                            cnt1++;
                        }
                        if (b == j) {
                            cnt1++;
                        }
                        if (c == k) {
                            cnt1++;
                        }
                        if (a == j || a == k) {
                            cnt2++;
                        }
                        if (b == i || b == k) {
                            cnt2++;
                        }
                        if (c == i || c == j) {
                            cnt2++;
                        }

                        if(cnt1 != countA[l] || cnt2 != countB[l]) {
                            success = false;
                            break;
                        }
                    }
                    if (success) {
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}