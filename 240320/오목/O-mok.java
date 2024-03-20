import java.io.*;
import java.util.*;

public class Main {
    public static final int LENGTH = 19, B = 1, W = 2;
    public static int[] dx = new int[] {0, 1, 1,  1,  0, -1, -1, -1};
    public static int[] dy = new int[] {1, 1, 0, -1, -1, -1,  0,  1};
    public static int[][] grid = new int[LENGTH][LENGTH];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < LENGTH; row++) {
            for (int col = 0; col < LENGTH; col++) {
                grid[row][col] = sc.nextInt();
            }
        }

        
        for (int row = 0; row < LENGTH; row++) {
            for (int col = 0; col < LENGTH; col++) {
                if (grid[row][col] == 0)
                    continue;
                for (int dirNum = 0; dirNum < dx.length; dirNum++) {
                    int count = 1;
                    int curRow = row;
                    int curCol = col;                    
                    while (true) {
                        int nRow = curRow + dx[dirNum];
                        int nCol = curCol + dy[dirNum];
                        if (isInRange(nRow, nCol) &&
                            grid[nRow][nCol] == grid[curRow][curCol]) {
                            count++;
                            curRow = nRow;
                            curCol = nCol;
                        } else {
                            break;
                        }
                    }
                    if (count == 5) {
                        System.out.println(grid[row][col]);
                        System.out.println((row + 2 * dx[dirNum] + 1) + " " + (col + 2 * dy[dirNum] + 1));
                        System.exit(0);
                    }
                }
            }
        }
        System.out.print(0);
    }

    public static boolean isInRange(int row, int col) {
        return 0 <= row && row < LENGTH && 0 <= col && col < LENGTH;
    }
}