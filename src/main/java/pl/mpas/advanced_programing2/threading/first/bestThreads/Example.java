package pl.mpas.advanced_programing2.threading.first.bestThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example {

    public static void main(String[] args) {

        Runnable job = () -> System.out.println("Performed by: " + Thread.currentThread().getName());

        ExecutorService workers = Executors.newFixedThreadPool(4);

        for (int i = 0; i<200; i++) {
            workers.execute(job);
        }
        System.out.println("after sending...");

        Runnable job2 = () -> System.out.println("przerwa");

        for (int i =0; i<50; i++){
            workers.execute(job2);
        }
        workers.shutdown();

    }
}
