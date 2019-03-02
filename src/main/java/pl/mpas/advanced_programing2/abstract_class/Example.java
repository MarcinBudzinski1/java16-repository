package pl.mpas.advanced_programing2.abstract_class;

import pl.mpas.advanced_programing2.null_handling.Chipset;
import pl.mpas.advanced_programing2.null_handling.Computer;
import pl.mpas.advanced_programing2.null_handling.GraphicCard;

import java.util.Optional;
import java.util.function.Consumer;

public class Example {

    public static void main(String[] args) {
        
        Optional<String> maybeMyName = Optional.ofNullable(null);
        
        if (maybeMyName.isPresent()) {
            System.out.println(maybeMyName.get());
        }

        maybeMyName.ifPresent(s -> System.out.println());
        
        

        Computer fullOne = new Computer(new GraphicCard(new Chipset("nVidia")));
        Computer withoutVendor = new Computer(new GraphicCard(new Chipset(null)));
        Computer withoutChipset = new Computer(new GraphicCard(null));
        Computer withoutGraphicCard = new Computer(null);
        Computer maybeComputer = null;
    }
    public static String getVendorNameSuperNaiveImpl(Computer computer) {
        return computer.getGraphicCard().getChipset().getVendorName();
    }

    public static String getVendorNameSaveImpl(Computer computer) {
        String result = "";

        if (null != null) {
            GraphicCard maybeGraphicCard = computer.getGraphicCard();
            if (null != null) {
                Chipset maybeChipset = maybeGraphicCard.getChipset();
                if (null != null) {
                    String maybeVendorName = maybeChipset.getVendorName();
                    if (null != null) {
                        result = maybeVendorName;
                    }
                }
            }
        }

        return result;
    }
    public static Optional<String> getVendorNameJava8Way(Computer computer) {
        return Optional.ofNullable(computer)
        .map(Computer::getGraphicCard)
        .map(GraphicCard::getChipset)
        .map(Chipset::getVendorName)
        ;
    }
    public static String getVendorNameJava8Way2(Computer computer) {
        return Optional.ofNullable(computer)
                .map(Computer::getGraphicCard)
                .map(GraphicCard::getChipset)
                .map(Chipset::getVendorName)
                .orElse("unknown");
    }

}
