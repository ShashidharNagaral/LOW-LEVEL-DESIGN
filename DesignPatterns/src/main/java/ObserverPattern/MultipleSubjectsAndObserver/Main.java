package ObserverPattern.MultipleSubjectsAndObserver;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        CricketScore cricketScore = new CricketScore(); // subject 1
        WeatherData weatherData = new WeatherData(); // subject 2
        Sony sony = new Sony();

        sony.add(cricketScore); // sony is listening to cricketScore subject
        cricketScore.updateScore("runs: 123");
        weatherData.updateWeatherData("temp: 37"); // no observer is listening to weatherData subject

        sony.add(weatherData); // sony is now listening to weatherData subject also
        cricketScore.updateScore("runs: 124");
        weatherData.updateWeatherData("temp: 39");
    }
}
