package day07;

import java.util.Scanner;


public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String choice;
		do {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter name:");
         String name = sc.next();
         System.out.println("you have entered:"+name);
         System.out.println("wish to continue?");
         choice = sc.next();
	}while(!choice.equals("no"));
		System.out.println("thank you:");
}
}
