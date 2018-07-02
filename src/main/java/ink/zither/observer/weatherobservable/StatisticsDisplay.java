package ink.zither.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description:
 * @Author:　zither
 * @Date:　2018/7/2
 */
public class StatisticsDisplay implements Observer, Display {


    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;


    /**
     * @Description 观察者初始化的时候注册被观察者
     */
    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        // instanceof 判断 o 是否为 WeatherData 类的一个实例
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float temp = weatherData.getTemperature();

            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }
}
