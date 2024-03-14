import java.io.*;
import java.util.*;

public class Main {
    public static int N, K;
    public static String[][] grid;
    public static int[] dx = new int[] {1,  0, -1, 0};
    public static int[] dy = new int[] { 0, -1, 0, 1};
    public static int[] startX = new int[] {0, 0, 2, 2};
    public static int[] startY = new int[] {0, 2, 0, 2};
    public static int xPos, yPos;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new String[N][N];
        for (int row = 0; row < N; row++) {
            String[] mirror = sc.next().split("");
            grid[row][0] = mirror[0];
            grid[row][1] = mirror[1];
            grid[row][2] = mirror[2];
        }
        K = sc.nextInt();

        int dirNum = (K-1) / N;
        getStartPos(dirNum);

        int count = 0;
        while (isInRange(xPos, yPos)) {
            if (grid[xPos][yPos].equals("\\")) {
                if (dirNum == 0 || dirNum == 2) {
                    dirNum = (dirNum + 3) % 4;

                } else {
                    dirNum = (dirNum + 1) % 4;
                }
            } else {
                if (dirNum == 0 || dirNum == 2) {
                    dirNum = (dirNum + 1) % 4;
                } else {
                    dirNum = (dirNum + 3) % 4;
                }
            }
            xPos = xPos + dx[dirNum];
            yPos = yPos + dy[dirNum];
            count++;
        }

        System.out.println(count);
    }

    public static int getDirNum(int num) {
        return num / N;
    }

    public static void getStartPos(int dirNum) {
        xPos = startX[dirNum];
        yPos = startY[dirNum];
        if (dirNum % 2 == 0) {
            if (dirNum / 2 == 0 ) {
                yPos += (K-1) % N;
            } else {
                yPos -= (K-1) % N;
            }
        } else {
            if (dirNum / 2 == 0) {
                xPos += (K-1) % N;
            } else {
                yPos -= (K-1) % N;
            }
        }
    }

    public static boolean isInRange(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }
}