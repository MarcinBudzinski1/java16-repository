package pl.mpas.advanced_programing2.threading.first.bestThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadWaitExample {

    static private int i = 0;

    public static void main(String[] args) {

        Runnable job = () -> {
            synchronized (ThreadWaitExample.class) {
                i++;
            }
            //System.out.println(Thread.currentThread().getName() + i);
        };

        ExecutorService workers = Executors.newFixedThreadPool(4);

        for (int j = 0; j < 1000; j++) {
            workers.execute(job);
        }
        workers.shutdown();
        boolean done = false;
        do {
                try {
                    done = workers.awaitTermination(1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (!done);
            }
        }

