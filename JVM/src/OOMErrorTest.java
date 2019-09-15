/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-07-17 11:12
 */
public class OOMErrorTest {
    public static void main(String[] args) {
        String name = "xdclass";
        while (true) {
            name += name;
            System.out.println(name);
        }
    }
}
