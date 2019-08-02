package day13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWord 
{
   public static void main(String[] args) throws IOException 
   {
	   try {
	   System.out.println("Enter name of file:");
	   Scanner sc = new Scanner(System.in);
	   String input = sc.next();
	    
	   File file = new File(input);
	   
	   boolean result  = file.exists();
	   if(result)
	   {
		   System.out.println("File exists");
		  
	   }
	   else {
		   System.out.println("File does not exists...New file created");
		   file.createNewFile();
		   
	   }

	   
	          System.out.println("Enter data to be written to file");
		      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
              String Input = in.readLine();
              PrintWriter out = new PrintWriter(new FileWriter(input));
              out.println(Input);
              out.close();
              
               
              FileReader fr = new FileReader (input);        
              BufferedReader br = new BufferedReader (fr);     
              String line = br.readLine();
              int count = 0;
              while (line != null) {
                 String []parts = line.split(" ");
                 for( String s : parts)
                 {
                   count++;        
                 }
                 line = br.readLine();
              }  
              System.out.println ("No of words in file is " +count); 
              
           
              
              
		   }
		      catch(IOException e) {
		        
		   }
	   
	   
	   
		   
		} // end of main
}// end of FileWord
	  
	   