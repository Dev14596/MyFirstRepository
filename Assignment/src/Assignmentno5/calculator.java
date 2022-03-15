package Assignmentno5;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
 String operation = "mul";

switch(operation) {
case "add":
	System.out.println(a+b);
	break;
case "sub":
	System.out.println(a-b);
	break;
case "mul":
	System.out.println(a*b);
	break;
case "div":
	System.out.println(a/b);
	break;
default:
	System.out.println("enter valid operaton");
}
		
		
	}

}
