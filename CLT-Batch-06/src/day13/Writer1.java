package day13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer1 {

	public static void main(String[] args) {
		try {
		File f = new File("abcxyz.doc");
		System.out.print(f.exists());
		boolean newFile = false;
	    newFile = f.createNewFile();
		System.out.println(newFile);
		System.out.println(f.exists());
		
	
		
		FileWriter fx = new FileWriter("abcxyz.doc");
		BufferedWriter br = new BufferedWriter(fx);
		
		br.write("this is filewriter");
		br.newLine();
		br.write("thank you");
		br.newLine();
		br.write("Java");
		br.newLine();
		
		br.close();
		}
		catch(IOException e) {
			
		}
		
		
		
	}

}
