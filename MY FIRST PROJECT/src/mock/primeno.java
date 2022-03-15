package mock;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;	
		
		System.out.println("print prime no till : " + n);
    int i=2;
    while(i<n) {
	 
	  i++;
	  if(n%i==0) {
		
		  break;
		   
	  }
	
	
  }
		
  System.out.println(i);
		
		
	}

}
