package service.impl;

import service.FlyBehavior;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/2/9 17:23
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }
}
