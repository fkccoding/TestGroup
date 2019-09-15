package domin;

import service.FlyBehavior;
import service.QuickBehavior;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/2/9 17:25
 */
public abstract class Duck2 {
    FlyBehavior flyBehavior;
    QuickBehavior quickBehavior;

    public Duck2(){
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quickBehavior.quick();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuickBehavior(QuickBehavior quickBehavior) {
        this.quickBehavior = quickBehavior;
    }
}
