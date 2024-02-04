import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class Weather {
    String date;
    String day;
    String weather;
    public Weather(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
    
    public void print() {
        System.out.println(String.format("%s %s %s", this.date, this.day, this.weather));
    }
}

public class Main {
    public static int inputLength;
    public static List<Weather> weatherCast = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputLength = Integer.parseInt(br.readLine());
        for (int i = 0; i < inputLength; i++) {
            String[] input = br.readLine().split(" ");
            String date = input[0];
            String day = input[1];
            String weather = input[2];
            weatherCast.add(new Weather(date, day, weather));
        }

        List<Weather> rainWeathers = weatherCast.stream().filter(ele -> ele.weather.equals("Rain")).collect(Collectors.toCollection(ArrayList::new));

        int minIdx = 0;
        for (int i = 1; i < rainWeathers.size(); i++) {
            if (rainWeathers.get(minIdx).date.compareTo(rainWeathers.get(i).date) > 0) {
                minIdx = i;
            }
        }

        rainWeathers.get(minIdx).print();
    }
}