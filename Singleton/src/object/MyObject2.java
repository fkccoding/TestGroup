package object;

/**
 * ����ģʽ
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
                // �Ŵ󴴽�������Ҫ��ʱ��
                Thread.sleep(3000);
                myObject2 = new MyObject2();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return myObject2;
    }
}
