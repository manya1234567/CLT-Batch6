package day13;
import java.io.*;

public class Reader1 {

	public static void main(String[] args) throws IOException {
		DataInputStream in = null;
		try {
			FileInputStream fs = new FileInputStream("sample.txt");
			in = new DataInputStream(fs);
			BufferedReader br= new BufferedReader(new InputStreamReader(in));
			String str;
			while((str = br.readLine()) != null) {
				System.out.print(str);
				
				
			}
		}
			
			catch(Exception e)
			{
				System.out.print("File not found");
			}
			finally {
				in.close();
			         }
		}
	
}

