package object;

/**
 * ¾²Ì¬ÄÚ²¿Àà
 * @author https://www.chuckfang.top
 * @date Created on 2019-08-19 19:39
 */
public class MyObject3 {
    private MyObject3(){

    }

//    MyObject3 myObject3;

    static class MyObject3Create{
        private static MyObject3 myObject3 = new MyObject3();
    }
    public static MyObject3 getMyObject3(){
        return MyObject3Create.myObject3;
    }
}
