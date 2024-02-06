import java.io.*;
import java.util.*;

class DateTime {
    int day, hour, minute;
    public DateTime(int day, int hour, int minute) {
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }
}

public class Main {
    public static int START_DAY = 11;
    public static int START_HOUR = 11;
    public static int START_MINUTE = 11;
    public static int elapsedTime = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        int targetDay = input[0];
        int targetHour = input[1];
        int targetMinute = input[2];
        DateTime targetTime = new DateTime(targetDay, targetHour, targetMinute);

        elapsedTime = checkException(targetTime);
        
        while (!isEqual(targetTime)) {
            elapsedTime++;
            START_MINUTE++;
            if (START_MINUTE >= 60) {
                START_MINUTE = 0;
                START_HOUR++;
            }
            if (START_HOUR >= 24) {
                START_HOUR = 0;
                START_DAY++;
            }
        }

        System.out.println(elapsedTime);
    }

    public static int checkException(DateTime targetTime) {
        if (targetTime.day < START_DAY) {
            return -1;
        }
        if (targetTime.hour < START_HOUR) {
            return -1;
        }
        if (targetTime.minute < START_MINUTE) {
            return -1;
        }
        return 0;
    }

    public static boolean isEqual(DateTime targetTime) {
        return targetTime.day == START_DAY && targetTime.hour == START_HOUR && targetTime.minute == START_MINUTE;
    }
}