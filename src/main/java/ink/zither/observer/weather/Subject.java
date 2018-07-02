package ink.zither.observer.weather;

/**
 * @Description:
 * @Author:　zither
 * @Date:　2018/7/2
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
