import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static final int WHITE = 1, BLACK = 2, GRAY = 3;
    public static final int OFFSET = 1000000;
    public static int[] painted = new int[2 * OFFSET + 1];
    public static int[] blackCount = new int[2 * OFFSET + 1];
    public static int[] whiteCount = new int[2 * OFFSET + 1];
    public static int white, black, gray;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());
        int cur = OFFSET;
        for (int i = 0; i < inputCount; i++) {
            String[] input = br.readLine().split(" ");
            int paintCount = Integer.parseInt(input[0]);
            String direction = input[1];

            if (direction.equals("L")) {
                while (paintCount > 0) {
                    painted[cur] = WHITE;
                    whiteCount[cur]++;
                    paintCount--;
                    if (paintCount > 0) {
                        cur--;
                    }
                }
            } else {
                while (paintCount > 0) {
                    painted[cur] = BLACK;
                    blackCount[cur]++;
                    paintCount--;
                    if (paintCount > 0) {
                        cur++;
                    }
                }
            }
        }

        for (int i = 0; i < painted.length; i++) {
            if (blackCount[i] >= 2 && whiteCount[i] >= 2) gray++;
            else if (painted[i] == WHITE) white++;
            else if (painted[i] == BLACK) black++;
        }

        System.out.println(white + " " + black + " " + gray);
    }
}