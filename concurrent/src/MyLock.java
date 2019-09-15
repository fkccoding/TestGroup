import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/4/29 19:56
 */
public class MyLock {
    // ����ת�˵�main����
    public static void main(String[] args) throws InterruptedException {
        Account src = new Account(10000);
        Account target = new Account(10000);
        CountDownLatch countDownLatch = new CountDownLatch(9999);
        for (int i = 0; i < 9999; i++) {
            new Thread(()->{
                src.transactionToTarget(1,target);
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println("src="+src.getBanalce() );
        System.out.println("target="+target.getBanalce() );
    }
    static class Account{ //�˻���
        Account(Integer banalce) {
            this.banalce = banalce;
        }
        private Integer banalce;
        void transactionToTarget(Integer money, Account target){//ת�˷���
            Allocator.getInstance().apply(this,target);
            this.banalce -= money;
            target.setBanalce(target.getBanalce()+money);
            Allocator.getInstance().release(this,target);
        }
        Integer getBanalce() {
            return banalce;
        }
        void setBanalce(Integer banalce) {
            this.banalce = banalce;
        }
    }
    static class Allocator { //��������
        private Allocator(){}
        private List<Account> locks = new ArrayList<>();
        synchronized void apply(Account src,Account tag){
            while (locks.contains(src)||locks.contains(tag)) {
                try {
                    this.wait();
                } catch (InterruptedException ignored) {
                }
            }
            locks.add(src);
            locks.add(tag);
        }
        synchronized void release(Account src,Account tag){
            locks.remove(src);
            locks.remove(tag);
            this.notifyAll();
        }
        static Allocator getInstance(){
            return AllocatorSingle.install;
        }
        static class AllocatorSingle{
            static Allocator install = new Allocator();
        }
    }
}