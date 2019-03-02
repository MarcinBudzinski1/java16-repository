package pl.mpas.advanced_programing2.null_handling_optional;

import java.util.Optional;

public class Example{

    public static void main(String[] args) {
        ComputerOptional fullOne = new ComputerOptional(new GraphicCardOptional(new ChipsetOptional("nVidia")));
        ComputerOptional withoutVendor = new ComputerOptional(new GraphicCardOptional(new ChipsetOptional(null)));
        ComputerOptional withoutChipset = new ComputerOptional(new GraphicCardOptional(null));
        ComputerOptional withoutGraphicCard = new ComputerOptional(null);
        ComputerOptional maybeComputer = null;
    }
    public static String getVendorNameJava8Way(ComputerOptional computerOptional) {

        return Optional.ofNullable(computerOptional)
                        .flatMap(ComputerOptional::getGraphicCardOptional)
                        .flatMap(GraphicCardOptional::getChipsetOptional)
                        .map(ChipsetOptional::getVendorName)
                        .orElseGet(() -> "brak");

    }

}
