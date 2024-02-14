import java.io.*;
import java.util.*;
import java.util.stream.*;

class Square {
    int x1, y1, x2, y2;
    public Square(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}

public class Main {
    public static final int OFFSET = 1000;
    public static final int INPUT_COUNT = 3;
    public static int[][] checked = new int[OFFSET * 2][OFFSET * 2];
    public static List<Square> squares = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < INPUT_COUNT; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(ele -> {
                return Integer.parseInt(ele) + OFFSET;
            }).toArray();
            int x1 = input[0];
            int y1 = input[1];
            int x2 = input[2];
            int y2 = input[3];
            squares.add(new Square(x1, y1, x2, y2));
            for (int row = x1; row < x2; row++) {
                for (int column = y1; column < y2; column++) {
                    checked[row][column]++;
                }
            }
        }
        
        int area = IntStream.range(0, squares.size())
            .limit(2)
            .map(index -> {
                int distinceArea = 0;
                for (int row = squares.get(index).x1; row < squares.get(index).x2; row++) {
                    for (int column = squares.get(index).y1; column < squares.get(index).y2; column++) {
                        if (checked[row][column] == 1) distinceArea++;
                    }
                }
                return distinceArea;
            })
            .sum();
       
        System.out.println(area);
    }
}