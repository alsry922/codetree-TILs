import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] countArr = new int[b];
        while (a > 1) {
            int remainder = a % b;
            a = a / b;
            countArr[remainder]++;
        }
        int answer = 0;
        for (int i = 0; i < countArr.length; i++) {
            answer += Math.pow(countArr[i], 2);
        }
        System.out.println(answer);
    }
}