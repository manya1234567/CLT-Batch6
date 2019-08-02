package day12;

class ThreadExample extends Thread 
{ 
    @Override
    public void run() 
    { 
        for (int i = 0; i < 5; i++) 
        { 
            try
            { 
                Thread.sleep(500); 
                System.out.println("Current Thread: "+ Thread.currentThread().getName()); 
            } 
  
            catch(Exception ex) 
            { 
                System.out.println("Exception has" + " been caught" + ex); 
            } 
            System.out.println(i); 
        } 
    } 
} 
  
class ThreadB
{ 
    public static void main (String[] args) 
    { 
  
        
        ThreadExample t1 = new ThreadExample(); 
        ThreadExample t2 = new ThreadExample(); 
        ThreadExample t3 = new ThreadExample(); 
        
  
       
        t1.start(); 
  
        
        try
        { 
            System.out.println("Current Thread: "+ Thread.currentThread().getName()); 
            t1.join(); 
        } 
  
        catch(Exception ex) 
        { 
            System.out.println("Exception has " + "been caught" + ex); 
        } 
  
        // t2 starts 
        t2.start(); 
  
        // starts t3 after when thread t2 has died. 
        try
        { 
            System.out.println("Current Thread: " + Thread.currentThread().getName()); 
            t2.join(); 
        } 
  
        catch(Exception ex) 
        { 
            System.out.println("Exception has been" + " caught" + ex); 
        } 
  
        t3.start(); 
    } 
} 