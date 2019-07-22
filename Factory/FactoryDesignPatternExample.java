package Factory;
import java.util.Scanner;

public class FactoryDesignPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Bank:");
        String nameBank = sc.next();
        
        Bank refBank = BusinessLogic.myFactoryMethod(nameBank);
        refBank.offerCreditCard();
	}

}
