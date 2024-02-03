import java.io.*;
import java.util.*;

class Agent {
    String codeName;
    int point;
    public Agent(String codeName, int point) {
        this.codeName = codeName;
        this.point = point;
    }

    public void printAgentInfo() {
        System.out.println(String.format("%s %d", this.codeName, this.point));
    }
}

public class Main {
    public static int length = 5;
    public static List<Agent> agents = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < length; i++) {
            String[] input = br.readLine().split(" ");
            agents.add(new Agent(input[0], Integer.parseInt(input[1])));
        }
        for (int i = 0; i < length; i++) {
            int max = agents.get(i).point;
            for (int j = i + 1; j < length; j++) {
                if (agents.get(j).point < max) {
                    Agent temp = agents.get(j);
                    agents.set(j, agents.get(i));
                    agents.set(i, temp);
                }
            }
        }
        agents.get(0).printAgentInfo();
    }
}