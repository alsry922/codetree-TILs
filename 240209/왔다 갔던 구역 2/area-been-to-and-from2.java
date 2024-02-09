import java.io.*;
import java.util.*;
import java.util.stream.*;

class Line {
    int start, end;
    public Line(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    public String toString() {
        return String.format("start: %d end: %d", this.start, this.end);
    }
}

public class Main {
    public static int movingCount;
    public static int[] overlap;
    public static int OFFSET = 0;
    public static List<Line> lines = new ArrayList<>();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        movingCount = Integer.parseInt(br.readLine());

        inputLines();

        Line lineForOverlap = getMinimumStartAndMaxEnd();
        if (lineForOverlap.start < 0) {
            OFFSET = -1 * lineForOverlap.start;
        }        
        
        applyOffset(lineForOverlap);

        overlap = new int[lineForOverlap.end - lineForOverlap.start + 1];
        for (Line line : lines) {
            for (int index = line.start; index < line.end; index++) {
                overlap[index]++;
            }
        }

        System.out.println(Arrays.stream(overlap).filter(ele -> ele >= 2).count());
        br.close();
    }

    public static void inputLines() throws IOException {
        int start = 0;
        int end = 0;
        for (int i = 0; i < movingCount; i++) {
            String[] input = br.readLine().split(" ");
            int movingDistance = Integer.parseInt(input[0]);
            String direction = input[1];
            if (direction.equals("R")) {
                end = start + movingDistance;
                lines.add(new Line(start, end));
            } else {
                end = start - movingDistance;
                lines.add(new Line(end, start));
            }
            start = end;
        }
    }

    public static Line getMinimumStartAndMaxEnd() {
        int min = 0;
        int end = 0;
        for (Line line : lines) {
            if (line.start < min) {
                min = line.start;
            }
            if (line.end > end) {
                end = line.end;
            }
        }
        
        return new Line(min, end);
    }

    public static void applyOffset(Line lineForOverlap) {
        for (Line line: lines) {
            line.start += OFFSET;
            line.end += OFFSET;
        }
        lineForOverlap.start += OFFSET;
        lineForOverlap.end += OFFSET;
    }
}