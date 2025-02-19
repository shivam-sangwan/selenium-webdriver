package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Tc3_Reading_Properties_File {

	public static void main(String[] args) throws IOException {
		
		//opening config.properties from its location
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//Test_Data//config.properties");

		//creating obj of properties class of java
	    Properties peopertiesobj = new Properties();
	    peopertiesobj.load(file);  //loading data of properties file using properties object
	    
	    //Reading data from from properties file
	    String url = peopertiesobj.getProperty("appurl");  //return the value for appurl(key) from properties file
	    String username = peopertiesobj.getProperty("username"); 
	    String password = peopertiesobj.getProperty("password");
	    
	   //now we can use these url,password in our main code
	    System.out.println(url+ " " + username + " " + password);
	    file.close(); //closing config.properties file
	    
	    
	   //need of config file: if config file was not there and and we have used get(url)
	   //or login method at many places in code..then in future if there is any change in password/url
	   //then we have to do changes at all those places
	   //now we just have to change the config file
	    


	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//	    
//	    //reading keys from properties file
//	    //all keys are stores in set
//	    Set<Object> keys = peopertiesobj.keySet();
//	    System.out.println(keys);
//	    
//	    //reading all values from properties file
//	    Collection<Object> val = peopertiesobj.values();
//	    System.out.println(val);
//	    
	}

}
