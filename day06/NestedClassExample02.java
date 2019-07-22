package day06;

public class NestedClassExample02 {
	

	
		class MyInnerClass1       //non-static inner class
		{
			void method1()
			{
				System.out.println("I am in InnerClass1 ==> myMethod1 ");
			}
			/*
			 * static void method2() //compilation error we cannot write static method in
			 * non static inner class {
			 * 
			 * }
			 */
		}//end of my innerclass1
		
		static class MyInnerClass2   //static inner class
		{
			void method3()
			{
				System.out.println("I am in InnerClass2 ==> myMethod3 ");
			}
			static void method4()
			{
				System.out.println("I am in InnerClass2 ==> myMethod4 ");
			}
		}//end of myinnerclass2
		
		void access()  
		{
			class MyInnerClass3   //method local inner class
			{
				void method5()
				{
					System.out.println("I am in InnerClass3 ==> myMethod5 ");
				}
				/*
				 * static void method6() //compilation error because we cannot write static
				 * method inside non static inner class {
				 * 
				 * }
				 */
			}//end of MyInnerclass3
			MyInnerClass3 refMyInnerClass3 = new MyInnerClass3();
			refMyInnerClass3.method5();
		}//end of access
		
		void methodObject()
		{
			MyInnerClass1 refMyInnerClass1 = new MyInnerClass1();
			MyInnerClass2 refMyInnerClass2 = new MyInnerClass2();
			refMyInnerClass1.method1();
			refMyInnerClass2.method3();
			MyInnerClass2.method4();
			
		}
		public static void main(String[] args) {
			
			NestedClassExample02 refNestedClassExample02 =new NestedClassExample02();
			refNestedClassExample02.methodObject();
			refNestedClassExample02.access();
			
		}
	}


