package service;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/2/10 11:07
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
