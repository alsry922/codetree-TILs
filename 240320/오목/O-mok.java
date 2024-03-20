import java.io.*;
import java.util.*;

public class Main {
    public static final int LENGTH = 19, B = 1, W = 2;
    public static int[] dx = new int[] {0, 1, 1,  1,  0, -1, -1, -1};
    public static int[] dy = new int[] {1, 1, 0, -1, -1, -1,  0,  1};
    public static int[][] grid = new int[LENGTH][LENGTH];
    public static boolean flag = false;
    public static int answerRow = -1, answerCol = -1, answerDirNum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < LENGTH; row++) {
            for (int col = 0; col < LENGTH; col++) {
                grid[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < LENGTH; row++) {
            for (int col = 0; col < LENGTH; col++) {
                if (grid[row][col] == 0) continue;
                for (int dirNum = 0; dirNum < dx.length; dirNum++) {
                    flag = false;
                    int count = 1;
                    simulate(row, col, count, dirNum);
                    if (flag) {
                        answerRow = row;
                        answerCol = col;
                        answerDirNum = dirNum;
                    }
                }
            }
        }

        if (answerRow != -1 && answerCol != -1) {
            System.out.println(grid[answerRow][answerCol]);
            System.out.printf("%d %d", answerRow + 2 * dx[answerDirNum] + 1, answerCol + 2 * dy[answerDirNum] + 1);
        } else {
            System.out.println(0);
        }
    }

    public static void simulate(int row, int col, int count, int dirNum) {
        int nRow = row + dx[dirNum];
        int nCol = col + dy[dirNum];
        if (!isInRange(nRow, nCol)
                || grid[row][col] != grid[nRow][nCol]) {
            if (count == 5) {
                flag = true;
            }
            return;
        }
        simulate(row + dx[dirNum], col + dy[dirNum], count+1, dirNum);
    }

    public static boolean isInRange(int row, int col) {
        return 0 <= row && row < LENGTH && 0 <= col && col < LENGTH;
    }
}