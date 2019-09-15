import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author www.chuckfang.top
 * Date 2019/3/13 18:50
 */
public class TestCyclicBarrier {

    private int i;

    // 为什么加了volatile还是会出现并发问题？因为set()方法不需要从内存读，所以线程B引起的count值的变化并不会对线程A产生影响
    // 如果把set()方法改成count++，
    volatile private long count = 0;

    private synchronized long get() {
        return count;
    }

    private synchronized void set(long v) {
        count = v;
    }

    synchronized private void add10K() {
        int idx = 0;
        while (idx++ < 10000) {
            set(get() + 1);
            System.out.println(Thread.currentThread().getName() +": idx = " + idx + ", count = " + count);
        }
        System.out.println(Thread.currentThread().getName() + ": Total count = " + count);
    }

    public static void main(String[] args) {
        TestCyclicBarrier testCyclicBarrier = new TestCyclicBarrier();
        testCyclicBarrier.doTest();

    }

    private void doTest() {
        final int N = 2; // 线程数
        CyclicBarrier cyclicBarrier = new CyclicBarrier(N);
        for (int i = 0; i < N; i++) {
            new Thread(new Worker(cyclicBarrier)).start();
        }
    }


    class Worker implements Runnable {

        CyclicBarrier cyclicBarrier;

        Worker(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "就位");
            try {
                cyclicBarrier.await(); // 等待其它线程
                System.out.println(Thread.currentThread().getName() + "启动@ " + System.currentTimeMillis() + "毫秒   " + i++);
                //这里写你要执行的程序
                add10K();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

}
