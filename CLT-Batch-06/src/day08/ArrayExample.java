package day08;

import java.util.Scanner;

class Person{
	
	
	int id;
	String name;

	
public int getId() {
	    return id;
	  }
 public void setId (int id)
 
 {
	 this.id = id;
 }
 
 public String getName() {
	    return name;
	  }
public void setName (String name)

{
	 this.name = name;
}
}
class ArrayExample{
	public static void main(String[] args) {
	/*
		String str[] = {"Physics","Chemistry"};
		for (int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}

		for (String temp : str) {
			System.out.println(temp);
			
		}
	*/
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("how many records do you want to enter:");
		int number = sc.nextInt();
	Person pRef[] = new Person[number];
	for (int i = 0; i < pRef.length; i++) {
		System.out.println("Enter your id");
		int id= sc.nextInt();
		System.out.println("enter your name");
		String name= sc.next();
		Person p = new Person();
		p.setName(name);
		p.setId(id);
		pRef[i] = p;
		
		
		}
	for (Person person : pRef) {
		System.out.println(person.getId()+ " "+person.getName());
		
		
	}
	}
}


