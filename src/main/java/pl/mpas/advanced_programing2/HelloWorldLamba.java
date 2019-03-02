package pl.mpas.advanced_programing2;

public class HelloWorldLamba {

        interface Hello {
            void hello (String str);
        }

    public static void main(String[] args) {
        Hello refHello = (String str) -> System.out.println("Hello " + str);
        refHello.hello("World");
    }
    }

