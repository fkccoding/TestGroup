import java.nio.ByteBuffer;

public class Test1_2 {
    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1900000000);
        for (int i = 0; i < 1900000000; i++) {
            byteBuffer.put((byte) 123);
        }
        System.out.println(System.currentTimeMillis() - beginTime);

    }
}
