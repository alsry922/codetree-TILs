import java.io.*;
import java.util.*;

class Point implements Comparable<Point> {
    int number, x, y;
    public Point(int number, int x, int y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        if (getDistance(this) == getDistance(point)) {
            return this.number - point.number;
        }
        return getDistance(this) - getDistance(point);
    }

    public int getDistance(Point point) {
        return Math.abs(0 - point.x) + Math.abs(0 - point.y);
    }
}

public class Main {
    public static int inputLength;
    public static List<Point> points = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputLength = Integer.parseInt(br.readLine());
        for (int i = 0; i < inputLength; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int number = i + 1;
            int x = input[0];
            int y = input[1];
            points.add(new Point(number, x, y));
        }
        Collections.sort(points);
        points.stream().forEach(point -> System.out.println(point.number));
    }
}