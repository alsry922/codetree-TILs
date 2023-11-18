import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] countArr = new int[10];
        for (int i = 0; i < 100; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) break;
            int digit = String.valueOf(num).length();
            if (digit == 2) {
                countArr[num / 10]++;
            }
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " - " + countArr[i]);
        }
    }
}