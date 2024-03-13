import java.io.*;
import java.util.*;

class Position {
    int x, y;
    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static int N;
    public static Position position = new Position(0, 0);
    public static int[] dx = new int[] {0, 1, -1,  0};
    public static int[] dy = new int[] {1, 0,  0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        int time = 0;
        boolean isReturn = false;
        while (N-- > 0) {
            int dirNum = getDiretion(sc.next());
            int dis = sc.nextInt();
            
            for (int i = 0; i < dis; i++) {
                time++;
                int nx = position.x + dx[dirNum];
                int ny = position.y + dy[dirNum];
                position.x = nx;
                position.y = ny;
                if (position.x == 0 && position.y == 0) {
                    isReturn = true;
                    break;
                }
            }
            if (isReturn) break;
        }
        if (isReturn) {
            System.out.println(time);
        } else {
            System.out.println(-1);
        }
    }

    public static int getDiretion(String dir) {
        if (dir.equals("E")) {
            return 0;
        } else if (dir.equals("S")) {
            return 1;
        } else if (dir.equals("N")) {
            return 2;
        } else {
            return 3;
        }
    }
}