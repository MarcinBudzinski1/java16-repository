package pl.mpas.advanced_programing2.threading.first.fourth;

class Job implements Runnable {
    private int toIncrement = 0;
    private static int staticIncrement = 0;

    static public void run2() {
        for (int i = 0 ; i < 10000; i++) {
            System.out.println("Increased by thread: " + Thread.currentThread().getName());
            synchronized (Job.class){
                staticIncrement++;}
        }
    }

    @Override
    public String toString() {
        return "toIncrement: " + toIncrement;
    }

    @Override
    synchronized public void run() {
        for (int i = 0 ; i < 10000; i++) {
            System.out.println("Increased by thread: " + Thread.currentThread().getName());
            synchronized (this){
            toIncrement++;}
        }
    }
}

public class IncrementExample2 {

    public static void main(String[] args) {
        Job job = new Job();

        Thread worker1 = new Thread(job, "janusz");
        Thread worker2 = new Thread(job, "andrzeju");
        worker1.start();
        worker2.start();

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Current job value: " + job);
    }

}
