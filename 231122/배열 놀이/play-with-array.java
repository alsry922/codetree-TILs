import java.util.*;
import java.util.stream.IntStream;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int qType = Integer.parseInt(st.nextToken());
            if (qType == 1) {
                int order = Integer.parseInt(st.nextToken());
                handleQueryTypeOne(arr, order);
            } else if (qType == 2) {
                int target = Integer.parseInt(st.nextToken());
                handleQueryTypeTwo(arr, target);
            } else if (qType == 3) {
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                handleQueryTypeThree(arr, from, to);
            }
        }
    }
    public static void handleQueryTypeOne(int[] arr, int order) {
        System.out.println(arr[order-1]);
    }

    public static void handleQueryTypeTwo(int[] arr, int target) {
        int index = IntStream.range(0, arr.length)
                .filter(i -> arr[i] == target)
                .findFirst()
                .orElse(-1);

        System.out.println(index+1);
    }

    public static void handleQueryTypeThree(int[] arr, int from, int to) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(arr).skip(from-1).limit(to-from+1).forEach(ele -> sb.append(ele).append(' '));
        System.out.println(sb);
    }
}