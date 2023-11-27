import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int[] a = new int[n1];
        int[] b = new int[n2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n1; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < n2; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        
        String answer = "No";
        for (int aIdx = 0; aIdx < n1; aIdx++) {
            int count = 0;
            for (int bIdx = 0; bIdx < n2; bIdx++) {
                if (aIdx + bIdx >= n1) break;
                if (a[aIdx + bIdx] != b[bIdx]) break;
                count++;
            }
            if (count == n2) {
                answer = "Yes";
                break;
            }
        }
        System.out.println(answer);
    }
}