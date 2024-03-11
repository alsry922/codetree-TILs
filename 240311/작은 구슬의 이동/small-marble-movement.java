import java.io.*;
import java.util.*;

public class Main {
    public static int N, T, DIR_NUM = 3;
    public static int[] dirRow = new int[] {0, 1, -1, 0};
    public static int[] dirCol = new int[] {1, 0, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        T = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int d = getDirection(sc.next());

        while (T-- > 0) {
            int nextRow = r + dirRow[d];
            int nextCol = c + dirCol[d];
            if (!isInRange(nextRow, nextCol)) {
                d = DIR_NUM - d;
            } else {
                r = nextRow;
                c = nextCol;
            }
        }
        System.out.printf("%d %d%n", r, c);
    }

    public static int getDirection(String dir) {
        if (dir.equals("R"))
            return 0;
        else if (dir.equals("D"))
            return 1;
        else if (dir.equals("U"))
            return 2;
        else
            return 3;
    }

    public static boolean isInRange(int row, int col) {
        return 1 <= row && row <= N && 1 <= col && col <= N;
    }
}