package Programs;

public class starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=5;
		//program 1
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
					}
				System.out.println();
			}	
		
		//program 2
				System.out.println();
			
			for(int i=1;i<=5;i++) {
				for(int j=5;j>=i;j--) {
					System.out.print("*");
					}
				System.out.println();
			}
		

		//program 3
				System.out.println();
				
				
				for(int i=1;i<=5;i++) {
					for(int j=i;j<5;j++) {
						System.out.print(" ");
						}
					for(int k=1;k<=i;k++) {
						System.out.print("*");
					}
					System.out.println();
				}	
				
		//program 4
				System.out.println();
				
				
				for(int i=1;i<=5;i++) {
					for(int j=1;j<i;j++) {
						System.out.print(" ");
						}
					for(int k=i;k<=5;k++) {
						System.out.print("*");
					}
					System.out.println();
				}	
		 
		//program 5 half dimond star
				System.out.println();
				
				
				for(int i=1;i<=5;i++) {
					for(int j=5;j>i;j--) {
						System.out.print(" ");
						}
					for(int k=1;k<=i;k++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				
		//program 6 Dimond star
				System.out.println();
				
				
				for(int i=1;i<=5;i++) {
					for(int j=i;j<5;j++) {
						System.out.print(" ");
						}
					for(int k=1;k<=i;k++) {
						System.out.print("* ");
					}
					System.out.println();
				}	
				
				for(int i=1;i<=5;i++) {
					for(int j=1;j<i;j++) {
						System.out.print(" ");
						}
					for(int k=i;k<=5;k++) {
						System.out.print("* ");
					}
					System.out.println();
				}	
	}

}
