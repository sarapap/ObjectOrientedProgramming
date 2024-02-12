package Module5;

public class MultiThreadedNumber extends Thread {
    private int number;

    public MultiThreadedNumber(int number) {
        this.number = number;
    }

    public void printOdd() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd number: " + i);
            }
        }
    }

    public void printEven() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            }
        }
    }

    public static void main(String[] args) {
        MultiThreadedNumber printer = new MultiThreadedNumber(20);
        Thread odd = new Thread(printer::printOdd);
        Thread even = new Thread(printer::printEven);

        odd.start();
        even.start();

        try {
            odd.join();
            even.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Printing complete.");
    }
}



