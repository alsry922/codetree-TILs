import java.io.*;
import java.util.*;

public class Main {
    public static final int OFFSET = 100000, WHITE = 1, BLACK = 2;
    public static int[] tiles = new int[OFFSET * 2 + 1];
    public static int white = 0, black = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());

        int cur = OFFSET;
        for (int i = 0; i < inputCount; i++) {
            String[] input = br.readLine().split(" ");
            int flipCount = Integer.parseInt(input[0]);
            String direction = input[1];

            if (direction.equals("L")) {
                while (flipCount > 0) {
                    tiles[cur] = WHITE;
                    flipCount--;
                    if (flipCount > 0) cur--;
                }
            } else {
                while (flipCount > 0) {
                    tiles[cur] = BLACK;
                    flipCount--;
                    if (flipCount > 0) cur++;
                }
            }
        }

        white = (int) Arrays.stream(tiles).filter(ele -> ele == WHITE).count();
        black = (int) Arrays.stream(tiles).filter(ele -> ele == BLACK).count();
        System.out.println(white + " " + black);
    }
}