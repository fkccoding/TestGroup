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
		System.out.println("最多可以喝到瓶: " + num);
	}
	
	
}
class TestBlock{
	public TestBlock(){
		System.out.println("构造函数运行");
	}

	{
		System.out.println("构造代码块运行");
	}
	static {
        System.out.println("静态代码块运行");
    }
}