package COLLECTION;
import java.util.*;

public class vectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> obj=new Vector<String>();
		obj.addElement("devendra");
		obj.addElement("bhanudas");
		obj.addElement("patil");
		
		Iterator<String> p=obj.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
			
			
			
		}
		
	}

}
