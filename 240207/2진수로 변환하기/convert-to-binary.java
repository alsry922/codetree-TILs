import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static List<Integer> answer = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        int input = Integer.parseInt(br.readLine().trim());
        while (input >= 2) {
            answer.add(input % 2);
            input /= 2;
        }
        answer.add(input);
        Collections.reverse(answer);
        answer.stream().forEach(System.out::print);
    }
}