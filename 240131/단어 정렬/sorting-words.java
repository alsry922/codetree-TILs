import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int inputCount = Integer.parseInt(br.readLine());
        String[] inputStrings = new String[inputCount];
        for (int i = 0; i < inputCount; i++) {
            String input = br.readLine();
            inputStrings[i] = input;
        }
        Arrays.sort(inputStrings);
        for (int i = 0; i < inputStrings.length; i++) {
            sb.append(inputStrings[i]).append('\n');
        }
        System.out.println(sb);
    }
}