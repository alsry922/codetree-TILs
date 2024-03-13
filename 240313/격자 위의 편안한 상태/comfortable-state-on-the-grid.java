import java.io.*;
import java.util.*;

public class Main {
    public static int N, M;
    public static int[][] grid;
    public static int[] dx = new int[] {0, -1, 1,  0};
    public static int[] dy = new int[] {1,  0, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        grid = new int[N+1][N+1];
        while (M-- > 0) {
            int[] pair = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int row = pair[0], col = pair[1];
            int count = 0;
            grid[row][col] = 1;
            for (int i = 0; i < dx.length; i++) {
                int nr = row + dx[i];
                int nc = col + dy[i];
                if (isInRange(nr, nc) && grid[nr][nc] == 1) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static boolean isInRange(int r, int c) {
        return 1 <= r && r <= N && 1 <= c && c <= N; 
    }
}