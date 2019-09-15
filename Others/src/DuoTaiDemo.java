class Animal {
	public void eat(){
		System.out.println("吃动物或植物");
	}
	public void sleep(){
		System.out.println("睡觉");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("吃鱼");
	}
	public void catchMouse(){
		System.out.println("抓老鼠");
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