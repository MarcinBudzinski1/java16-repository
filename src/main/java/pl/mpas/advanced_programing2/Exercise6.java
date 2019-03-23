package pl.mpas.advanced_programing2;

public class Exercise6 {


    public static void main(String[] args) {
        Person first = new Person("M", "P", null);
        Person second = new Person("W", "S", null);

        System.out.println("Before");
        try {
            synchronized (first){first.wait(5000);}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
