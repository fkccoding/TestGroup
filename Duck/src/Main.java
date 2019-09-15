import domin.*;
import service.impl.FlyRocketPowered;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/2/9 16:37
 */
public class Main {
    public static void main(String[] args) {
        Duck2 x = new XiangDuck2();
        x.performFly();
        x.performQuack();
        x.display();

        x.setFlyBehavior(new FlyRocketPowered());
        x.performFly();
    }
}
