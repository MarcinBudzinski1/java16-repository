package pl.mpas.advanced_programing2.abstract_class;

public class AnimalExample {
    public static void main(String[] args) {
        //utwórz Zoo
        //wyślij 3 zwierzęta w postaci klasy anonimowej
        Zoo myZoo = new Zoo();
        myZoo.handleAnimal(new Animal("Azor") {
            @Override
            public void eat() {
                System.out.println("Eating...");
            }

            @Override
            public void play() {

            }
        });
        myZoo.handleAnimal(new Animal("Burek") {
            @Override
            public void eat() {
                System.out.println("Eating...");
            }

            @Override
            public void play() {

            }
        });
        myZoo.handleAnimal(new Animal("Kot") {
            @Override
            public void eat() {
                System.out.println("Eating...");
            }

            @Override
            public void play() {

            }
        });
        Animal maybeCat;
        new Animal("cat") {
            @Override
            public void eat() {

            }

            @Override
            public void play() {

            }
            public void miauuu(){

            }
        }.miauuu();

    }

}
