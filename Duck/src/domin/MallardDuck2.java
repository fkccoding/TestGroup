package domin;

import service.FlyBehavior;
import service.QuickBehavior;
import service.impl.FlyWithWings;
import service.impl.Quick;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/2/9 17:31
 */
public class MallardDuck2 extends Duck2 {

    public MallardDuck2() {
        flyBehavior = new FlyWithWings();
        quickBehavior = new Quick();
    }

    @Override
    public void display() {
        System.out.println("我是一个绿头鸭");
    }
}
