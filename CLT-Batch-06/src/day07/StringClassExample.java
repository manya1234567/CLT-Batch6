package day07;

public class StringClassExample {
	
	String ref1 = "Python";
    String ref2 = "Python";
    String ref3 = "Java";

     void scenario1() {
    	 
    	 if(ref1 == ref2) {
    		 System.out.println("SAME");
     }else
     {
    	 System.out.println("NOT SAME");
     }
    	 
    	 
     }//end of scanario1
     
     
     
void scenario2() {
    	 
    	 if(ref1.equals(ref2)) {
    		 System.out.println("SAME");
     }else
     {
    	 System.out.println("NOT SAME");
     }
    	 
    	 
     }//end of scanario1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	StringClassExample StringClassExample = new StringClassExample();
    StringClassExample.scenario1();
    StringClassExample.scenario2();
    
}
}