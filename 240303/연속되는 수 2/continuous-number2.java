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

        int groupCount = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || list.get(i) != list.get(i-1)) {
                groupCount++;
            }
        }

        System.out.println(groupCount);
    }
}