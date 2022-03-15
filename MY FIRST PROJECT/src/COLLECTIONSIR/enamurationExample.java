package COLLECTIONSIR;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;



public class enamurationExample {
public static void main(String[] args) {
		
		//Creating vector collection having name obj
		Vector<String> obj=new Vector<String>();
		//Adding some object in collection
		obj.add("First icecream");
		obj.add(1, "Second icecream");
		obj.addElement("Third icecream");
		obj.add("First icecream");
		
		//If you want to retrive objects from collection one by one we use cursors
		// Enumeration is one of the cursor
		 Enumeration<String> enumerationobj  =obj.elements();
		 System.out.println("Iteration through Enumeration interface------");
		 // enumaration is holding total three object
		 while (enumerationobj.hasMoreElements()) { //Checking whether collection has element
			 System.out.println(enumerationobj.nextElement()); //if element is present then retrive it
		 }
		 System.out.println(obj);
		 //Another way to retrieve object one by one from collection
		 //we can use iterator method of collection interface
		 System.out.println("Iteration through iterator interface------");
		Iterator<String> iteratorobj=obj.iterator();
		 //Checking whether collection has element
		while(iteratorobj.hasNext()) {
			//if element is present then retrive it
			System.out.println(iteratorobj.next());
			iteratorobj.remove(); //Remove is additional method in Iterator interface
		}
		System.out.println(obj);
		
		
	}
}
