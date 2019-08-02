package day10;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Customer{
	String name;
	Customer(String name){
		this.name = name;
	}

@Override
public String toString() {
	return name;
}
}// end of customer

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           List refList = new ArrayList();
           refList.add(new Customer("charles"));
           System.out.println("Hashcode  :" + refList.hashCode() );
           refList.add(new Customer("Jerret"));
           System.out.println("Hashcode  :" + refList.hashCode() );
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter name");
           String name = sc.next();
           refList.add(new Customer(name));
           System.out.println(refList);
           
	}

}

