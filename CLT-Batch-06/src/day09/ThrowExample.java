package day09;

class User extends Throwable{
	
	static void validateAge(int age) {
		if (age<18) {
			User refUser = new User();
			try {
		    throw refUser;
		} catch (User e) {
			System.out.println("Age cannot be less than 18");
		}
	}
}
}

public class ThrowExample {

	public static void main(String[] args) {
		User.validateAge(10);
	}

}
