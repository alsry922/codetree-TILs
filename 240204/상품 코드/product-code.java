import java.io.*;
import java.util.*;

class Product {
    String name;
    String code;
    public Product() {
        this.name = "codetree";
        this.code = "50";
    }
    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }
    public void print() {
        System.out.println(String.format("product %s is %s", this.code, this.name));
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Product product1 = new Product();
        Product product2 = new Product(input[0], input[1]);
        product1.print();
        product2.print();
    }
}