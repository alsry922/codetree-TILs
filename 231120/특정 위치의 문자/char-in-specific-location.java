import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char input = br.readLine().charAt(0);
        Character[] characters = new Character[] {'L', 'E', 'B', 'R', 'O', 'S'};
        int index = Arrays.asList(characters).indexOf(input);
        System.out.println(index == -1 ? "None" : index);
    }
}