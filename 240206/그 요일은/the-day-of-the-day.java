import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

class DateTime {
    int month, day;
    public DateTime(int month, int day) {
        this.month = month;
        this.day = day;
    }
}

public class Main {
    public static DateTime from, to;
    public static int[] numOfDays = new int[] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] daysOfWeek = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        from = new DateTime(input[0], input[1]);
        to = new DateTime(input[2], input[3]);
        String targetDayOfWeek = "Sat";
        int fromSum = Arrays.stream(numOfDays).limit(from.month).sum() + from.day;
        int toSum = Arrays.stream(numOfDays).limit(to.month).sum() + to.day;
        int targetIndex = IntStream.range(0, daysOfWeek.length).filter(i -> daysOfWeek[i].equals(targetDayOfWeek)).findFirst().getAsInt();
        int answer = 0;
        if (toSum >= fromSum + targetIndex) answer++;

        if ((toSum - (fromSum + targetIndex)) / 7 <= 0) {
            System.out.println(answer);
        } else {
            System.out.println(answer + (toSum - (fromSum + targetIndex)) / 7);
        }
    }
}

// 월별 일 수를 배열로 정리해놓기
// 요일을 배여려로 정리해놓기