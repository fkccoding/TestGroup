import java.util.Scanner;
public class 按回车结束输入 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Scanner scanner = new Scanner(System.in);
		String[] ss = new String[10];
		while(true){
			String str = scanner.nextLine();
			if(str.equals("")){
				//System.out.println("——————程序结束");
				break;
            } else {
				ss = str.split(" ");
				}
		}
	}
}
