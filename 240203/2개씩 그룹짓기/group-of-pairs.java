import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {
    public static int groupCount;
    public static List<Integer> numberList;
    public static List<Integer> forAnswerList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        groupCount = Integer.parseInt(br.readLine());
        numberList = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
        List<Integer> sortedList = numberList.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
        int firstIdx = 0, lastIdx = sortedList.size() - 1;
        
        for (int i = 0; i < sortedList.size(); i++) {
            int minValue = sortedList.get(i);
            int maxValue = sortedList.get(lastIdx - i);
            forAnswerList.add(minValue + maxValue);
        }

        Collections.sort(forAnswerList);
        System.out.println(forAnswerList.get(forAnswerList.size() - 1));
        br.close();
    }
}