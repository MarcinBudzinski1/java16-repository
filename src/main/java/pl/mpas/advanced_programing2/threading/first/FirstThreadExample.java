package pl.mpas.advanced_programing2.threading.first;

public class FirstThreadExample {

    public static void main(String[] args) {
        Runnable job = ( ) -> {
            System.out.println("Worker: " + Thread.currentThread().getName());
            System.out.println("Run Forest");
        };

        job.run();

        Thread worker = new Thread(job, "Pracuś");
        worker.start();

    }
}
