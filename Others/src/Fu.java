class Fu {
//	Fu(){
//		System.out.println("A Fu run");
//	}
	Fu(int x){
		System.out.println("B Fu run");
	}
}
class Zi extends Fu {
	Zi() {
		super(5);
		System.out.println("C Zi run");
	}
	Zi(int x) {
		super(5);
		System.out.println("D Zi run"+x);
	}
}
