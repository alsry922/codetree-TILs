import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static final int OFFSET = 100;
    public static int[][] matrix = new int[OFFSET * 2 + 1][OFFSET * 2 + 1];
    public static int inputCount;
    public static int[] x = new int[100];
    public static int[] y = new int[100];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < inputCount; i++) {
            int[] input = Arrays.stream(br.readLine().trim().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
            
            x[i] = input[0] + OFFSET;
            y[i] = input[1] + OFFSET;

            for (int row = x[i]; row < x[i] + 8; row++ ) {
                for (int column = y[i]; column < y[i] + 8; column++) {
                    matrix[row][column]++;
                }
            }
        }

       int answer = (int) Arrays.stream(matrix)
            .flatMapToInt(Arrays::stream)
            .filter(ele -> ele > 0)
            .count();

        System.out.println(answer);
        br.close();
    }
}