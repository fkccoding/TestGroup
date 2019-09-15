import java.util.Scanner;
public class Wenxian {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String[] ss = new String[10];
		System.out.println("请输入人名（用空格隔开，支持英文自动排序）：");
		while(true){
			String str = scanner.nextLine();
			if(str.equals("")){
				//System.out.println("——————程序结束");
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
		System.out.print("请输入年份：");
		String year=scanner.nextLine();
		System.out.print("请输入文献名：");
		String title=scanner.nextLine();
		System.out.print("请输入出版社：");
		String press=scanner.nextLine();
		System.out.println(name + ", " + year + ", " + title + ", " + press + ".");
	}


	//打印字符串
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

	//字母排序
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