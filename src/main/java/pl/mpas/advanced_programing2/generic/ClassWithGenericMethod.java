package pl.mpas.advanced_programing2.generic;

import java.math.BigDecimal;

public class ClassWithGenericMethod {

    private String maybeName;
    private double maybeIncome;
    private BigDecimal hugeNumber;

    public ClassWithGenericMethod(String maybeName, double maybeIncome, BigDecimal hugeNumber) {
        this.maybeName = genericValidator(maybeName);
        this.maybeIncome = genericValidator(maybeIncome);
        this.hugeNumber = genericValidator(hugeNumber);
    }

    private String validateString(String toCheck) {
        if (toCheck == null) {
            throw new RuntimeException("Cannot be null");
        }
        return toCheck;
    }

    private double validateDouble(Double toCheck) {
        if (toCheck == null) {
            throw new RuntimeException("Cannot be null");
        }
        return toCheck;
    }
    private<T> T genericValidator (T toCheck) {
        if (toCheck == null) {
            throw new RuntimeException();
        } return toCheck;
    }

}


