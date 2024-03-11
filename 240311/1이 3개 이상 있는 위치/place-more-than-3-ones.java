import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static int[][] grid;
    public static int N;
    public static int[] dx = new int[] {0, -1, 0, 1};
    public static int[] dy = new int[] {1, 0, -1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        grid = new int[N][N];
        for (int rowNum = 0; rowNum < N; rowNum++) {
            int[] row = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < row.length; i++) {
                grid[rowNum][i] = row[i];
            }
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int count = 0;
                for (int dirNum = 0; dirNum < dx.length; dirNum++) {
                    int nx = i + dx[dirNum];
                    int ny = j + dy[dirNum];
                    if (isInRange(nx, ny) && grid[nx][ny] == 1) {
                        count++;
                    }
                }
                if (count >= 3)
                    answer++;
            }
        }
        System.out.println(answer);
    }

    public static boolean isInRange(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }
}