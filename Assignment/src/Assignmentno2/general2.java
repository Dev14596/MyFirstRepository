package Assignmentno2;

public class general2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		general2 obj=new general2();
		obj.multi(10, 20); //This is a non-static method hence call through object

	}
	
	public void multi(float a,float b) {
	System.out.println("multiplication of two no. is " + (a*b));
	}
}
