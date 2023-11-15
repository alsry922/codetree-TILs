import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int[] arr = new int[count];
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] % 2 == 0) {
                sb.append(arr[i]).append(' ');
            }
        }
        System.out.println(sb);
    }
}