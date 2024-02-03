import java.io.*;

class Meeting {
    String code;
    char point;
    int time;
    public Meeting(String code, char point, int time) {
        this.code = code;
        this.point = point;
        this.time = time;
    }

    public void print() {
        System.out.println("secret code : " + this.code);
        System.out.println("meeting point : " + this.point);
        System.out.println("time : " + this.time);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        Meeting meeting = new Meeting(inputs[0], inputs[1].charAt(0), Integer.parseInt(inputs[2]));
        meeting.print();
    }
}