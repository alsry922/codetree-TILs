import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int maxCount = 0, count = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || list.get(i) == list.get(i-1)) {
                count++;
            } else {
                count = 1;
            }
                maxCount = Math.max(maxCount, count);

        }

        System.out.println(maxCount);
    }
}