package COLLECTIONSIR;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorExample {
public static void main(String[] args) {
		
		ArrayList<String> obj=new ArrayList<String>();
		//All objects are type String
		obj.add("first"); //first object  0
		obj.add("SECOND"); //second object 1
		obj.add("third");//2
		obj.add("fourth");
		obj.add("fifth");
		
		//If i want to print all the object of collection within in one goal
		System.out.println(obj);
		
		//If i want to access specific object
		String var=obj.get(1);
		
		//get(0)
		//get(1)
		
		// Performing lower case operation on second object
		System.out.println(var.toLowerCase());
		
		//When you have to do some operation across the collection
		//We write object one by one 
		
		Iterator iterator=obj.iterator();
		while(iterator.hasNext()){//false 
			System.out.println(iterator.next());  //obj.get(0)
		}
		
		System.out.println("-----------Old Style-----------------");
		
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
		
	}
}
