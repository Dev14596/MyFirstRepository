package operator;

public class Arithmaticoperator {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Arithmaticoperator obj=new Arithmaticoperator();
obj.add(2 , 3);
obj.sub(5 , 6);
obj.multi(2,8);
Arithmaticoperator.div(203,10);
Arithmaticoperator.modulous(17,2);
	}
 public void add(int a,int b) {
	 System.out.println("this is + operator test " + (a+b));
}
 public void sub(int a,int b) {
	 System.out.println("this is - operator test " + (a-b));
 }
 public void multi(int a,int b) {
	 System.out.println("this is * operator test " + (a*b));
 }
 public static void div(int a,int b) {
	 System.out.println("this is / operator test " + (a/b));
 }
 public static void modulous(int a,int b) {
	 System.out.println("this is % operator test " + (a%2));
 }
}