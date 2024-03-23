import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int a, b, c;
    public static int a2, b2, c2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        c2 = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if ((Math.abs(a - i) <= 2 || Math.abs(a - i) >= N-2)
                        && (Math.abs(b - j) <= 2 || Math.abs(b - j) >=  N-2)
                        && (Math.abs(c - k) <= 2 || Math.abs(c - k) >= N-2)) {
                        count++;
                    } else if ((Math.abs(a2 - i) <= 2 || Math.abs(a2 - i) >= N-2)
                            && (Math.abs(b2 - j) <= 2 || Math.abs(b2 - j) >= N-2)
                            && (Math.abs(c2 - k) <= 2 || Math.abs(c2 - k) >= N-2)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}