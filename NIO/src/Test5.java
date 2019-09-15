import java.nio.ByteBuffer;

public class Test5 {
    public static void main(String[] args) {
        byte[] byteArray1 = {1, 2, 3, 4, 5, 6, 7, 8};
        byte[] byteArray2 = {55, 66, 77, 88};
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.put(byteArray1);
        byteBuffer.position(2);
        byteBuffer.put(byteArray2, 1, 3);
        System.out.print("A = ");
        byte[] getByte = byteBuffer.array();
        for (byte b : getByte) {
            System.out.print(b + " ");
        }
        System.out.println();

        byteBuffer.position(2);
        byte[] byteArrayOut = new byte[byteBuffer.capacity()];
        byteBuffer.get(byteArrayOut, 3, 6);
        System.out.print("B = ");
        for (byte b : byteArrayOut) {
            System.out.print(b + " ");
        }
    }
}
