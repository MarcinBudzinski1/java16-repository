package pl.mpas.advanced_programing2.generic;

public class MySecretGenericV1 {

    private Object object;

    public MySecretGenericV1(Integer valueOf) {
    }

    @Override
    public String toString() {
        return "MySecretGenericV1{" +
                "object=" + object +
                '}';
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
