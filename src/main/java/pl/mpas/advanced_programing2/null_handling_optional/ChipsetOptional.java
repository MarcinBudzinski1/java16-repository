package pl.mpas.advanced_programing2.null_handling_optional;

import java.util.Optional;

public class ChipsetOptional {

    private String vendorName;

    @Override
    public String toString() {
        return "ChipsetOptional{" +
                "vendorName='" + vendorName + '\'' +
                '}';
    }

    public String getVendorName() {
        return vendorName;
    }

    public ChipsetOptional(String vendorName) {
        this.vendorName = vendorName;
    }
}
