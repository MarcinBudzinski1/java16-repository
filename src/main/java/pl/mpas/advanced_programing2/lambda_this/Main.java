package pl.mpas.advanced_programing2.lambda_this;

public class Main {
    public void  move(){
        System.out.println("inside again");
    }

    private String name;

    public Moveable makeOne(){
        return new Moveable() {
            private String name = "Moveable";
            @Override
            public void move(){
                System.out.println("inside anonymous class - move");
                System.out.println("name = " + this.name);
                System.out.println(name);
                System.out.println("External name: " + Main.this.name);

            }

        };
    }
    public String getName(){
        return name;
    }

    public Moveable makeOneWithLambda(){
        String name = "haha";
        return () -> {
            System.out.println(this.name);
        };
        }
    public Main(String name) {
        this.name = name;

    }
    public static void main(String[] args) {

    }
}
