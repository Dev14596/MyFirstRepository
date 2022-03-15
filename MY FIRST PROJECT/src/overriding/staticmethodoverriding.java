package overriding;

public class staticmethodoverriding {
	
	public static void m1() {
		System.out.println("i am from parents");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childclassoverriding obj=new childclassoverriding();
		obj.m1();
		staticmethodoverriding obj1=new staticmethodoverriding();
		obj1.m1();
		staticmethodoverriding obj2=new childclassoverriding();
		obj2.m1();


	}

}
class childclassoverriding extends staticmethodoverriding{
	
	public static void m1() {
		System.out.println("i am from child");
	}
	
	
}
