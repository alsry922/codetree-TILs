import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.stream.Collectors;

class Number implements Comparable<Number> {
    int number, index;
    public Number(int number, int index) {
        this.number = number;
        this.index = index;
    }
    @Override
    public int compareTo(Number number) {
        if (this.number != number.number) {
            return this.number - number.number;
        }
        return this.index - number.index;
    }
}

public class Main {
    public static int inputLength;
    public static List<Number> numberList = new ArrayList<>();
    public static List<Integer> answers;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputLength = Integer.parseInt(br.readLine().trim());
        AtomicInteger index = new AtomicInteger();

        Arrays.stream(br.readLine().trim().split(" "))
            .forEach((ele) -> {
                numberList.add(new Number(Integer.parseInt(ele), index.getAndIncrement()));
            });
        
        Collections.sort(numberList);

        AtomicInteger sortedIndex = new AtomicInteger();
        answers = new ArrayList<>(Collections.nCopies(inputLength, 0));

        numberList.stream()
            .forEach((ele) -> {
                answers.set(ele.index, sortedIndex.incrementAndGet());
            });
        for (Integer answer : answers) {
            System.out.print(answer + " ");
        }
        br.close();
    }
}