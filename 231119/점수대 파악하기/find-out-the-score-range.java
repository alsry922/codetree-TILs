import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = new int[100];
        int[] countArr = new int[11];
        for (int i = 0; i < scores.length; i++) {
            int score = Integer.parseInt(st.nextToken());
            if (score == 0) break;
            countArr[score/10]++; 
        }
        for (int i = countArr.length-1; i > 0; i--) {
            System.out.println(i*10 + " - " + countArr[i]);
        }
    }
}