import java.io.*;
import java.util.*;

class Score implements Comparable<Score>{
    String name;
    int korean, english, math;
    public Score(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
    @Override
    public int compareTo(Score score) {
        if (this.korean == score.korean) {
            if (this.english == score.english) {
                return this.math - score.math;
            }
            return this.english - score.english;
        }
        return this.korean - score.korean;
    }
    public void print() {
        System.out.println(String.format("%s %d %d %d", this.name, this.korean, this.english, this.math));
    }
}

public class Main {
    public static int inputLength;
    public static List<Score> scores = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputLength = Integer.parseInt(br.readLine());
        for (int i = 0; i < inputLength; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            int kor = Integer.parseInt(input[1]);
            int eng = Integer.parseInt(input[2]);
            int math = Integer.parseInt(input[3]);
            scores.add(new Score(name, kor, eng, math));
        }
        Collections.sort(scores);
        for (Score score : scores) {
            score.print();
        }
    }
}