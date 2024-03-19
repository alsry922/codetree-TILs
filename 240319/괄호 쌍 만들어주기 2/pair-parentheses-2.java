import java.io.*;
import java.util.*;

public class Main {
    public static char[] brackets;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        brackets = sc.nextLine().toCharArray();
        int count = 0;
        for (int i = 0; i < brackets.length-4; i++) {
            if (brackets[i] != '(' || brackets[i+1] != '(')
                continue;
            for (int j = i+2; j < brackets.length-1; j++ ) {
                if (brackets[j] != ')' || brackets[j+1] != ')')
                    continue;
                count++;
            }
        }
        System.out.println(count);
    }
}