import java.util.UUID;

public class Test {
	public static void main(String[] args) {
		/*TestBlock t = new TestBlock();
		System.out.println();
		new TestBlock();*/
		int money = 20;
		int price = 1;
		int count = 0;
		int num = 0;
		while (money != 0) {
			money--;
			num++;
			count++;
			if (count >= 2) {
				num++;
				count = count - 2;
			}
		}
		System.out.println("�����Ժȵ�ƿ: " + num);
	}
	
	
}
class TestBlock{
	public TestBlock(){
		System.out.println("���캯������");
	}

	{
		System.out.println("������������");
	}
	static {
        System.out.println("��̬���������");
    }
}