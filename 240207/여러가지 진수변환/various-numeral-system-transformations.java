import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static int number, base;
    public static List<Integer> answer = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        int[] input = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        number = input[0];
        base = input[1];
        while(true) {
            if (number < base) {
                answer.add(number);
                break;
            }
            answer.add(number % base);
            number /= base;
        }
        Collections.reverse(answer);
        for (Integer ele : answer) {
            sb.append(ele);
        }
        System.out.println(sb);
        br.close();
    }
}