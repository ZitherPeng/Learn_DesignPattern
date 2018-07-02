package ink.zither.observer.weather;

/**
 * @Description:
 * @Author:　zither
 * @Date:　2018/7/2
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
