import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static final int LENGTH = 10000;
    public static int N;
    public static int[][] numbers;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        numbers = new int[N][LENGTH];
        for (int i = 0; i < N; i++) {
            int[] number = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < number.length; j++) {
                numbers[i][LENGTH - number.length + j] = number[j];
            }
        }

        int maxValue = 0;
        for (int i = 0; i < N-2; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    boolean canAdd = true;
                    for (int l = 0; l < LENGTH; l++) {
                        if ((numbers[i][l] + numbers[j][l] + numbers[k][l] ) / 10 >= 1) {
                            canAdd = false;
                            break;
                        }
                    }

                    if (canAdd) {
                        final int indexA = i;
                        final int indexB = j;
                        final int indexC = k;
                        int a = IntStream.range(0, LENGTH)
                            .map(digit -> numbers[indexA][LENGTH - 1 - digit] * (int) Math.pow(10, digit))
                            .sum();
                        int b = IntStream.range(0, LENGTH)
                            .map(digit -> numbers[indexB][LENGTH - 1 - digit] * (int) Math.pow(10, digit))
                            .sum();                  
                        int c = IntStream.range(0, LENGTH)
                            .map(digit -> numbers[indexC][LENGTH - 1 - digit] * (int) Math.pow(10, digit))
                            .sum();
                        if (a+b+c > maxValue)
                            maxValue = a+b+c;                     
                    }
                }
            }
        }
        System.out.println(maxValue);
    }
}