import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int[] arr = new int[10];
        arr[0] = first;
        arr[1] = second;
        for (int i = 2; i < 10; i++) {
            arr[i] = (arr[i-1]+arr[i-2]) % 10;
        }
        for (int i = 0; i < 10; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);
    }
}