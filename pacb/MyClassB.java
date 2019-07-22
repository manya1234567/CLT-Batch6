package pacb;

import packA.MyClassA;

public class MyClassC extends MyClassA{
	
	
	void accessMyClassA() {
		
		MyClassA obj1 = new MyClassA();
		
		System.out.println(obj1.number1);
		System.out.println(obj1.number2);
		System.out.println(obj1.number3);
		System.out.println(obj1.number4);
		
		
	    }

}

public class MyClassB {

}
