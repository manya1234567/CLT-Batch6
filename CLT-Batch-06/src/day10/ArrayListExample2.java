package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayListExample2 {
	
	public static void main(String [] args ) {
		String option;
		String name;
		List refList = new ArrayList();
		Scanner sc  = new Scanner(System.in);
		
		
		do {
			System.out.println("Enter name:");
			name = sc.next();
			
			if(refList.contains(name))
		{
				System.out.println("Duplicate username");
			}
		else {
				refList.add(name);
				System.out.println(refList);
			}
			System.out.println("Do you want to continue?");
			option = sc.next();
		
		}while(option.equals("yes"));
		
		} 
		
	}


