import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[] cow;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        cow = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        for (int i = 0; i < N-2; i++) {
            for (int j = i+1; j < N-1; j++) {
                for (int k = j+1; k < N; k++) {
                    if (cow[i] > cow[j])
                        continue;
                    if (cow[j] > cow[k])
                        continue;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}