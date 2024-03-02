import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static final int OFFSET = 1000;
    public static int[][] grid = new int[OFFSET * 2 + 1][OFFSET * 2 + 1];
    public static int[][] xPos = new int[2][2];
    public static int[][] yPos = new int[2][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 2; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            xPos[i][0] = input[0] + OFFSET;
            yPos[i][0] = input[1] + OFFSET;
            xPos[i][1] = input[2] + OFFSET;
            yPos[i][1] = input[3] + OFFSET;
        }

        for (int i = 0; i < 2; i++) {
            int count = 0;
            for (int row = xPos[i][0]; row < xPos[i][1]; row++) {
                for (int col = yPos[i][0]; col < yPos[i][1]; col++) {
                    grid[row][col]++;
                    count++;
                }
            }
        }
        int rowMax = 0;
        int colMax = 0;

        for (int row = xPos[0][0]; row <= xPos[0][1]; row++) {
            int count = 0;
            for (int col = yPos[0][0]; col <= yPos[0][1]; col++) {
                if (grid[row][col] == 1) count++;
            }
            if (count > rowMax) rowMax = count;
        }

        for (int col = yPos[0][0]; col <= yPos[0][1]; col++) {
            int count = 0;
            for (int row = xPos[0][0]; row <= xPos[0][1]; row++) {
                if (grid[row][col] == 1) count++;
            }
            if (count > colMax) colMax = count;
        }

        System.out.println(rowMax * colMax);
    }
}