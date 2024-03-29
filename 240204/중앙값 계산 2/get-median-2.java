import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static int listCount;
    public static List<Integer> list;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        listCount = Integer.parseInt(br.readLine());
        list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                List<Integer> subList = list.subList( 0, i+1 ).stream().sorted().collect(Collectors.toCollection(ArrayList::new));
                sb.append(subList.get( i/2 )).append(" ");
            }
        }
        System.out.println(sb);
    }
}