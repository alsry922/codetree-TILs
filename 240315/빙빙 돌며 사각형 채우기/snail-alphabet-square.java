import java.io.*;
import java.util.*;

public class Main {
    public static int N, M;
    public static int[][] grid;
    public static char[] alphabet = new char[26];
    public static int[] dx = new int[] {0, 1,  0, -1};
    public static int[] dy = new int[] {1, 0, -1,  0};
    public static int DIR_NUM = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        grid = new int[N][M];
        for (int[] ints : grid) {
            Arrays.fill(ints, -1);
        }
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)('A' + i);
        }

        grid[0][0] = 0;
        int curRow = 0, curCol = 0;
        for (int i = 1; i < N*M; i++) {
            while (true) {
                int nr = curRow + dx[DIR_NUM];
                int nc = curCol + dy[DIR_NUM];
                if (canWrite(nr, nc)) {
                    grid[nr][nc] = (grid[curRow][curCol] + 1) % alphabet.length;
                    curRow = nr;
                    curCol = nc;
                    break;
                } else {
                    DIR_NUM = (DIR_NUM + 1) % 4;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < M; col++) {
                sb.append(alphabet[grid[row][col]]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

        // for (int row = 0; row < N; row++) {
        //     System.out.println(Arrays.toString(grid[row]).replaceAll("[\\[\\],]", ""));
        // }
    }

    public static boolean canWrite(int r, int c) {
        return isInRange(r, c) && grid[r][c] == -1;
    }

    public static boolean isInRange(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < M;
    }
}