import java.io.*;
import java.util.*;

class Person {
    String name;
    int height, weight;
    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public String toString() {
        return String.format("%s %d %d", this.name, this.height, this.weight);
    }
}

public class Main {
    public static int inputLength;
    public static List<Person> persons = new ArrayList<>();
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputLength = Integer.parseInt(br.readLine());
        for (int i = 0; i < inputLength; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            int height = Integer.parseInt(input[1]);
            int weight = Integer.parseInt(input[2]);
            persons.add(new Person(name, height, weight));
        }

        Collections.sort(persons, (a, b) -> {
            if (a.height == b.height) {
                return b.weight - a.weight;
            }
            return a.height - b.height;
        });

        persons.stream().forEach(person -> System.out.println(person.toString()));
    }
}