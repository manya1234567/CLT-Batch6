package day13;

import java.io.BufferedReader;

public class Reader2 {
	public static void main(String[ ]args) {
		FileReader frRef;
		try {
			FileReader frRef = new FileReader("sample.txt");
			BufferedReader br = new BufferedReader(frRef);
			String s;
			 while((s = br.readLine()) !=null) {
				 System.out.print(s);
			 }
		} // end of try
	}catch ()

}
