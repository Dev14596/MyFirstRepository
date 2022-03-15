package COLLECTIONSIR;

import java.util.HashSet;
import java.util.Iterator;

public class newhashsetexample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> obj=new HashSet<String>();
		obj.add("First icecream");
		obj.add("Second icecream");
		obj.add("Third icecream");
		obj.add("First icecream"); //duplicate object---it will overwrite the existing object
		System.out.println(obj);
		System.out.println("I am coping obj collection in another collection");
		//Explicit casting ---Non-Primitive 
		HashSet<String> obj1=(HashSet<String>) obj.clone(); //cloneable markerup interface 
		System.out.println(obj1);
		obj.remove("Second icecream");
		System.out.println(obj);
		System.out.println(obj1);
		obj1.remove("Second icecream");
		Iterator<String> iterator=obj.iterator();
		while(iterator.hasNext()){//false 
			System.out.println(iterator.next());  //obj.get(0)
		}
		

	}

}
