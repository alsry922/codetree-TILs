import java.io.*;
import java.util.*;

public class Main {
    public static int x, y;
    public static int[] dx = new int[] {0, 1,  0, -1};
    public static int[] dy = new int[] {1, 0, -1,  0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");
        int time = 0;
        boolean isRevert = false;
        int dirNum = 3;
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("F")) {
                x = x + dx[dirNum];
                y = y + dy[dirNum];
            } else {
                dirNum = turnDirection(input[i], dirNum);
            }
            time++;
            if (x == 0 && y == 0) {
                isRevert = true;
                break;
            }
        }
        if (isRevert) {
            System.out.println(time);
        } else {
            System.out.println(-1);
        }
    }

    public static int turnDirection(String dir, int dirNum) {
        if (dir.equals("R")) 
            return (dirNum+1) % 4;
        else
            return (dirNum+3) % 4;
    }
}