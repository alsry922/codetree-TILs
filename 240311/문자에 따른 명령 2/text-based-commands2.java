import java.io.*;
import java.util.*;

public class Main {
    public static int dirNum = 3;
    public static int[] dx = new int[] {1, 0, -1, 0};
    public static int[] dy = new int[] {0, -1, 0, 1};
    public static int x = 0, y = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.next().split("");
        for (int j = 0; j < input.length; j++) {
            if (input[j].equals("R"))
                dirNum = (dirNum + 1) % 4;
            else if (input[j].equals("L"))
                dirNum = (dirNum + 3) % 4;
            else {
                x += dx[dirNum];
                y += dy[dirNum];
            }    

        }
        System.out.println(String.format("%d %d", x, y));
    }
}