import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int result = num;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (count < 2) {
            if (result % 5 == 0) {
                count++;
            }
            sb.append(result).append(' ');
            result += num;
        }
        System.out.println(sb);
    }
}