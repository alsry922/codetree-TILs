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
            return this.height - student.height;
        }
        return student.weight - this.weight;
    }
    public String toString() {
        return String.format("%d %d %d", this.height, this.weight, this.number);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputLength = Integer.parseInt(br.readLine().trim());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < inputLength; i++) {
            int[] input = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            int number = i + 1;
            int height = input[0];
            int weight = input[1];
            students.add(new Student(number, height, weight));
        }
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}