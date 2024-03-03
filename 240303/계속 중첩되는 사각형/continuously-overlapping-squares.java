import java.io.*;
import java.util.*;

public class Main {
    public static final int OFFSET = 100;
    public static final int MAX_R = 200;
    public static final int RED = 1, BLUE = 2;
    public static int[][] grid = new int[MAX_R+1][MAX_R+1];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x1 = input[0] + OFFSET;
            int y1 = input[1] + OFFSET;
            int x2 = input[2] + OFFSET;
            int y2 = input[3] + OFFSET;
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    if (i % 2 == 0) grid[x][y] = RED;
                    else grid[x][y] = BLUE;
                }
            }
        }

        int area = (int) Arrays.stream(grid)
            .flatMapToInt(Arrays::stream)
            .filter(ele -> ele == BLUE)
            .count();

        System.out.println(area);
    }
}