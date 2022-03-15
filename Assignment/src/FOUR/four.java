package FOUR;

public class four {

	
	// instance method which is not return any value
	public void m1(int a) {
		System.out.println(a);
		
	}
	private void m2(int b) {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To call instance variable create object because this is a non static method
			four obj=new four();
				obj.m1(10);
				obj.m2(20);
					
	}

}
