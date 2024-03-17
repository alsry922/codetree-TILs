import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[][] grid;
    public static int targetRow = 1, targetCol = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
    
        int maxCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= N-targetCol; j++) {
                int count = 0;
                for (int k = j; k < j+targetCol; k++) {
                    if (grid[i][k] == 1)
                        count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        System.out.println(maxCount);
    }
}