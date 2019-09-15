/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-07-17 20:40
 */
public class TestThreadRunandStart {
    static void pong(){
        System.out.print("pong");
    }
    public static void main(String[] args) {
        Thread t=new Thread(){
            public void run(){
                pong();
            }
        };
        t.start();
        System.out.print("ping");
    }
}
