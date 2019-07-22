package Factory;

public class BusinessLogic {
	public static Bank myFactoryMethod(String reference) {
    
	if (reference.equals("DBS")) {
		
		return new DBSBank();
	} else if (reference.equals("citi")) {
		
		return new DigiBank();
		}
	else return new OtherBank();
	
}// end of myFactoryMethod
}// end of BusinessLogic
