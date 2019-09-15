import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 可以接收返回值的创建线程的方法
 * @author https://www.chuckfang.top
 * @date Created on 2019-08-17 20:17
 */
public class CallerTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "hello";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> stringFutureTask = new FutureTask<>(new CallerTask());
        new Thread(stringFutureTask).start();
        String s = stringFutureTask.get();
        System.out.println(s);
    }
}
