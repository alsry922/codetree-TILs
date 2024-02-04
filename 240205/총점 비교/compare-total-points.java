import java.io.*;
import java.util.*;

class Student {
    String name;
    int kor, eng, math;
    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public void print() {
        System.out.println(String.format("%s %d %d %d", this.name, this.kor, this.eng, this.math));
    }
}

public class Main {
    public static int inputLength;
    public static List<Student> students = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputLength = Integer.parseInt(br.readLine());
        for (int i = 0; i < inputLength; i++) {
            String[] inputs = br.readLine().split(" ");
            String name = inputs[0];
            int kor = Integer.parseInt(inputs[1]);
            int eng = Integer.parseInt(inputs[2]);
            int math = Integer.parseInt(inputs[3]);
            students.add(new Student(name, kor, eng, math));
        }
        Collections.sort(students, (a, b) -> {
            return (a.kor + a.eng + a.math) - (b.kor + b.eng + b.math);
        });
        for (Student ele : students) {
            ele.print();
        }
    }
}