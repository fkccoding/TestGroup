import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Word {
	public static void main(String[] args) throws Exception {
		System.out.print("������������");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		do{
			str = bf.readLine();
			if (str.length() == 0){
				System.out.println("������ǻس���");
			} else {
				System.out.println("����������ǣ�"+str);
			}
		}while(str.length() != 0);
	}
}
