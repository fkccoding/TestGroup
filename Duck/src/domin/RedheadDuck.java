package domin;

import service.Flyable;
import service.Quickable;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/2/9 16:37
 */
public class RedheadDuck extends Duck1 implements Quickable, Flyable {
    @Override
    public void display() {
        System.out.println("我是一只红头鸭");
        quick();
        fly();
        super.display();
    }

    @Override
    public void fly() {
        System.out.println("我正在飞翔");
    }

    @Override
    public void quick() {
        System.out.println("呱呱");
    }
}
