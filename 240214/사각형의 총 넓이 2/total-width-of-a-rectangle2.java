import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static final int OFFSET = 100;
    public static int[][] x, y;
    public static int[][] square = new int[OFFSET * 2 + 1][OFFSET * 2 + 1];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());
        x = new int[inputCount][2];
        y = new int[inputCount][2];
        for (int i = 0; i < inputCount; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(ele -> {
                return Integer.parseInt(ele) + OFFSET;
            }).toArray();
            x[i][0] = input[0];
            y[i][0] = input[1];
            x[i][1] = input[2];
            y[i][1] = input[3];
        }

        for (int i = 0; i < inputCount; i++) {
            for (int row = x[i][0]; row < x[i][1]; row++) {
                for (int column = y[i][0]; column < y[i][1]; column++) {
                    square[row][column] = 1;
                }
            }
        }

        int area = (int) Arrays.stream(square).flatMapToInt(Arrays::stream).filter(ele -> ele == 1).count();
        System.out.println(area);
    }
}