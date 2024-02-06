import java.io.*;
import java.util.*;

public class Main {
    public static int fromMonth, fromDay, toMonth, toDay;
    public static int[] numOfDays = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] dayOfWeek = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] input = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        fromMonth = input[0];
        fromDay = input[1];
        toMonth = input[2];
        toDay = input[3];
        int fromSum = Arrays.stream(numOfDays).limit(fromMonth).sum() + fromDay;
        System.out.println(fromSum);
        int toSum = Arrays.stream(numOfDays).limit(toMonth).sum() + toDay;
        System.out.println(toSum);
        int dateDiff = fromSum - toSum;
        if (dateDiff > 0) {
            System.out.println(dayOfWeek[dayOfWeek.length - (dateDiff % 7)]);
        } else {
            System.out.println(dayOfWeek[-1 * dateDiff % 7]);
        }
    }
}

// 2011년 5월 4일이 월욜이면 2011년 5월 3일은 일용
// 날짜 차이를 7로 나눈 나머지를 기준으로 0, 1, 2, 3, 4, 5, 6이 요일이 된다.
// 2011년 1월 1일부터 주어진 날짜와, 타겟 날짜 둘 다 기간을 구한다.
// 각 월에 맞는 날짜 수를 배열로 넣는다.
// 날짜 차이를 구해서 7로 나눈 나머지를 구한다.