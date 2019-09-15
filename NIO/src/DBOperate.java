public class DBOperate implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("关闭连接");
    }

    public static void main(String[] args) {
        try (DBOperate dbOperate = new DBOperate()){
            System.out.println("use " + dbOperate + "开始数据库的操作");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
