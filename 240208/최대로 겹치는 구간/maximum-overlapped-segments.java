import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static int OFFSET = 100;
    public static int lineCount;
    public static int[] overlap = new int[201];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        lineCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < lineCount; i++) {
            int[] input = Arrays.stream(br.readLine().trim().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int start = input[0]+OFFSET;
            int end = input[1]+OFFSET;
            for (int index = start; index < end; index++) {
                overlap[index]++;
            }
        }
        int answer = Arrays.stream(overlap).max().orElse(0);
        System.out.println(answer);
        br.close();
    }
}