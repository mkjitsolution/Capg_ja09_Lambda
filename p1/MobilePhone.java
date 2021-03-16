package p1;

// approach 1
class JBL implements Bluetooth {

	@Override
	public int shareFile(String fileName) {
		// TODO Auto-generated method stub
		return 0;
	}

}

// approach 2
class Laptop {
	public void doThings() {
		Bluetooth abc = new Bluetooth() {

			@Override
			public int shareFile(String fileName) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		int length = abc.shareFile("abc.jpg");
	}
}

// appraoch 3 from java 8 onwards
public class MobilePhone {

	public void doShare(String fileName) {
		// approach A
		Bluetooth bt1 = (String f) -> {
			// code to share the file
			int x = f.length() + 800;
			return x;

		};
		int length = bt1.shareFile("abc.jpg");

		// approach B
		Bluetooth bt2 = (f) -> {
			// code to share the file
			int x = f.length() + 800;
			return x;

		};
		int length2 = bt2.shareFile("abc.jpg");

		// approach C
		Bluetooth bt3 = (f) -> f.length() + 800;
		int length3 = bt3.shareFile("abc.jpg");

		// approach D
		Bluetooth bt4 = f -> f.length() + 800;
		int length4 = bt4.shareFile("abc.jpg");
		
		// ---------------------------------
		
		ABC abc = (a,b)->10;

	}// end of doShare

}// end class Mobile Phone
















