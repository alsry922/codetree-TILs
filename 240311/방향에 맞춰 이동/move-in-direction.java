import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int x = 0, y = 0;

        int[] dx = new int[] {1, -1, 0, 0};
        int[] dy = new int[] {0, 0, -1, 1};
        for (int i = 0; i < N; i++) {
            String dir = sc.next();
            int dis = sc.nextInt();
            int index = -1;
            if (dir.equals("E")) {
                index = 0;
            } else if (dir.equals("W")) {
                index = 1;
            } else if (dir.equals("S")) {
                index  = 2;
            } else {
                index = 3;
            }
            x += dx[index] * dis;
            y += dy[index] * dis;
        }

        System.out.println(String.format("%d %d", x, y));
    }
}