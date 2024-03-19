import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static char[] input;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        input = sc.next().toCharArray();
        int count = 0;
        for (int i = 0; i < N-2; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if (input[i] == 'C' && input[j] == 'O' && input[k] == 'W')
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}