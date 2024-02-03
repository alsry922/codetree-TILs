import java.io.*;
import java.util.*;

class Bomb {
    String code;
    char color;
    int time;
    public Bomb(String code, char color, int time) {
        this.code = code;
        this.color = color;
        this.time = time;
    }

    public void print() {
        System.out.println("code : " + this.code);
        System.out.println("color : " + this.color);
        System.out.println("second : " + this.time);
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String code = input[0];
        char color = input[1].charAt(0);
        int time = Integer.parseInt(input[2]);
        new Bomb(code, color, time).print();
    }
}