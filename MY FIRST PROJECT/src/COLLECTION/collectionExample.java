package COLLECTION;

import java.util.ArrayList;

public class collectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Object> obj=new ArrayList<Object>();
		obj.add(2);
		obj.add(1, "dev");
		obj.add("bhanudas");
System.out.println(obj);
	ArrayList <String> obj1=new ArrayList<String>();
	obj1.add("testing");
	obj1.add("engineer");
	obj1.add("automation");
       
	obj.addAll(obj1);
        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.contains("testing"));
        System.out.println(obj.containsAll(obj1));
        System.out.println(obj);
        System.out.println(obj.remove(1));
        System.out.println(obj);
        System.out.println(obj.removeAll(obj1));
        
	}

}
