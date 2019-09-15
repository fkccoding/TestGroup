package domin;

import service.impl.FlyNoWay;
import service.impl.Squeak;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/2/9 18:20
 */
public class XiangDuck2 extends Duck2 {
    public XiangDuck2(){
        quickBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("我是一个橡皮鸭");
    }
}
