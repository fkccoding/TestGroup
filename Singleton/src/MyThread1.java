import object.MyObiect;
import object.MyObject2;

/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-08-02 16:48
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject2.getMyObject().hashCode());
    }
}
