package ink.zither.observer.weather;

/**
 * @Description:
 * @Author:　zither
 * @Date:　2018/7/2
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(34.23f, 1.32f, 132.0f);
        weatherData.setMeasurements(22.23f, 1.32f, 132.0f);
        weatherData.setMeasurements(11.23f, 1.32f, 132.0f);
    }
}
