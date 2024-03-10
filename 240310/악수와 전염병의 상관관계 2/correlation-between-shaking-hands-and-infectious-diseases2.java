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
        P = sc.nextInt();
        T = sc.nextInt();
        developers = new int[N + 1];
        infectCounts = new int[N + 1];
        developers[P] = 1;

        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            x[t] = sc.nextInt();
            y[t] = sc.nextInt();
        }

        for (int i = 1; i < x.length; i++) {
            int x1 = x[i];
            int y1 = y[i];
            // 둘 중 한 명은 감염되어 있어야 한다.
            if (developers[x1] == 0 && developers[y1] == 0)
                continue;
            // 둘 다 전염 가능 횟수를 넘길 수 없다.
            if (infectCounts[x1] >= 2 && infectCounts[y1] >= 2)
                continue;

            // 둘 다 감염된 상태인 경우
            if (developers[x1] == 1 && developers[y1] == 1) {
                if (infectCounts[x1] < 2) {
                    infectCounts[x1]++;
                } else if (infectCounts[y1] < 2) {
                    infectCounts[y1]++;
                }
            }

            // 둘 중 한 명이 감염된 상태인 경우
            if (developers[x1] == 1 && infectCounts[x1] < 2) {
                infectCounts[x1]++;
                developers[y1] = 1;
            } else if (developers[y1] == 1 && infectCounts[y1] < 2) {
                infectCounts[y1]++;
                developers[x1] = 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < developers.length; i++) {
            sb.append(developers[i]);
        }
        System.out.println(sb);
    }
}