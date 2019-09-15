/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-07-16 12:43
 */
public class GCTest {

    private static final int byteSize = 1024 * 1024;
    public static void main(String[] args) {
        byte[] bigSize = new byte[40 * byteSize];
        System.gc();
    }
}
