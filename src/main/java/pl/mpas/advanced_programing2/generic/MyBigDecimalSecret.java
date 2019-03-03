package pl.mpas.advanced_programing2.generic;

import java.math.BigDecimal;

public class MyBigDecimalSecret {

            private BigDecimal secret2;


    @Override
    public String toString() {
        return "MyBigDecimalSecret{" +
                "secret2=" + secret2 +
                '}';
    }

    public BigDecimal getSecret2() {
        return secret2;
    }

    public void setSecret2(BigDecimal secret2) {
        this.secret2 = secret2;
    }
}
