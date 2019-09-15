/**
 *   ≈‰∆˜ƒ£ Ω
 */
interface USB{
	public void open();
	public void close();
}


public class BookPC {
	public static void main(String[] args) {
		useUSB(new UPan());
		useUSB(new UsbMouse());
		
	}

	public static void useUSB(USB u){
		u.open();
		u.close();
	}
}

class UPan implements USB{
	public void open(){
		System.out.println("Upan open");
	}
	public void close(){
		System.out.println("Upan close");
	}
}

class UsbMouse implements USB{
	public void open(){
		System.out.println("UsbMouse open");
	}
	public void close(){
		System.out.println("UsbMouse close");
	}
}