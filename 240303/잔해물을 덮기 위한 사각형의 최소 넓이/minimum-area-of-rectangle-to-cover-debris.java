import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static final int OFFSET = 1000;
    public static final int N = 2;
    public static final int MAX_R = 2000;
    public static int[][] grid = new int[OFFSET * 2 + 1][OFFSET * 2 + 1];
    public static int[] x1 = new int[N];
    public static int[] y1 = new int[N];
    public static int[] x2 = new int[N];
    public static int[] y2 = new int[N];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 2; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            x1[i] = input[0] + OFFSET;
            y1[i] = input[1] + OFFSET;
            x2[i] = input[2] + OFFSET;
            y2[i] = input[3] + OFFSET;
        }

        for (int i = 0; i < 2; i++) {
            int count = 0;
            for (int row = x1[i]; row < x2[i]; row++) {
                for (int col = y1[i]; col < y2[i]; col++) {
                    grid[row][col] = i + 1;
                    count++;
                }
            }
        }

        int minX = MAX_R, maxX = 0, minY = MAX_R, maxY = 0;
        boolean firstRectExists = false;
        for (int x = 0; x <= MAX_R; x++) {
            for (int y = 0; y <= MAX_R; y++) {
                if (grid[x][y] == 1) {
                    firstRectExists = true;
                    minX = Math.min(x, minX);
                    maxX = Math.max(x, maxX);
                    minY = Math.min(y, minY);
                    maxY = Math.max(y, maxY);
                }
            }
        }

        int area;
        if (!firstRectExists) {
            area = 0;
        } else {
            area = (maxX - minX + 1) * (maxY - minY + 1);
        }
        System.out.println(area);
    }
}