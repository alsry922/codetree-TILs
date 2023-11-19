import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] countArr = new int[4];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String symptom = st.nextToken();
            int temper = Integer.parseInt(st.nextToken());
            int val = 0;
            if (symptom.equals("Y") && temper >= 37) {
                val = 0;
                countArr[val]++;
            } else if (symptom.equals("N") && temper >= 37) {
                val = 1;
                countArr[val]++;
            } else if (symptom.equals("Y") && temper < 37) {
                val = 2;
                countArr[val]++;
            } else {
                val = 3;
                countArr[val]++;
            }
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countArr.length; i++) {
            sb.append(countArr[i]).append(" ");
        }
        if (countArr[0] >= 2) sb.append("E");
        System.out.println(sb);
    }
}