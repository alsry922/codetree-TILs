import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[][] grid;
    public static int[] dx = new int[] { 0, 1, 0, -1};
    public static int[] dy = new int[] {-1, 0, 1,  0};
    public static int DIR_NUM = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new int[N][N];
        grid[N-1][N-1] = N*N;
        int cr = N-1, cc = N-1;
        for (int i = N*N-1; i >= 1; i--) {
            while (true) {
                int nr = cr + dx[DIR_NUM];
                int nc = cc + dy[DIR_NUM];
                if (canWrite(nr, nc)) {
                    grid[nr][nc] = i;
                    cr = nr;
                    cc = nc;
                    break;
                } else {
                    DIR_NUM = (DIR_NUM + 1) % 4;
                }
            }
        }

        for (int row = 0; row < N; row++) {
            System.out.println(Arrays.toString(grid[row]).replaceAll("[\\[\\],]", ""));
        }
    }

    public static boolean canWrite(int r, int c) {
        return isInRange(r, c) && grid[r][c] == 0;
    }

    public static boolean isInRange(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < N;
    }
}