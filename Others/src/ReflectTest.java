import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-08-15 14:52
 */
public class ReflectTest {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("ReflectTest.Tests");
            Class[] cl=new Class[]{int.class,int.class};
            Constructor constructor = clazz.getConstructor(cl);

            Object[] x={new Integer(33),new Integer(67)};

            Object o = constructor.newInstance(x);

        } catch (ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    class Tests {
        public Tests(int x, int y) {
            System.out.println(x + "    " + y);
        }
    }

}
