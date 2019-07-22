package day06;

//DB connection Class would be our Singleton Class
class SingletonClass{
	
	private static SingletonClass ref; // null==> point to some memory location
	
	private SingletonClass() { //private constructor
		System.out.print("hello");
	}


public static SingletonClass getMethod() {
	
	
	if (ref==null) {
		ref = new SingletonClass();
	}
	return ref;
} //end of getMethod
}//end of SingletonClass

public class SingletonDesignPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SingletonClass.getMethod();
SingletonClass.getMethod();
SingletonClass.getMethod();
SingletonClass.getMethod();
	}

}
