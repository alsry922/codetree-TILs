import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int[] nums;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                Arrays.sort(nums, 0, i+1);
                sb.append(nums[i / 2]).append(" ");
            }
        }

        System.out.println(sb);
    }
}