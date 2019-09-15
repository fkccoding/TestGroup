import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class Test1 {
    public static void main(String[] args) {
        /*char[] chars = new char[]{'a','b','c','d','e'};
        CharBuffer buffer = CharBuffer.wrap(chars);
        System.out.println("capacity = " + buffer.capacity() + " limit = " + buffer.limit());
        buffer.limit(2);
        System.out.println();
        System.out.println("capacity = " + buffer.capacity() + " limit = " + buffer.limit());
        buffer.put(1,'y');*/
        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(100);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(200);
        System.out.println("bytebuffer1 "+ byteBuffer1 + byteBuffer1.isDirect());
        System.out.println("bytebuffer2 "+ byteBuffer2 + byteBuffer2.isDirect());
    }
}
