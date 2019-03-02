package pl.mpas.advanced_programing2.null_handling;

public class GraphicCard {

    private Chipset chipset;

    public GraphicCard(Chipset chipset) {
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "chipset=" + chipset +
                '}';
    }

    public Chipset getChipset() {
        return chipset;
    }
}
