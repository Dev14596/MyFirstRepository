package COLLECTIONSIR;

import java.util.Iterator;
import java.util.TreeSet;

public class Shortedsetexample {
public static void main(String[] args) {
		
		//SortedSet is interface so we cannot create object
		//But luckly it is implemented Treeset
		//Grow of objects represented as single entity where object are store based on some 
		//sorting order --if you don't provide your own sorting order default is ascending 
		
		TreeSet<Integer> obj=new TreeSet<Integer>();
		obj.add(2);
		obj.add(1);
		obj.add(1); //it will not get added as 1 is already present
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(15);
		System.out.println(obj);
		System.out.println(obj.first());//1
		System.out.println(obj.last());//15
		System.out.println(obj.headSet(3));//1,2
		System.out.println(obj.tailSet(3)); //3,4,5,6,15
		//1,2,3,4,5,6,15 ---Set--- Anjir Sweet   //2,3,4,5,6  
		//Partial set --2,3,4,5,6
		System.out.println(obj.subSet(2, 15));//It will retrieve the partial set based on starting and end position 
		
		//DescendingIterator --iterate in descending order
		Iterator<Integer> iterator= obj.descendingIterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()); //15,6,5,4,3,2,1
		}
		System.out.println();
		
		//descendingset--get the set in descending order
		System.out.println(obj.descendingSet());  
	    System.out.println(obj.subSet(2, 5));
		//Ceiling method will only retrive single object --->greater than or equal to the given element
		System.out.println(obj.ceiling(3)); //3
		System.out.println(obj.ceiling(7)); //15
		System.out.println(obj.ceiling(17));//null ---if collection doesn't have equal or greater object

		//Floor method will only retrive single object --->less than or equal to the given element
		System.out.println(obj.floor(3));
		System.out.println(obj.floor(7));
		System.out.println(obj.floor(-17));
		
		//Higher method will only retrive single object --->greater than given element
		System.out.println(obj.higher(3));
		//Lower method will only retrive single object --->less than given element
		System.out.println(obj.lower(3));
		
		System.out.println(obj.pollFirst()); //it will retrieve and delete first element from collection
		System.out.println(obj);
		System.out.println(obj.pollLast()); //it will retrieve and delete last element from collection
		System.out.println(obj);
	}
}
