import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int height;
    double weight;
    public Student(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public String infoString() {
        return String.format("%s %d %.1f", this.name, this.height, this.weight);
    }
}

public class Main {
    public static final int inputLength = 5;
    public static List<Student> students = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < inputLength; i++) {
            String[] inputs = br.readLine().split(" ");
            String name = inputs[0];
            int height = Integer.parseInt(inputs[1]);
            double weight = Double.parseDouble(inputs[2]);
            students.add(new Student(name, height, weight));
        }
        List<Student> sortedByName = students.stream().sorted((a, b) -> a.name.compareTo(b.name)).collect(Collectors.toCollection(ArrayList::new));
        List<Student> sortedByHeight = students.stream().sorted((a, b) -> b.height - a.height).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("name");
        for (Student student : sortedByName) {
            System.out.println(student.infoString());
        }
        System.out.println();
        System.out.println("height");
        for (Student student: sortedByHeight) {
            System.out.println(student.infoString());
        }
    }
}