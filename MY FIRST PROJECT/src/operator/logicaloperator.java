package operator;

public class logicaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		System.out.println(5>10 && 10<12);  //if one relation is false then ans is false
		System.out.println(50>10 && 10<12); //if all relation is true then ans is true
		System.out.println(52>10 && 10<8);  //if one relation is false then ans is false
		System.out.println(5>10 && 10<1);  //if all relation is false then ans is false
		System.out.println(5>10 || 10<12); //if one relation is false then ans is true
		System.out.println(50>10 || 10<12); //if all relation is true then ans is true
		System.out.println(52>10); //if one relation is false then ans is true
		System.out.println(5>10 || 10<1);  //if all relation is false then ans is false
		
	}

}
