import java.io.*;
import java.util.*;

public class Main {
    public static int N, T;
    public static int[][] grid;
    public static int[] dx = new int[] {0, 1, 0, -1};
    public static int[] dy = new int[] {1, 0, -1, 0};
    public static int DIR_NUM = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        T = sc.nextInt();
        grid = new int[N][N];
        String[] commands = sc.next().split("");
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                grid[row][col] = sc.nextInt();
            }
        }

        int curRow = N / 2, curCol = N / 2;
        int answer = grid[curRow][curCol] ;
        for (String command : commands) {
            if (command.equals("F")) {
                int nr = curRow + dx[DIR_NUM];
                int nc = curCol + dy[DIR_NUM];
                if (canMove(nr, nc)) {
                    curRow = nr;
                    curCol = nc;
                    answer += grid[curRow][curCol];
                }
            } else if (command.equals("R")) {
                DIR_NUM = (DIR_NUM + 1) % 4;
            } else {
                DIR_NUM = (DIR_NUM + 3) % 4;
            }
        }

        System.out.println(answer);
    }

    public static boolean canMove(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < N;
    }
}