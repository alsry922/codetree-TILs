import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) break;
            if (num % 2 == 0) {
                sb.append(num/2).append(' ');
            } else {
                sb.append(num+3).append(' ');
            }
        }
        System.out.println(sb);
    }
}