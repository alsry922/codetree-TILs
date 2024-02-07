import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static List<Integer> binary = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        binary = Arrays.stream(br.readLine().trim().split("")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
        AtomicInteger answer = new AtomicInteger(0);
        IntStream.range(0, binary.size()).forEach(index -> {
            answer.set(answer.get() * 2 + binary.get(index));
        });
        System.out.println(answer.get());
    }
}