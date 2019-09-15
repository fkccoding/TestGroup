import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class Test16 {
    public static void main(String[] args) {
        ByteBuffer buffer1 = ByteBuffer.wrap(new byte[]{'a','b','c'});
        ByteBuffer buffer2 = ByteBuffer.wrap(new byte[]{'x','y','z'});
        ByteBuffer buffer3 = ByteBuffer.wrap(new byte[]{'1','2','3'});
        List<ByteBuffer> list = new ArrayList<>();
        list.add(buffer1);
        list.add(buffer2);
        list.add(buffer3);
        ByteBuffer[] byteBuffers = new ByteBuffer[list.size()];
        list.toArray(byteBuffers);
        System.out.println(byteBuffers.length);
        for (ByteBuffer byteBuffer : byteBuffers) {
            while (byteBuffer.hasRemaining()) {
                System.out.print((char)byteBuffer.get());
            }
//            System.out.println();
        }
    }


}
