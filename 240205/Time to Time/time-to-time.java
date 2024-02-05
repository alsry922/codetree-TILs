import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        int startHour = input[0];
        int startMinute = input[1];
        int targetHour = input[2];
        int targetMinute = input[3];
        int elapsedTime = 0;
        while (startHour != targetHour || startMinute != targetMinute) {
            startMinute++;
            elapsedTime++;

            if (startMinute == 60) {
                startHour++;
                startMinute = 0;
            }
        }
        System.out.println(elapsedTime);
    }
}