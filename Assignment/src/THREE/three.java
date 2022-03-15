package THREE;

public class three {

	public static void m1() {
		System.out.println("I am from m1");
	}
	
	protected static void m2() {
		System.out.println(" I am from m2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// To call instance variable direct because this is a static method
		m1();
		m2();
	}

}
