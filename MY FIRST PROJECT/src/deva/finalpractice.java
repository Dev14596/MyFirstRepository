package deva;

public class finalpractice {
public final float pi;
public static final int p;
	
finalpractice(){
	pi=3.14f;
}
 static {
	System.out.println("i am static block");
	p=10;
}
public static void main(String[] args) {
		
finalpractice obj=new finalpractice();
//obj.pi=45;
System.out.println(obj.pi);
	}

}
