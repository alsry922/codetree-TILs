import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {
    int number, height, weight;
    public Student(int number, int height, int weight) {
        this.number = number;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student) {
        if (this.height != student.height) {
            return student.height - this.height;
        }
        if (this.weight != student.weight) {
            return student.weight - this.weight;
        }
        return this.number - student.number;
    }

    public void print() {
        System.out.println(String.format("%d %d %d", this.height, this.weight, this.number));
    }
}

public class Main {
    public static int inputLength;
    public static List<Student> students = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputLength = Integer.parseInt(br.readLine());
        for (int i = 0; i < inputLength; i++) {
            int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int number = i + 1;
            int height = inputs[0];
            int weight = inputs[1];
            students.add(new Student(number, height, weight));
        }

        Collections.sort(students);
        for (Student student : students) {
            student.print();
        }
    }
}