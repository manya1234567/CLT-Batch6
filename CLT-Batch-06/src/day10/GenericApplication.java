package day10;
//List<T> interface
interface Book<Programming>{ // Java is type of book
	void showDetails(Programming pRef); //void add (T ref)
} // end of book

       class CoreJava<Java> implements Book<Java>{  //ArrayList<T> implements List<T>

                       @Override
                       public void showDetails(Java jRef) { //50     //void add (T ref)    
	
	                        System.out.println(jRef); //50
                                                          }// end of ShowDetails
                                                  }//end of CoreJava

public class GenericApplication {

	public static void main(String [] args) {
		
		//int price = 50;
		Integer price = 60; //wrapper class
		CoreJava<Integer> ref1 = new CoreJava<Integer>();
		ref1.showDetails(price);
		
		String name = "Complete Reference";
		CoreJava<String> ref2 = new CoreJava<String>();
		ref2.showDetails(name);
		
		
		Person pRef = new Person();
		pRef.setName(name);
		CoreJava<Person> ref3 = new CoreJava<Person>();
		ref3.showDetails(pRef);
	}
}

class Person{
	
	String name;
	public void setName(String name) {
		this.name = name;
	}
}