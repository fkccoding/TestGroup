class Animal {
	public void eat(){
		System.out.println("�Զ����ֲ��");
	}
	public void sleep(){
		System.out.println("˯��");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("����");
	}
	public void catchMouse(){
		System.out.println("ץ����");
	}
}

public class DuoTaiDemo {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		a.sleep();
		//a.catchMouse();
		Cat c = (Cat)a;
		c.catchMouse();
	}
}