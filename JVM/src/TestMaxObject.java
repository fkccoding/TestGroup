/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-07-16 20:34
 */
public class TestMaxObject {
    static Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        byte[] bigSize = new byte[1 * 1024 * 1024];
        synchronized (lock){
           System.out.println("·ÀÖ¹½ø³ÌÍË³ö");
           lock.wait();
        }
    }
}
