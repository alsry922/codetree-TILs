import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.stream.Collectors;

class Number {
    int num, val;
    public Number(int num, int val) {
        this.num = num;
        this.val = val;
    }
}

public class Main {
    public static int inputLength;
    public static List<Integer> numberList = new ArrayList<>();
    public static int[] visitCounts = new int[10000001];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputLength = Integer.parseInt(br.readLine().trim());
        Arrays.stream(br.readLine().trim().split(" ")).forEach(ele -> {
            numberList.add(Integer.parseInt(ele));
        });
        List<Integer> indexList = numberList.stream().collect(Collectors.toCollection(ArrayList::new));
        
        Collections.sort(numberList);
        
        indexList.stream().forEach((ele) -> {
            int count = 0;
            for (int i = 0; i < numberList.size(); i++) {
                if (ele == numberList.get(i)) {
                    if (visitCounts[ele] == count) {
                        visitCounts[ele]++;
                        sb.append(i+1).append(" ");
                        return;
                    }
                    count++;
                }
            }
        });
        System.out.println(sb);
        br.close();
    }
}