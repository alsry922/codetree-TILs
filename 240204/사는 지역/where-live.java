import java.io.*;
import java.util.*;

class Person {
    String name;
    String postcode;
    String location;
    public Person(String name, String postcode, String location) {
        this.name = name;
        this.postcode = postcode;
        this.location = location;
    }
    public void print() {
        System.out.println("name " + this.name);
        System.out.println("addr " + this.postcode);
        System.out.println("city " + this.location);
    }
}

public class Main {
    public static List<Person> persons = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            Person person = new Person(input[0], input[1], input[2]);
            persons.add(person);
        }
        int maxIdx = 0;
        for (int i = 1; i < persons.size(); i++) {
            String maxName = persons.get(maxIdx).name;
            String nextName = persons.get(i).name;
            if (maxName.compareTo(nextName) < 0) {
                maxIdx = i;
            }
        }
        persons.get(maxIdx).print();
    }
}