package day12;

import java.lang.*;

public class ReservationSynchronised implements Runnable {
	int available = 5;
	int wanted;
	ReservationSynchronised(int i){
		wanted = i;
	}

   Thread t;

  ReservationSynchronised() {
    
      // thread created
      t = new Thread(this, "Admin Thread");
   
      // prints thread created
      System.out.println("thread  = " + t);
      
      // this will call run() function
      t.start();
   }

   public void run() {
      System.out.println("Inside run()function");
   }

   public static void main(String args[]) {
      new ReservationSynchronised();
      ReservationSynchronised r = new ReservationSynchronised(3);
   }
}
