package Strings;

public class StringMethods {
public static String var="TESTING";
public static String var1="testing";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(var.length());       // calculate length. //7
		System.out.println(var1.length());   // calculate length.   //7
		System.out.println(var.charAt(5));    //Check position and print word.   //N
		System.out.println(var1.charAt(3));   //Check position and print word.  //t
		System.out.println(var.isEmpty());  //check empty or not.   //false
		System.out.println(var.equals(var1));  //check equal or not var=var1 it is a case sensitive.  //false
		System.out.println(var.equalsIgnoreCase(var1));  //check and ignore case its a small or big.  //true
		System.out.println(var.startsWith("TES"));  // check starting    //true
		System.out.println(var.endsWith("ing"));     // check ending.    //false
		System.out.println(var.contains("te"));    //check contain available or not.   //false
		System.out.println(var.toLowerCase());  //all uppercase word convert into lowercase.   //TESTING-->testing
		System.out.println(var1.toUpperCase());   //all lowercase word convert into uppercase.   //testing--->TESTING
		System.out.println(var.toLowerCase().startsWith("tes"));  //method chaining.   //TESTING---.testing--->true
		
		
		String var3=var.concat(" software ");      //add two string using concat.    //TESTING software
		System.out.println(var3);  
		
		
		System.out.println(var.replace("TEST","SMOK"));   //covert TEST--->SMOKE
		
		
		String var4="    devendra is a good boy and smart   ";
		
		
		System.out.println(var4.split("s")[0]);  //split the word into parts // devendra i
		System.out.println(var4.trim());  //remove the space prifix and suffix.
		System.out.println(var.indexOf("S"));  //  check index of word //2
		System.out.println(var.indexOf(84)); // ascii value of T so print output 0 for T index //0
		System.out.println(var.lastIndexOf("I"));// check right to left //4
		System.out.println(var.substring(0, 4));//cutting word 0 - size-1
		
		
	
	
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
