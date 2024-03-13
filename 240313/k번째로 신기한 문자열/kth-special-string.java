import java.io.*;
import java.util.*;

public class Main {
    public static int n, k;
    public static String T;
    public static List<String> words = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        T = sc.next();
        sc.nextLine();
        while (n-- > 0) {
            String word = sc.nextLine();
            if (word.startsWith(T)) {
                words.add(word);
            }
        }
        // Collections.sort(words);
        words.sort(null);
        System.out.println(words.get(k-1));
    }
}