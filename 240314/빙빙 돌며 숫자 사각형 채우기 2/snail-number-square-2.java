import java.io.*;
import java.util.*;

public class Main {
    public static int N, M;
    public static int[][] grid;
    public static int[] dx = new int[] {1, 0, -1,  0};
    public static int[] dy = new int[] {0, 1,  0, -1};
    public static int DIR_NUM = 0;
    public static int curRow, curCol;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        grid = new int[N][M];

        curRow = -1;
        curCol = 0;

        int num = 1;
        while (num <= N * M) {
            int nr = curRow + dx[DIR_NUM];
            int nc = curCol + dy[DIR_NUM];
            if (!canWrite(nr, nc)) {
                DIR_NUM = (DIR_NUM + 1) % 4;
                nr = curRow + dx[DIR_NUM];
                nc = curCol + dy[DIR_NUM];
            }
            grid[nr][nc] = num;
            curRow = nr;
            curCol = nc;
            num++;
        }

        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < M; col++) {
                sb.append(grid[row][col]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static boolean canWrite(int row, int col) {
        return isInRange(row, col) && grid[row][col] == 0;
    }

    public static boolean isInRange(int row, int col) {
        return 0 <= row && row < N && 0 <= col && col < M;
    }
}