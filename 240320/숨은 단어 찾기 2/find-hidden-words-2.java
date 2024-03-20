import java.io.*;
import java.util.*;

public class Main {
    public static int N, M, DIR_NUM = 8;;
    public static char[][] characters;
    public static int[] dx = new int[] {0, 1, 1,  1,  0, -1, -1, -1};
    public static int[] dy = new int[] {1, 1, 0, -1, -1, -1,  0,  1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        characters = new char[N][M];
        for (int i = 0; i < N; i++) {
            characters[i] = sc.next().toCharArray();
        }
        int answer = 0;
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < M; col++) {
                if (characters[row][col] != 'L') continue;
                for (int dir = 0; dir < DIR_NUM; dir++) {
                    int count = 1;
                    int currX = row;
                    int currY = col;
                    while (true) {
                        int nx = currX + dx[dir];
                        int ny = currY + dy[dir];
                        if (!isInRange(nx, ny))
                            break;
                        if (characters[nx][ny] != 'E')
                            break;
                        currX = nx;
                        currY = ny;
                        count++;
                        if (count >= 3) {
                            answer++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }

    public static boolean isInRange(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }
}