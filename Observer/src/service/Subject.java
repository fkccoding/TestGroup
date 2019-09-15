package service;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/2/10 11:06
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
