import org.omg.CORBA.OBJ_ADAPTER;

/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-07-16 20:54
 */
public class TestEscape {
    private static Object object;

    public void varEscape(){
        object = new Object();
    }

    public Object methodEscape(){
        return new Object();
    }

    public static void alloc(){
        String a = new String("a");
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            alloc();
        }
        System.out.println(System.currentTimeMillis() - start);

    }
}
