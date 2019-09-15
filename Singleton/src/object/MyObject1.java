package object;

/**
 * ¼¢¶öÄ£Ê½
 * @author https://www.chuckfang.top
 * @date Created on 2019-08-02 16:19
 */
public class MyObject1 extends MyObiect {

    private static MyObject1 myObject1 = new MyObject1();

    private MyObject1(){

    }

    public static MyObject1 getMyObject() {
        return myObject1;
    }
}
