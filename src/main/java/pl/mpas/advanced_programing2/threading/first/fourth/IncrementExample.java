package pl.mpas.advanced_programing2.threading.first.fourth;

public class IncrementExample{

    Job job = new Job();

    public void main(String[] args) {
        Thread worker1 = new Thread(job, "Janusz");
        Thread worker2 = new Thread(job, "Miłosz");
        worker1.start();
        worker2.start();
    }

}
