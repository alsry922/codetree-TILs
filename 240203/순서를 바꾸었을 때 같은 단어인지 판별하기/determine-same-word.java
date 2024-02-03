import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static String firstWord, secondWord;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        firstWord = br.readLine();
        secondWord = br.readLine();
        String sortedFirstWord = firstWord.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        String sortedSecondWord = secondWord.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        if (sortedFirstWord.equals(sortedSecondWord)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        br.close();
    }
}