package operator;

public class unaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 unaryoperator obj=new unaryoperator();
obj.positive(10);
obj.negative(20);
obj.increment(30);
obj.decrement(40);
obj.Boolean(true);

	}

	public void positive(int a) {
  System.out.println("i am operator to represent positive " + (+a));
	}
	public void negative(int a) {
		  System.out.println("i am operator to represent negative " + (-a));
	}
	public void increment(int a) {
		  System.out.println("i am operator to represent increment " + (++a));  //increase value by 1
	}
	public void decrement(int a) {
		  System.out.println("i am operator to represent decrement " + (--a));  // decrease value by 1
	}
	public void Boolean(boolean a) {
		  System.out.println("i am operator to represent boolean " + (!a));  // represent true or false
	}
}

