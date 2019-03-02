package pl.mpas.advanced_programing2;

public class ImieLambda {

    @FunctionalInterface
    interface ImieWiek {
        void doSomething(int wiek, String imie);

        default void someMethod1() {
            System.out.println("someMethod1");
        }
        default void someMethod2() {
            System.out.println("someMethod2");
        }

    }
    static void showImieWiek (ImieWiek imieWiek, int wiek, String imie) {
        imieWiek.doSomething(wiek, imie);
    }

    public static void main(String[] args) {
        showImieWiek((wiek, imie) -> System.out.println("" + wiek + wiek + " -- " + imie + imie), 5, "ala");
        showImieWiek((wiek, imie) -> System.out.println("" + wiek + wiek + wiek + " --- " + imie + imie + imie), 6, "jola");

        //alternatywa dla starszych wersji
        //showImieWiek((new ImieWiek() {
        //@Override
        //public void doSomething(int wiek, String imie) {

        //}
        //}),5, "wowa");

    }
}
