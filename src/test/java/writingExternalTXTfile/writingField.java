package writingExternalTXTfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writingField {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty("user.dir"));
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\newWritingFile.csv"); // to create and write in csv/html
		//File f = new File("C:\\Users\\DELL\\eclipse-workspace\\newWritingFile.txt"); // to create and write in txt
		FileWriter fw = new FileWriter(f,true); //here true means append =true means it do not overwrite and create new content in same file under previous content
		BufferedWriter writer = new BufferedWriter(fw);
		
		
		writer.write(",");
		writer.write("first lineii");
		writer.newLine();
		writer.write("usernmaeii");
		writer.newLine();
		writer.write("passwordii");
		writer.close();
		
		

	}

}
