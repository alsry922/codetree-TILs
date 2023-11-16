import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = num;
        for (int i = 2; i < arr.length; i++) {
            int val = arr[i-2] + arr[i-1];
            arr[i] = val;
            if(val > 100) break;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(' ');
            if(arr[i] > 100) break;
        }
        System.out.println(sb);
    }
}