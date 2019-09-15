package domin;

import service.Quickable;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/2/9 16:47
 */
public class XiangDuck extends Duck1 implements Quickable {
    @Override
    public void display() {
        System.out.println("我是一只橡皮鸭");
        quick();
        super.display();
    }

    @Override
    public void quick() {
        System.out.println("吱吱");
    }
}
