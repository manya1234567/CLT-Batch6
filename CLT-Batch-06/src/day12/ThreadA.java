package day12;

public class ThreadA extends Thread {
@Override

 public void run() {
	System.out.print("Thread is running hill..");
}
	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		Thread t = new Thread(ta);// We create object of Thread class
		// ta.start() is not a good practice
		t.start(); // once we call start(), it invokes run() automatically
		// ta.run(); // not a good practice
		//t.run() not a good practice
		
	}

}
