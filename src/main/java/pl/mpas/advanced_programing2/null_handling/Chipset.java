package pl.mpas.advanced_programing2.null_handling;

public class Chipset {

    private String vendorName;

    public Chipset(String vendorName) {
        this.vendorName = vendorName;
    }

    @Override
    public String toString() {
        return "Chipset{" +
                "vendorName='" + vendorName + '\'' +
                '}';
    }

    public String getVendorName() {
        return vendorName;
    }
}
