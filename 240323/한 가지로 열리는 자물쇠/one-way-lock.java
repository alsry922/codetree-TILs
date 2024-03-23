import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[] givenArr = new int[3];
    public static int[] targetArr = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            givenArr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 1; i <= N; i++) {
            targetArr[0] = i;
            for (int j = 1; j <= N; j++) {
                targetArr[1] = j;
                for (int k = 1; k <= N; k++) {
                    targetArr[2] = k;
                    for (int l = 0; l < 3; l++) {
                        int diff = Math.abs(givenArr[l] - targetArr[l]);
                        if (diff <= 2) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}