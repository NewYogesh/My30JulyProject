package Com.Ecommerce.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_Configuration {

	Properties pro;
	
	public Read_Configuration() {
		
		File Source = new File("C:\\Users\\Yogesh\\eclipse-workspace\\30_July_Automation\\src\\main\\java\\Com\\Ecommerce\\Configuration\\Configure.properties");

		FileInputStream Fis;
		
		try {
			Fis=new FileInputStream(Source);
			
			pro=new Properties();
			
			try {
				pro.load(Fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} 
		catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();
			
		}
	
	}
	
	public String getAppURL() {
		
      	String url = pro.getProperty("BaseURL");
      	
      	return url;
	}
	
    public String getUsername() {
		
      	String Username = pro.getProperty("UserName");
      	return Username;
	}
    
    public String getPassword() {
		
      	String Password = pro.getProperty("Password");
      	return Password;
}
    
    public String getChromePath() {
		
      	String ChromePath = pro.getProperty("ChromePath");
      	return ChromePath;
    }
}
