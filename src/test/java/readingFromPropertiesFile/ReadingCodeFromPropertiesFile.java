package readingFromPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingCodeFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));		//to get the current directory of the current project. to help iin when we shift the code ffrom one system to another
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\readingFromPropertiesFile\\File.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("USERNAME"));
		System.out.println(prop.getProperty("PASSWORD"));
		System.out.println(prop.getProperty("TestingWebsite"));
	}

}
