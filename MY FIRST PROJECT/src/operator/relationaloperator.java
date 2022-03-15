package operator;

public class relationaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		relationaloperator obj=new relationaloperator ();
		obj.equalto(10, 20);
		obj.greaterthan(20, 25);
		obj.notequalto(25, 10);
		obj.lessthan(25,3);
		obj.greaterthanequalto(58, 100);
		obj.lessthanequalto(15, 58);
	}
		public void equalto(int a,int b) {
			System.out.println("a is equal to b "+ (a==b));
 }
		
		public void notequalto(int a,int b) {
			System.out.println("a is notequal to b "+ (a!=b));
 }
		public void greaterthan(int a,int b) {
			System.out.println("a is greaterthan b "+ (a>b));
 }
		public void lessthan(int a,int b) {
		System.out.println("a is lessthan b "+ (a<b));
}
		public void greaterthanequalto(int a,int b) {
			System.out.println("a is greaterthanequal to b "+ (a>=b));
 }
		public void lessthanequalto(int a,int b) {
			System.out.println("a is lessthanequal to b "+ (a<=b));
 }
		
}
