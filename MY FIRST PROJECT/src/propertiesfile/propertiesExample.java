package propertiesfile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesExample {

		public static void main(String[] args) throws FileNotFoundException, IOException {
			// TODO Auto-generated method stub
	
			Properties prop=new Properties();
			prop.load(new FileInputStream("F:\\ellips workspace\\MY FIRST PROJECT\\src\\file.properties"));
			System.out.println(prop.getProperty("browsername"));
		
			
			prop.setProperty("url", "www.facebook.com");
			System.out.println(prop.getProperty("url"));
			
		
		
		FileOutputStream test=new FileOutputStream("F:\\ellips workspace\\MY FIRST PROJECT\\src\\file.properties");
		prop.store(test, "changing new value");
		}

}
   