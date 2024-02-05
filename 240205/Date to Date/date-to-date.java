import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int elapsedDays = 0;
        int[] numOfDays = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            d1++;
            elapsedDays++;

            if (d1 > numOfDays[m1]) {
                d1 = 1;
                m1++;
            }

            if (m1 == m2 && d1 == d2) break;
        }

        System.out.println(elapsedDays+1);
    }
}