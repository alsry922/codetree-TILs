import java.io.*;
import java.util.*;

class Student {
    String name;
    int height;
    int weight;
    public Student(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public void print() {
        System.out.printf("%s %d %d\n", this.name, this.height, this.weight);
    }
}

public class Main {
    public static int inputLength;
    public static List<Student> students = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputLength = Integer.parseInt(br.readLine());
        for (int i = 0; i < inputLength; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            int height = Integer.parseInt(input[1]);
            int weight = Integer.parseInt(input[2]);
            students.add(new Student(name, height, weight));
        }

        Collections.sort(students, (a, b) -> a.height - b.height);
        for (Student student : students) {
            student.print();
        }
    }
}