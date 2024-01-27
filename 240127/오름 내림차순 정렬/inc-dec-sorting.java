import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static int K;
    public static List<Integer> list;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine());
        list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        sb.append(list.stream().sorted().map(ele -> String.valueOf(ele)).collect(Collectors.joining(" "))).append("\n");
        sb.append(list.stream().sorted(Comparator.reverseOrder()).map(String::valueOf).collect(Collectors.joining(" ")));
        System.out.println(sb);
        br.close();
    }
}