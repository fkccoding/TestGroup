import java.nio.ByteBuffer;

public class Test3 {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        System.out.println("A1 capacity = " + byteBuffer.capacity() + " limit= " + byteBuffer.limit()+ " position= " + byteBuffer.position());
        byteBuffer.put((byte) 125);
        System.out.println("A2 capacity = " + byteBuffer.capacity() + " limit= " + byteBuffer.limit()+ " position= " + byteBuffer.position());
        byteBuffer.put((byte) 126);
        System.out.println("A3 capacity = " + byteBuffer.capacity() + " limit= " + byteBuffer.limit()+ " position= " + byteBuffer.position());
        byteBuffer.put((byte) 127);
        System.out.println("B capacity = " + byteBuffer.capacity() + " limit= " + byteBuffer.limit()+ " position= " + byteBuffer.position());
        byteBuffer.clear();
        System.out.println("C capacity = " + byteBuffer.capacity() + " limit= " + byteBuffer.limit()+ " position= " + byteBuffer.position());
        System.out.println(byteBuffer.get());
        System.out.println("D capacity = " + byteBuffer.capacity() + " limit= " + byteBuffer.limit()+ " position= " + byteBuffer.position());
        System.out.println(byteBuffer.get());
        System.out.println("E capacity = " + byteBuffer.capacity() + " limit= " + byteBuffer.limit()+ " position= " + byteBuffer.position());
        System.out.println(byteBuffer.get());
        System.out.println("F capacity = " + byteBuffer.capacity() + " limit= " + byteBuffer.limit()+ " position= " + byteBuffer.position());
        System.out.println(byteBuffer.get());

        byte[] array = byteBuffer.array();
        for (byte b : array) {
            System.out.print(b + " - ");
        }
    }
}
