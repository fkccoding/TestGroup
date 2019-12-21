import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/5/24 12:41
 */
public class Main {
    static final int LINE_NUM = 1024;
    static final int COLUM_NUM = 1024;

    public static void main(String[] args) {
        /*String a = "a" + "b";
        String a1 = a + "c";
        String b = "abc";
        String c = new String("abc");
        String d = new String("abc").intern();
        System.out.println(a1==b);
        System.out.println(a1==c);
        System.out.println(a1==d);*/


        /*float a = 1.0f - 0.9f; float b = 0.9f - 0.8f; float diff = 1e-6f;
        if (Math.abs(a - b) < diff) { System.out.println("true");
        }*/
       /* List<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.add("2");
        for (String item : list) {
//            if ("2".equals(item)) {
////                list.remove(item); }
            System.out.println(item);
        }

        Set<String> set = new TreeSet<>();
        set.addAll(list);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        /*String s1 = "00001001";
        String s2 = String.valueOf(Integer.parseInt("1" + s1) + 1);
        System.out.println(s2.substring(1));

        StringBuffer stringBuffer=new StringBuffer();
        byte b = 01;
        stringBuffer.append(String.format("%03d", b));
        System.out.println(stringBuffer);

        String format = String.format("%0" + s1.length() + "d", Integer.parseInt(s1) + 1);
        System.out.println(format);*/
        // \u000d System.out.println("12");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }
}
