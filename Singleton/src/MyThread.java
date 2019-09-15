import object.MyObiect;

/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-08-02 16:23
 */
public class MyThread extends Thread {

    private MyObiect myObiect;

    MyThread(MyObiect myObiect){
        this.myObiect = myObiect;
    }
    @Override
    public void run() {
        System.out.println(myObiect.hashCode());
    }
}
