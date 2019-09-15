package service.impl;

import service.FlyBehavior;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/2/9 19:05
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
