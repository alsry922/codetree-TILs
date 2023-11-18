import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] countArr = new int[10];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(st.nextToken());
            countArr[num] += 1;
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(countArr[i]);
        }
    }
}