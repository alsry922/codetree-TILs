import java.io.*;
import java.util.*;

public class Main {
    public static int N; // 개발자
    public static int K; // 전염병을 옮기는 악수 횟수
    public static int T; // 악수 횟수
    public static int P; // 처음 전염병에 걸린 개발자 번호
    public static int[] developers, infectCounts;
    public static int[] x = new int[251], y = new int[251];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        T = sc.nextInt();
        P = sc.nextInt();
        developers = new int[N];
        infectCounts = new int[N];
        developers[P] = 1;

        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            x[t] = sc.nextInt();
            y[t] = sc.nextInt();
        }

        for (int i = 0; i < x.length; i++) {
            // 둘 중 한 명은 감염되어 있어야 한다.
            if (developers[x[i]] == 0 && developers[y[i]] == 0)
                continue;
            // 둘 다 전염 가능 횟수를 넘길 수 없다.
            if (infectCounts[x[i]] >= 2 && infectCounts[y[i]] >= 2)
                continue;
            // 둘 중 한 명이 감염된 상태이고, 전염 가능하므로
            developers[x[i]] = 1;
            developers[y[i]] = 1;
            infectCounts[x[i]]++;
            infectCounts[y[i]]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < developers.length; i++) {
            sb.append(developers[i]);
        }
        System.out.println(sb);
    }
}