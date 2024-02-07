import java.io.*;
import java.util.*;
import java.util.stream.*;

class Command {
    int start, end;
    public Command(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {
    public static int length, commandCount;
    public static List<Command> commands = new ArrayList<>();
    public static int[] blocks;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        length = input[0];
        blocks = new int[length+1];
        commandCount = input[1];
        for (int i = 0; i < commandCount; i++) {
            int[] command = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int start = command[0];
            int end = command[1];
            commands.add(new Command(start, end));
        }

        for (Command command : commands) {
            for (int i = command.start; i <= command.end; i++) {
                blocks[i] += 1;
            }
        }

        int count = 0;
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i] > count) {
                count = blocks[i];
            }
        }

        System.out.println(count);
    }
}