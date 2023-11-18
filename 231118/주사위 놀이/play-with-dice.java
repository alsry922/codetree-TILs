import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] countArr = new int[7];
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(st.nextToken());
            countArr[num] += 1;
        }
        for (int i = 1; i < countArr.length; i++) {
            System.out.println(i + " - " + countArr[i]);
        }
    }
}