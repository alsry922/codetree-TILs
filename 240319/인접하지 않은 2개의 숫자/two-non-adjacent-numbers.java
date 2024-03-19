import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[] arr;
    public static int answer = 0;
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < arr.length-2; i++) {
            int sum = 0;
            for (int j = i+2; j < arr.length; j++) {
                sum = arr[i]+arr[j];
            }
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
    }
}