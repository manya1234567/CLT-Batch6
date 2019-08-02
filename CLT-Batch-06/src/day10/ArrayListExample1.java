package day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		List refList = new ArrayList();
		refList.add("hello");
		
		refList.add(60);
		refList.add(new User("charles"));
		
		for (Object temp : refList) {
			System.out.print(temp);
		} 
	}

}
 class User{
	 String name;
	 public User(String string) {
		 name = string;
	 }
	
	 
	 public String toString() {
		 return name;
	 }
 }
