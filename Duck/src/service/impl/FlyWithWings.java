package service.impl;

import service.FlyBehavior;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/2/9 17:22
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我正在用翅膀飞翔");
    }
}
