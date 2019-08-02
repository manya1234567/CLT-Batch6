package day10;

import java.awt.List;

public class ArrayListExample04 {

	public static void main(String[] args) {

          List refList = new ArrayList();
          refList.add("data1");
          refList.add("data2");
          refList.add("data3");
          refList.add("data4");
          
          System.out.println("Iterate using simple for loop");
          for (int i = 0; i < refList.size(); i++) {
			 System.out.println("refList.get(i)");
		}
          
          System.out.println("Iterate using simple for each loop");
          for ( Object object  : refList) {
			System.out.print(object);
		}
			 System.out.println("refList.get(i)");
		
          
	}

}
