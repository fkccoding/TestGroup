import java.util.Scanner;
public class ���س��������� {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Scanner scanner = new Scanner(System.in);
		String[] ss = new String[10];
		while(true){
			String str = scanner.nextLine();
			if(str.equals("")){
				//System.out.println("�������������������");
				break;
            } else {
				ss = str.split(" ");
				}
		}
	}
}
