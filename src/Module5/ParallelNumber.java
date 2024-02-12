package Module5;


public class ParallelNumber implements Runnable {
    private int[] numbers;
    private int start;
    private int end;
    private long result;

    public ParallelNumber(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public long getResult() {
        return result;
    }

    public void run() {
        long sum = 0;
        for (int i = start; i <= end; i++) {
            sum += numbers[i];
        }
        result = sum;
    }

    public static void main (String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numThreads = 4;

        int size = numbers.length / 4;
        int start = 0;
        int end = size - 1;

        ParallelNumber[] tasks = new ParallelNumber[numThreads];
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            if (i == numThreads - 1) {
                end = numbers.length - 1;
            }
            tasks[i] = new ParallelNumber(numbers, start, end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
            start += size;
            end += size;
        }

        long totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
                totalSum += tasks[i].getResult();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total sum: " + totalSum);
    }
}
