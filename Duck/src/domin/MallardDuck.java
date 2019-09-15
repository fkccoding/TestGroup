package domin;

import service.Flyable;
import service.Quickable;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/2/9 16:36
 */
public class MallardDuck extends Duck1 implements Quickable, Flyable {
    @Override
    public void display() {
        System.out.println("我是一只绿头鸭");
        quick();
        fly();
        super.display();
    }

    @Override
    public void quick() {
        System.out.println("呱呱");
    }

    @Override
    public void fly() {
        System.out.println("我正在飞翔");
    }
}
