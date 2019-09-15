import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author www.chuckfang.top
 * Date 2019/3/13 18:50
 */
public class TestCyclicBarrier {

    private int i;

    // Ϊʲô����volatile���ǻ���ֲ������⣿��Ϊset()��������Ҫ���ڴ���������߳�B�����countֵ�ı仯��������߳�A����Ӱ��
    // �����set()�����ĳ�count++��
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
        final int N = 2; // �߳���
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
            System.out.println(Thread.currentThread().getName() + "��λ");
            try {
                cyclicBarrier.await(); // �ȴ������߳�
                System.out.println(Thread.currentThread().getName() + "����@ " + System.currentTimeMillis() + "����   " + i++);
                //����д��Ҫִ�еĳ���
                add10K();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

}
