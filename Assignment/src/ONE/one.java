package ONE;

public class one {
	
	public int a;  // non-static variables
	private float b;
	protected double c;
	long d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("This is begining of the program");
 one obj=new one(); //To call instance variables
 obj.a=10;
 obj.b=20f;
 obj.c=30;
 obj.d=40l;
 
 System.out.println("The value of the a " +obj.a);
 System.out.println("The value of the b " +obj.b);
 System.out.println("The value of the c " +obj.c);
 System.out.println("The value of the d " +obj.d); 
 System.out.println("This the end of the program");
 
	}

}
