package ink.zither.observer.weatherobservable;

/**
 * @Description:
 * @Author:　zither
 * @Date:　2018/7/2
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(23f,21,21.5f);
        weatherData.setMeasurements(21f,21,21.5f);
        weatherData.setMeasurements(13f,21,21.5f);
        weatherData.deleteObserver(statisticsDisplay);
        weatherData.setMeasurements(0.1f,21,21.5f);
        weatherData.addObserver(statisticsDisplay);
        weatherData.setMeasurements(1f,21,21.5f);

    }


}
