package Strings;

public class StringBufferMethod {
	
public static String sc="I am a mechanical enginner";


	public static void main(String[] args) {
		
			StringBuffer obj=new StringBuffer(sc);
			System.out.println(obj.length());  // check length. //26
			System.out.println(obj.append(" As A Quality engneer"));  //join the words or number or boolean or etc.
			System.out.println(obj.delete(0, 1));  //delet the word start index to size-1
			System.out.println(obj.deleteCharAt(4));  //delet index word
			System.out.println(obj.insert(5, " patil"));   //insert patil at 5 index
			System.out.println(obj.replace(4, 10, " Narenrda modi"));  //replece the word index 4 to 10
			
			
			System.out.println(obj.reverse());
			System.out.println(obj.length());
	}

}
