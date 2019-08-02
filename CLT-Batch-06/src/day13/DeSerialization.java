package day13;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeSerialization {

	public static void main(String[] args) {
		

		SerializationDemo e = null;
		try {
			FileInputStream fileIn = new FileInputStream("david.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (SerializationDemo) in.readObject();
			in.close();
			fileIn.close();
		}
		catch(IOException i) {
			i.printStackTrace();
			return;
		}
		catch(ClassNotFoundException c){
			System.out.println("Serialization class not found");
			c.printStackTrace();
			return;
			
		}
		System.out.println("DeSerialization player..");
		System.out.println("name:" +e.name);
		System.out.println("address" + e.city);
		System.out.println("number" + e.mobile);
		System.out.println("age" + e.age);
	}

}
