import java.io.*;
import java.util.*;

public class Main {
    public static int inputCount, orderNumber;
    public static String startString;
    public static List<String> words = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        inputCount = Integer.parseInt(inputs[0]);
        orderNumber = Integer.parseInt(inputs[1]);
        startString = inputs[2];
        for (int i = 0; i < inputCount; i++) {
            String word = br.readLine();
            if (word.startsWith(startString)) {
                words.add(word);
            }
        }
        Collections.sort(words);
        System.out.println(words.get(orderNumber-1));
        br.close();
    }
}