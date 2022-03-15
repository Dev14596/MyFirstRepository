package TWO;

public class two {
	
	// instance method which is not return any value
public void m1() {
	System.out.println("i am from m1");
	
}
private void m2() {
	System.out.println("i am from m2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//To call instance variable create object because this is a non static method
		two obj=new two();
		obj.m1();
		obj.m2();
		
	}

}
