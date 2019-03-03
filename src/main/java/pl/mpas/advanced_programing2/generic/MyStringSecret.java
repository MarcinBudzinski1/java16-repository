package pl.mpas.advanced_programing2.generic;

public class MyStringSecret {

    private String secret;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "MyStringSecret{" +
                "secret='" + secret + '\'' +
                '}';
    }
}
