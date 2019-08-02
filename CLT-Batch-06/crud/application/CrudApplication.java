package application;
import controller.AdminController;


public class CrudApplication {

	public static void main(String[] args) {
		
        AdminController adminController = new AdminController();
        adminController.adminProcess();
	}

}
