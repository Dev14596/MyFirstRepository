package Exception;

public class exceptionPractice {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exceptionPractice obj=new exceptionPractice();
		obj.m1();

	}
	public void m1() {
	m2();
}
	public void m2() {
	m3();
	}
	public void m3() {
		try {
			System.out.println(10/0);
			}catch(ArithmeticException p) {
				System.out.println("Thise block is error solve");
				
				//Throwable class methods 
				p.printStackTrace();   //print without syso (directly)
				 System.out.println(p.toString());    //print syso block only
				System.out.println(p.getMessage());   //print syso block only
		}
		System.out.println("i am last");
	}

}
