import java.util.Scanner;

public class Main {
    public static final int G = 1, H = 2, LENGTH = 101;
    public static int N;
    public static int[] pictures = new int[LENGTH];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int index = sc.nextInt();
            char picture = sc.next().charAt(0);
            if (picture == 'G') {
                pictures[index] = 1;
            } else {
                pictures[index] = 2;
            }
        }
        int maxSize = 0;
        for (int i = 0; i < LENGTH; i++) {
            for (int j = i; j < LENGTH; j++) {
                int gCnt = 0;
                int hCnt = 0;
                for (int k = i; k <= j; k++) {
                    if (pictures[k] == 1) {
                        gCnt++;
                    } else if (pictures[k] == 2) {
                        hCnt++;
                    }
                }
                if ((gCnt == 0 && hCnt != 0)
                        || (gCnt != 0 && hCnt == 0)
                        || gCnt == hCnt && (gCnt != 0 && hCnt != 0)) {
                    maxSize = Math.max(maxSize, j - i);
                }
            }
        }
        System.out.println(maxSize);
    }
}