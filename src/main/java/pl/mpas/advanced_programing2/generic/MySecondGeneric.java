package pl.mpas.advanced_programing2.generic;

public class MySecondGeneric<T> {

    private T object;

    public MySecondGeneric(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
    @Override
    public String toString() {
        return "MySecondGeneric{" + "object=" + object + "}";
    }
}
