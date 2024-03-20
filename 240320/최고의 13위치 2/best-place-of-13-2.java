import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int answer = 0, sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-2; j++) {
                for (int k = i; k < N; k++) {
                    for (int l = 0; l < N-2; l++) {
                        if (i == k && l <= j+2) {
                            continue;
                        }
                        sum = 
                            grid[i][j] + grid[i][j+1] + grid[i][j+2]
                            + grid[k][l] + grid[k][l+1] + grid[k][l+2];
                    }
                    answer = Math.max(answer, sum);
                }
            }
        }
        System.out.println(answer);
    }
}