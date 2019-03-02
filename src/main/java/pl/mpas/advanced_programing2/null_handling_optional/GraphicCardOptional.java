package pl.mpas.advanced_programing2.null_handling_optional;

import java.util.Optional;

public class GraphicCardOptional {

    private ChipsetOptional chipsetOptional;

    @Override
    public String toString() {
        return "GraphicCardOptional{" +
                "chipsetOptional=" + chipsetOptional +
                '}';
    }

    public Optional<ChipsetOptional> getChipsetOptional() {
        return Optional.ofNullable(chipsetOptional);
    }

    public GraphicCardOptional(ChipsetOptional chipsetOptional) {
        this.chipsetOptional = chipsetOptional;
    }
}
