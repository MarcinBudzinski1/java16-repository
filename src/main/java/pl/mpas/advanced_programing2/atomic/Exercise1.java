package pl.mpas.advanced_programing2.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise1 {

    //użyj Atomic Integer
    // 3 wątki - każdy zwiększa 100 razy o 1 atomica
    //wątek main czeka na zakończenie obliczeń
    //wypisuje wynik

    public static void main(String[] args) {

        AtomicInteger j = new AtomicInteger();
        ExecutorService workers = Executors.newFixedThreadPool(3);

        Runnable job;
        job = () -> {
            for (int i = 0; i < 100; i++) {
            int currentValue;
            do { currentValue = j.intValue();
            } while ( !j.compareAndSet(currentValue, currentValue + 1));
                System.out.println(Thread.currentThread().getName() + " " + j);

        }};

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
        System.out.println(j);
    }
}
