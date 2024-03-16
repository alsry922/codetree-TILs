import java.io.*;
import java.util.*;

public class Main {
    public static String[] brackets;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        brackets = sc.nextLine().split("");
        int count  = 0;
        for (int i = 0; i < brackets.length-1; i++) {
            if (!brackets[i].equals("("))
                continue;
            String open = brackets[i];
            for (int j = i+1; j < brackets.length; j++) {
                if (brackets[j].equals(")"))
                    count++;
            }
        }
        System.out.println(count);
    }
}