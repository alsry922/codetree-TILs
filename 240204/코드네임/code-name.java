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
            int max = agents.get(0).point;  
            for (int j = 0; j < length - 1 - i; j++) {
                if (agents.get(j+1).point < max) {
                    Agent temp = agents.get(j+1);
                    agents.set(j + 1, agents.get(j));
                    agents.set(j, temp);
                } else {
                    max = agents.get(j+1).point;
                }
            }
        }
        agents.get(0).printAgentInfo();
    }
}