package pac2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Makepro {

	public static void main(String[] args) throws IOException {

		String filepath = "C:\\Users\\pgupta\\eclipse-workspace\\maven1\\src\\test\\java\\pac2\\configg.properties";

		Properties prop = new Properties();
		FileInputStream fip = new FileInputStream(filepath);

		prop.load(fip);
		String user = prop.getProperty("username");
			
		String pass= prop.getProperty("username");


		System.out.println(user);
		
		System.out.println(pass);
		
		
		

	}
}
