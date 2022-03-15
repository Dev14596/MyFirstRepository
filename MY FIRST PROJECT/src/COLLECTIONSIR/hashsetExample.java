package COLLECTIONSIR;

import java.util.HashSet;

public class hashsetExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> obj=new HashSet<String>();
		obj.add("TEst");
		obj.add("TEsting");
		obj.add("TEstig");
		obj.add("TEstig");
		HashSet<String> obj1=(HashSet<String>) obj.clone();
		obj.remove("TEst");
		System.out.println(obj1);
		System.out.println(obj);
		
		
	}
}
