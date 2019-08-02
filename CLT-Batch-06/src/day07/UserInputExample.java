package day07;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInput{
	
	void userAccess() throws IOException {
		
		BufferedReader brRef = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter a character");
		//char c = (char) brRef.readLine().charAt(2);
		//System.out.println(c);
		System.out.println("Enter a number:");
		String number = brRef.readLine(); 
		int num1 = Integer.parseInt(number); // integer is wrapper class
		System.out.println("you have entered:"+num1);
		
	}
}
public class UserInputExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        UserInput ref = new UserInput();
        ref.userAccess();
	}

}
