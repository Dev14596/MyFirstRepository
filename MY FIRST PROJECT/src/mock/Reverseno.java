package mock;

public class Reverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=1358;
 int r=0;
while(n!=0) {
	int b=n%10;
	r=r*10+b;
	n=n/10;
}

System.out.println(r);

}
	
}
