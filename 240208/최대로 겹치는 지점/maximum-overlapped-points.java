import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static int lineCount;
    public static int[] overlap = new int[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        lineCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < lineCount; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int start = input[0], end = input[1];
            for (int index = start; index <= end; index++) {
                overlap[index]++;
            }
        }
        System.out.println(Arrays.stream(overlap).max().getAsInt());
        br.close();
    }
}