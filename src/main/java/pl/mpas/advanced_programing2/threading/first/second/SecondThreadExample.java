package pl.mpas.advanced_programing2.threading.first.second;

public class SecondThreadExample {

    public static void main(String[] args) {

        Runnable job = ()-> {
            for (int i = 0; i < 8; i++){
                System.out.println("Run by: " + Thread.currentThread().getName() + ", iteration " + (i +1));
            }
        };

        Thread worker1 = new Thread(job);
        worker1.setDaemon(true);
        Thread worker2 = new Thread(job);
        worker2.setDaemon(true);
        worker1.start();
        worker2.start();
        System.out.println("End");

    }
}
