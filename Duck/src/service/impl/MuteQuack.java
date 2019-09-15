package service.impl;

import service.QuickBehavior;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/2/9 18:23
 */
public class MuteQuack implements QuickBehavior {
    @Override
    public void quick() {
        System.out.println("<< Silence >>");
    }
}
