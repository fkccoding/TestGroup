package object;

/**
 * 懒汉模式
 * @author https://www.chuckfang.top
 * @date Created on 2019-08-02 16:31
 */
public class MyObject2 extends MyObiect {
    private static MyObject2 myObject2;

    private MyObject2(){

    }

    public static MyObject2 getMyObject() {
        try {
            if (myObject2 == null) {
                // 放大创建对象需要的时间
                Thread.sleep(3000);
                myObject2 = new MyObject2();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return myObject2;
    }
}
