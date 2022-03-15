package COLLECTIONSIR;

import java.util.ArrayList;

public class lifewithoutGeneric {
public static void main(String[] args) {
		
		//Arraylist collection without generics 
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add("String");
		
		//Run time error as object at position 1 is String and you are trying to
		//convert into Integer 
		//Integer it=(Integer) obj.get(1);
		
		
		System.out.println("To handle such type of runtime issue Generic come into picture");
		
		//Arraylist collection which is going to hold String object
		ArrayList<String> t=new ArrayList<String>();  //generics
		//t.add(1); //It try to add interger it will give compilation error
		t.add("String");
		System.out.println(t);
		
	}

}
