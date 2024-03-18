import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[] room;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        room = new int[N];
        for (int i = N-1; i >= 0; i--) {
            room[i] = sc.nextInt();
        }

        int minDistance = Integer.MAX_VALUE;
        for (int start = N-1; start >= 0; start--) {
            int distance = 0;
            int count = 1;
            int idx = start;
            while (count < N) {
                idx = (idx - 1 + N) % N;
                distance += room[idx] * count;
                count++;
            }
            minDistance = Math.min(minDistance, distance);
        }
        System.out.println(minDistance);
    }
}