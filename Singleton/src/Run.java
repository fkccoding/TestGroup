import object.MyObject1;
import object.MyObject2;

/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-08-02 16:29
 */
public class Run {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread(MyObject2.getMyObject());
//        MyThread t2 = new MyThread(MyObject2.getMyObject());
//        MyThread t3 = new MyThread(MyObject2.getMyObject());
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        MyThread1 t3 = new MyThread1();
        t1.start();
        t2.start();
        t3.start();
    }
}
