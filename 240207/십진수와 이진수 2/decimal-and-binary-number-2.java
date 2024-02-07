import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static List<Integer> answer = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> inputBinary = Arrays.stream(br.readLine().trim().split("")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

        int decimal = 0;
        for (Integer ele : inputBinary) {
            decimal = decimal * 2 + ele;
        }
        decimal *= 17;

        while (true) {
            if (decimal < 2) {
                answer.add(decimal);
                break;
            }
            answer.add(decimal % 2);
            decimal /= 2;
        }
        Collections.reverse(answer);
        answer.stream().forEach(sb::append);
        System.out.println(sb);
        br.close();
    }
}