import java.nio.ByteBuffer;

public class Test5_1 {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 4, 5, 6, 7};
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.position(9);
        buffer.put(bytes, 0, 3);

    }
}
