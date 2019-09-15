import java.util.concurrent.CountDownLatch;

/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-08-17 12:04
 */
public class TestCountDownLatch {
    private static volatile CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {

        Thread threadOne = new Thread(()->{
            try {
                Thread.sleep(1000);
                System.out.println("child threadOne over!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                countDownLatch.countDown();
            }
        });

        Thread threadTwo = new Thread(()->{
            try {
                Thread.sleep(1000);
                System.out.println("child threadTwo over!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                countDownLatch.countDown();
            }
        });

        long start = System.currentTimeMillis();
        threadOne.start();
        threadTwo.start();

        System.out.println("wait all child thread over!");
        countDownLatch.await();

        System.out.println("all child thread over!");

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
