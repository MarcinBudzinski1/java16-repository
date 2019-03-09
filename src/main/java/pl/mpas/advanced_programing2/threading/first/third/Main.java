package pl.mpas.advanced_programing2.threading.first.third;

public class Main {

    public static void main(String[] args) {

        Runnable job2 = () -> {
            for (int j =0; j<10; j++) {
                System.out.println(Thread.currentThread().getName() + " iteration " + (j + 1));
            }
        };

        Runnable job = () -> {
        for (int i = 0; i < 3; i++){
            Thread newWorker = new Thread(job2);
            newWorker.setName(Thread.currentThread().getName() + " daemon " + (i + 1));
            newWorker.setDaemon(true);
            newWorker.start();
            try {Thread.sleep(500);}catch (InterruptedException e){e.printStackTrace();}
        }};

        Thread worker1 = new Thread(job);
        Thread worker2 = new Thread(job);
        worker1.setPriority(Thread.MAX_PRIORITY);
        worker2.setPriority(Thread.MIN_PRIORITY);
        worker1.start();
        worker2.start();
    }
}
