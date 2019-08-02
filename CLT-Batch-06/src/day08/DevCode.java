package day08;

public class DevCode {
	static void logic (int number) {
		
		try {
			int temp = number/0;
			System.out.println(temp);
			int a[] = {10,20,30,40,50};
			a[50] = 5000;
			System.out.println(a);
		} catch (ArithmeticException Exception ) {
			System.out.println("A number cant be divisible by 0");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("handled array index out of bound exception");
		}
		catch(Exception e) {
			System.out.println("Exception is the super class of all Exception classes");
		}
		finally {
			System.out.println("Closing files....");
		}
	}

}
