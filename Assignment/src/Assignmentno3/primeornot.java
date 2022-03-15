package Assignmentno3;

public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
boolean prime=true;
for(int a=2;a<n;a++) {
	if(n%a==0) {
		prime=false;    
		break;
		
	}
}
System.out.println(prime);
	}

}
