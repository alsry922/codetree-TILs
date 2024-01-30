import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.io.*;

public class Main {
    public static int N, K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> inputs = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        N = inputs.get(0);
        K = inputs.get(1);
        List<Integer> values = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).sorted().collect(Collectors.toList());
        System.out.println(values.get(K-1));
    }
}