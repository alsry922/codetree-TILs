import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static int arrLength;
    public static boolean answer = "Yes";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arrLength = Integer.parseInt(br.readLine());
        List<Integer> list1 = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).sorted().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).sorted().collect(Collectors.toList());
        for (int i = 0; i < arrLength; i++) {
            if (list1.get(i) != list2.get(i)) {
                answer = "No";
                break;
            }
        }
        System.out.println(answer);
    }
}