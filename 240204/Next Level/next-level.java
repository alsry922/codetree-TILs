import java.io.*;

class Info {
    String id;
    String level;
    public Info() {
        this.id = "codetree";
        this.level = "10";
    }

    public Info(String id, String level) {
        this.id = id;
        this.level = level;
    }

    public void printUserInfo() {
        System.out.println(String.format("user %s lv %s", this.id, this.level));
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        Info info1 = new Info(input1[0], input1[1]);
        Info info2 = new Info();
        info2.printUserInfo();
        info1.printUserInfo();
    }
}