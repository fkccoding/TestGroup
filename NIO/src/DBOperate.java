public class DBOperate implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("�ر�����");
    }

    public static void main(String[] args) {
        try (DBOperate dbOperate = new DBOperate()){
            System.out.println("use " + dbOperate + "��ʼ���ݿ�Ĳ���");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
