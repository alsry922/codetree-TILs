import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[] x;
    public static int[] y;
    public static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        x = new int[N];
        y = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int minX = Integer.MAX_VALUE, maxX = 1;
            int minY = Integer.MAX_VALUE, maxY = 1;
            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                minX = Math.min(minX, x[j]);
                maxX = Math.max(maxX, x[j]);
                minY = Math.min(minY, y[j]);
                maxY = Math.max(maxY, y[j]);
            }
            int area = (maxX - minX) * (maxY - minY);
            answer = Math.min(answer, area);
        }
        System.out.println(answer);
    }
}