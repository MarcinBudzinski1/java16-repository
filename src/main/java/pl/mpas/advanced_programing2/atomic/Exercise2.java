package pl.mpas.advanced_programing2.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exercise2 {

    // 3 wątki zwiększają zmienną typu long
    // wątek zwiększa zmienną co 500 ms
    // wątki używają synchronizacji
    // 1 wątek wypisuje (bez synchronizacji)
    // obserwujemy wyjście

    private static long counter = 0;
        public static void main(String[] args) {

            ExecutorService workers = Executors.newFixedThreadPool(4);

            Runnable job = () -> {
                long value;
                for (int i = 0; i < 500; i++) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (Exercise2.class) {
                        value = ++counter;
                    }
                    System.out.println(String.format("Current value: [%s], from thread: [%s]",
                            value, Thread.currentThread().getName()));

                }
            };
            Runnable showJob = () -> {
                while (counter < 1500) {
                    System.out.println("Value = " + counter);
                }
            };
        workers.execute(showJob);
        workers.execute(job);
        workers.execute(job);
        workers.execute(job);

            workers.shutdown();
            boolean done = false;
            do {
                try {
                    done = workers.awaitTermination(2, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (!done);
            System.out.println(counter);


    }
}
