package Module5;

public class TicketReservation {
    private int availableSeats;

    public TicketReservation(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized void reserveSeat(int seats) {
        if (seats <= availableSeats) {
            System.out.println(Thread.currentThread().getName() + " reserved " + seats + " tickets.");
            availableSeats -= seats;
        } else {
            System.out.println(Thread.currentThread().getName() + " could not reserve " + seats + " tickets.");
        }
    }

    public static void main(String[] args) {
        TicketReservation reservation = new TicketReservation(25);
        Thread customer1 = new Thread(() -> reservation.reserveSeat(10), "Customer 1");
        Thread customer2 = new Thread(() -> reservation.reserveSeat(4), "Customer 2");
        Thread customer3 = new Thread(() -> reservation.reserveSeat(7), "Customer 3");
        Thread customer4 = new Thread(() -> reservation.reserveSeat(3), "Customer 3");
        Thread customer5 = new Thread(() -> reservation.reserveSeat(6), "Customer 3");

        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
        customer5.start();

        try {
            customer1.join();
            customer2.join();
            customer3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
