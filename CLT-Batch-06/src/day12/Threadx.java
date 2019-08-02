package day12;

class Threadx
{
    public static void main(String[] args)
    {
        Reservation reserve = new Reservation(); 
        Person thread1 = new Person(reserve, 5); 
        thread1.start();
        Person thread2 = new Person(reserve, 4);
        thread2.start();
        Person thread3 = new Person(reserve, 2);
        thread3.start();
    }
}

class Reservation
{

    static int availableSeats = 5;

    synchronized void reserveSeat(int requestedSeats) 
    {
       
        System.out.println("Availableseats : " + availableSeats + "\n Requestedsetas : " + requestedSeats);
        if (availableSeats >= requestedSeats)
        {
            System.out.println("Seat Available. Reserve now :-)");
            try
            {
                Thread.sleep(100);   
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted");
            }
            System.out.println(requestedSeats + " seats reserved.");
            availableSeats = availableSeats - requestedSeats;
        }
        else
        {
            System.out.println("Requested seats not available :-(");
        }
        System.out.println(Thread.currentThread().getName() + " leaving.");
        
    }
}

class Person extends Thread
{

    Reservation reserve;
    int requestedSeats;

    public Person(Reservation reserve, int requestedSeats)
    {
        this.reserve = reserve;
        this.requestedSeats = requestedSeats;
    }

    @Override
    public void run()
    {
        reserve.reserveSeat(requestedSeats); 
    }
}