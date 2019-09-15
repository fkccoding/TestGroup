/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-08-14 17:09
 */
public class TestThreadLocal {

    static ThreadLocal<String> localVariable = new ThreadLocal<>();

    static void print(String string){
        System.out.println(string + "" + localVariable.get());

        localVariable.remove();
    }

    public static void main(String[] args) {
        Thread threadOne = new Thread(() -> {
            localVariable.set("threadOne local variable");
            print("threadOne");
            System.out.println("threadOne remove after" + ":" + localVariable.get());
        });

        Thread threadTwo = new Thread(() -> {
            localVariable.set("threadTwo local variable");
            print("threadTwo");
            System.out.println("threadTwo remove after" + ":" + localVariable.get());
        });

        threadOne.start();
        threadTwo.start();
    }
}
