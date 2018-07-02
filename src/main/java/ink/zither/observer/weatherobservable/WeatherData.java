package ink.zither.observer.weatherobservable;

import java.util.Observable;

/**
 * @Description:
 * @Author:　zither
 * @Date:　2018/7/2
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData() {
    }

    /**
     * @Description 通知观察者
     */
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
