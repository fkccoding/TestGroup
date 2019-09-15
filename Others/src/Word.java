import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Word {
	public static void main(String[] args) throws Exception {
		System.out.print("请输入人名：");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		do{
			str = bf.readLine();
			if (str.length() == 0){
				System.out.println("输入的是回车！");
			} else {
				System.out.println("输入的内容是："+str);
			}
		}while(str.length() != 0);
	}
}
