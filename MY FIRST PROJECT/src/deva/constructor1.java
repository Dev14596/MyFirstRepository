package deva;

public class constructor1 {
int a;
int b;
boolean c;
	


public constructor1() {
	this(5);
	System.out.println("this is non paramized");
	
}
	public constructor1(int a) {
		System.out.println("this is a paramized");
		this.b=a;
		System.out.println(this.b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
constructor1 obj=new constructor1();
constructor1 obj1=new constructor1(5);



	}

}


	