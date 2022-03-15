package COLLECTION;
import java.util.*;
public class stackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> obj=new Stack<String>();
		obj.push("devendra");
		obj.push("bhanudas");
		obj.push("patil");
		
		Iterator<String> p=obj.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
		obj.pop();
		System.out.println(obj);

		obj.peek();
		System.out.println(obj);
		
	
		System.out.println(obj.empty());
		
		System.out.println(obj.search("devendra"));
	}
	

}
