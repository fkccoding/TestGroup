import java.util.Scanner;
public class Wenxian {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String[] ss = new String[10];
		System.out.println("�������������ÿո������֧��Ӣ���Զ����򣩣�");
		while(true){
			String str = scanner.nextLine();
			if(str.equals("")){
				//System.out.println("�������������������");
				break;
            } else {
				ss = str.split(" ");
				}
		}
		sort(ss);
		String name = "";
		for (int i=0;i<ss.length;i++){
			if(i<ss.length-1)
				name=name.concat(ss[i])+", ";
			else
				name=name.concat(ss[i]);
		}
		System.out.print("��������ݣ�");
		String year=scanner.nextLine();
		System.out.print("��������������");
		String title=scanner.nextLine();
		System.out.print("����������磺");
		String press=scanner.nextLine();
		System.out.println(name + ", " + year + ", " + title + ", " + press + ".");
	}


	//��ӡ�ַ���
	public static void print(String[] string){
		for (String s:string){
			System.out.print(s+" ");
		}
	}
	public static void print1(String[] string){
		for (int i=0; i<string.length; i++){
			System.out.print(string[i]+" ");
		}
	}

	//��ĸ����
	public static void sort(String[] string){
		for (int i=0; i<string.length; i++){
			for (int j=0; j<string.length-i-1; j++){
				if(string[j].compareTo(string[j+1])>0){
					String temp = string[j];
					string[j] = string[j+1];
					string[j+1] = temp;
				}
			}
		}
	}


}