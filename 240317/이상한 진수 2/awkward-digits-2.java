import java.io.*;
import java.util.*;

public class Main {
    public static int[] binary;
    public static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        binary = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < binary.length; i++) {
            binary[i] ^= 1;
            int value = 0;
            for (int j = 0; j < binary.length; j++) {
                value = value * 2 + binary[j];
            }
            binary[i] ^= 1;
            if (value > answer)
                answer = value;
        }
        System.out.println(answer);
    }
}